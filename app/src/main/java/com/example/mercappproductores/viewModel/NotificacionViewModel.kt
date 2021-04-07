package com.example.mercappproductores.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController

class NotificacionViewModel : ViewModel() {

    val Mensaje = "hola"
    lateinit var controladorDeNavegacion : NavController
}