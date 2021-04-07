package com.example.mercappproductores.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.mercappproductores.R
import com.example.mercappproductores.databinding.FragmentNotificacionBinding
import com.example.mercappproductores.viewModel.NotificacionViewModel


class NotificacionFragment : Fragment() {

    private val notificacionViewModel : NotificacionViewModel by lazy {
        ViewModelProvider(this).get(NotificacionViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        notificacionViewModel.controladorDeNavegacion = findNavController()
       val vinculacion = FragmentNotificacionBinding.inflate(inflater)
        vinculacion.viewModelNotificacion= notificacionViewModel
        return vinculacion.root
    }

}