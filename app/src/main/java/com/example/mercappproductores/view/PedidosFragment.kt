package com.example.mercappproductores.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.mercappproductores.R
import com.example.mercappproductores.databinding.FragmentCalendarioBinding
import com.example.mercappproductores.databinding.FragmentPedidosBinding
import com.example.mercappproductores.viewModel.PedidosViewModel

class PedidosFragment : Fragment() {

    private val pedidosViewModel: PedidosViewModel by lazy {
        ViewModelProvider(this).get(PedidosViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        pedidosViewModel.controladorDeNavegacion = findNavController()
        val vinculacion = FragmentPedidosBinding.inflate(inflater)
        vinculacion.viewModelPedidos = pedidosViewModel

        return vinculacion.root

    }


}