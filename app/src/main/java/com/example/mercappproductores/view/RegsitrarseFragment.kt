package com.example.mercappproductores.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.mercappproductores.databinding.FragmentIniciarSesionBinding
import com.example.mercappproductores.databinding.FragmentRegsitrarseBinding
import com.example.mercappproductores.viewModel.ProductorViewModel
import com.example.mercappproductores.viewModel.RegistrarseViewModel


class RegsitrarseFragment : Fragment() {
    private val registrarseViewModel: RegistrarseViewModel by lazy {
        ViewModelProvider(this).get(RegistrarseViewModel::class.java)
    }
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding =  FragmentRegsitrarseBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.viewModelRegistrarse = registrarseViewModel

        return binding.root
    }


}