package com.example.mercappproductores.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mercappproductores.databinding.FragmentAgregarProductoBinding

class AgregarProductoFragment:Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val vinculacion = FragmentAgregarProductoBinding.inflate(inflater)
        vinculacion.lifecycleOwner = this

        return vinculacion.root
    }

}