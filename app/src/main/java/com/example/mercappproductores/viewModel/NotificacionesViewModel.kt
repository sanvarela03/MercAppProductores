package com.example.mercappproductores.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController

class NotificacionesViewModel : ViewModel() {

    val Mensaje = "Mis Notificaciones"
    lateinit var controladorDeNavegacion : NavController
    val notificaciones = mutableListOf<String>()
    init {
        for (i in 'a'..'z'){
            notificaciones.add(i.toString())
        }
    }
}