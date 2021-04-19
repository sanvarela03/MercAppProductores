package com.example.mercappproductores.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.mercappproductores.databinding.FragmentNotificacionesBinding
import com.example.mercappproductores.view.adapter.AdapterPersonalizadoNotificaciones
import com.example.mercappproductores.viewModel.NotificacionesViewModel


class NotificacionesFragment : Fragment() {

    private val notificacionesViewModel : NotificacionesViewModel by lazy { ViewModelProvider(this).get(NotificacionesViewModel::class.java) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        notificacionesViewModel.controladorDeNavegacion = findNavController()
        val vinculacion = FragmentNotificacionesBinding.inflate(inflater)
        vinculacion.viewModelNotificaciones = notificacionesViewModel
        vinculacion.idListaDeNotificaciones.adapter = AdapterPersonalizadoNotificaciones(this.context, notificacionesViewModel.notificaciones)
        return vinculacion.root
    }

}