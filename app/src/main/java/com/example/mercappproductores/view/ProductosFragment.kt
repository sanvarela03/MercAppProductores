package com.example.mercappproductores.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.mercappproductores.R
import com.example.mercappproductores.databinding.FragmentProductosBinding
import com.example.mercappproductores.viewModel.ProductosViewModel


class ProductosFragment : Fragment() {

    private val productosViewModel : ProductosViewModel by lazy {
        ViewModelProvider(this).get(ProductosViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        productosViewModel.controladorDeNavegacion = findNavController()
        val vinculacion = FragmentProductosBinding.inflate(inflater)
        vinculacion.viemModelProducto= productosViewModel

        return vinculacion.root
    }

}