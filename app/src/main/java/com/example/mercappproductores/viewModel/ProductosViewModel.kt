package com.example.mercappproductores.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import com.example.mercappproductores.R
import java.nio.file.Files

class ProductosViewModel: ViewModel() {
    var productos = mutableListOf<String>()
    init {
        for (i in 'a'..'z'){
            productos.add(i.toString())
        }
    }
    val Mensaje = "Mis productos"
    lateinit var  controladorDeNavegacion : NavController

    fun onCrearProducto(){
        controladorDeNavegacion.navigate(R.id.agregarProductoFragment)
    }

    fun onClickEnItemLista(){

    }


}