package com.example.mercappproductores.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mercappproductores.databinding.FragmentAyudaBinding


class FragmentAyuda: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val vinculacion = FragmentAyudaBinding.inflate(inflater)

        vinculacion.lifecycleOwner = this

        return vinculacion.root
    }

}