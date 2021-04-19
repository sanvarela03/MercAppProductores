package com.example.mercappproductores.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.mercappproductores.R

class AdapterPersonalizadoPedidos(var contexto: Context?, var pedidosPendientes: MutableList<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return pedidosPendientes.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItem(position: Int): Any {
        return "TEST STRING"
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val layoutInflater = LayoutInflater.from(contexto)
        val filaPedidoPendiente = layoutInflater.inflate(R.layout.fila_pedido_pendiente, parent, false)

        val idPedido = filaPedidoPendiente.findViewById<TextView>(R.id.id_pedido_pendiente)

        idPedido.text = pedidosPendientes.get(position)

        return filaPedidoPendiente
    }
}