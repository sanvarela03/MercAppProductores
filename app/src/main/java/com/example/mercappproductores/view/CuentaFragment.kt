package com.example.mercappproductores.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mercappproductores.databinding.FragmentCuentaBinding

class CuentaFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val vinculacion = FragmentCuentaBinding.inflate(inflater)
        vinculacion.lifecycleOwner = this
        return vinculacion.root
    }
}