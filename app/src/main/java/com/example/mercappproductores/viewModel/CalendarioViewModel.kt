package com.example.mercappproductores.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController

class CalendarioViewModel : ViewModel() {

    val Mensaje = "Calendario de entregas"

    lateinit var controladorDeNavegacion : NavController
}