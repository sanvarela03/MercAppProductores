package com.example.mercappproductores.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.mercappproductores.R
import com.example.mercappproductores.databinding.FragmentProductoBinding
import com.example.mercappproductores.viewModel.ProductoViewModel


class ProductoFragment : Fragment() {

    private val productoViewModel : ProductoViewModel by lazy { ViewModelProvider(this).get(ProductoViewModel::class.java) }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        productoViewModel.controladorDeNavegacion = findNavController()
        val vinculacion = FragmentProductoBinding.inflate(inflater)
        vinculacion.lifecycleOwner = this
        vinculacion.viewModelProducto = productoViewModel

        return vinculacion.root
    }
}