package com.example.mercappproductores.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mercappproductores.databinding.FragmentHistorialDePedidosBinding

class HistorialDePedidosFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val vinculo = FragmentHistorialDePedidosBinding.inflate(inflater)
        vinculo.lifecycleOwner = this

        return vinculo.root
    }
}