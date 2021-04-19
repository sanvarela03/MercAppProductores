package com.example.mercappproductores.view

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.map
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.mercappproductores.R
import com.example.mercappproductores.databinding.FragmentProductosBinding
import com.example.mercappproductores.view.adapter.AdapterPersonalizadoProductos
import com.example.mercappproductores.viewModel.ProductosViewModel
import com.example.mercappproductores.viewModel.VerProductoViewModel


class ProductosFragment : Fragment() {

    private val productosViewModel : ProductosViewModel by lazy { ViewModelProvider(this).get(ProductosViewModel::class.java) }
    private val verProductoViewModel: VerProductoViewModel by lazy { ViewModelProvider(this).get(VerProductoViewModel::class.java) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        productosViewModel.controladorDeNavegacion = findNavController()
        val vinculacion = FragmentProductosBinding.inflate(inflater)
        vinculacion.lifecycleOwner = this
        vinculacion.viewModelProductos = productosViewModel
        vinculacion.theProductList.adapter = AdapterPersonalizadoProductos(this.context, productosViewModel.productos)

        vinculacion.theProductList.setOnItemClickListener { parent, view, position, id ->
            val producto = productosViewModel.productos.get(position)
            Log.d("wtf3","$producto")

            verProductoViewModel.producto = producto

            findNavController().navigate(R.id.verProductoFragment)
        }
        return vinculacion.root
    }

}