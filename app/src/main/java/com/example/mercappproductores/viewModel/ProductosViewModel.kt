package com.example.mercappproductores.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import java.nio.file.Files

class ProductosViewModel: ViewModel() {

    val Mensaje = "hola"
   lateinit var  controladorDeNavegacion : NavController
}