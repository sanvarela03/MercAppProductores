package com.example.mercappproductores.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.mercappproductores.R

class AdapterPersonalizadoNotificaciones(var contexto: Context?, var notificaciones: MutableList<String>)  : BaseAdapter(){

    override fun getCount(): Int {
        return notificaciones.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItem(position: Int): Any {
        return "TEST STRING"
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val layoutInflater = LayoutInflater.from(contexto)
        val filaNotificacion = layoutInflater.inflate(R.layout.fila_notificacion, parent, false)

        val estadoPedido = filaNotificacion.findViewById<TextView>(R.id.id_estado_pedido_notificacion)
        val descripcionNotificacion = filaNotificacion.findViewById<TextView>(R.id.id_descripcion_notificacion)
        estadoPedido.text = notificaciones.get(position)

        return filaNotificacion
    }
}
