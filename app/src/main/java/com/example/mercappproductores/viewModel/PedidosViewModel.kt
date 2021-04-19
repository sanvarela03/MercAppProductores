package com.example.mercappproductores.viewModel

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class PedidosViewModel : ViewModel() {

    val Mensaje = "Pedidos pendientes"

    lateinit var controladorDeNavegacion : NavController
    var pedidos = mutableListOf<String>()
    init {
        for (i in 'a'..'z'){
            pedidos.add(i.toString())
        }
    }

}