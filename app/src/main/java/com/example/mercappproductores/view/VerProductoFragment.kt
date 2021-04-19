package com.example.mercappproductores.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mercappproductores.databinding.FragmentVerProductoBinding
import com.example.mercappproductores.viewModel.PedidosViewModel
import com.example.mercappproductores.viewModel.VerProductoViewModel

class VerProductoFragment: Fragment() {

    private val verProductoViewModel: VerProductoViewModel by lazy { ViewModelProvider(this).get(VerProductoViewModel::class.java) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val vinculacion = FragmentVerProductoBinding.inflate(inflater)
        vinculacion.lifecycleOwner = this
        vinculacion.verProductoViewModel = verProductoViewModel
        return vinculacion.root
    }
}