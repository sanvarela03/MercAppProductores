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
import com.example.mercappproductores.viewModel.CalendarioViewModel
class CalendarioFragment : Fragment() {
    private val calendarioViewModel : CalendarioViewModel by lazy {
    ViewModelProvider(this).get(CalendarioViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        calendarioViewModel.controladorDeNavegacion = findNavController()
        val vinculacion = FragmentCalendarioBinding.inflate(inflater)
        vinculacion.viewModelCalendario = calendarioViewModel

                return vinculacion.root
    }


}