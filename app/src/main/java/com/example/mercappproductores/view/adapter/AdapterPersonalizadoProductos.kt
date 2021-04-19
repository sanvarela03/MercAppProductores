package com.example.mercappproductores.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.mercappproductores.R

class AdapterPersonalizadoProductos(var contexto: Context?, var productos: MutableList<String>) : BaseAdapter() {

    // responsable de cunatas filas tengo en my lista
    override fun getCount(): Int {
        return productos.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    //
    override fun getItem(position: Int): Any {
        return "TEST STRING"
    }

    //Responsable de renderizar cada fila
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val layoutInflater = LayoutInflater.from(contexto)
        val filaProducto = layoutInflater.inflate(R.layout.fila_producto, parent, false)


        val nombreProducto = filaProducto.findViewById<TextView>(R.id.the_product_name)
        nombreProducto.text = productos.get(position)


//            val description = productRow.findViewById<TextView>(R.id.the_product_description)
//            description.text = "Descripcion: ${products.get(position).descripcion}"
//
//            val precio = productRow.findViewById<TextView>(R.id.the_product_value)
//            precio.text = "Precio: ${products.get(position).precio}"
        return filaProducto
//            val textView = TextView(this.mContext)
//            textView.text = "HERE is my row for my list view"
//            return textView
    }
}