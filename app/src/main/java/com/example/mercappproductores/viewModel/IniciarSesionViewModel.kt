package com.example.mercappproductores.viewModel

import android.util.Log
import androidx.lifecycle.*

import androidx.navigation.NavController

import com.example.mercappproductores.R
import com.example.mercappproductores.view.utilities.Evento
import com.example.mercappproductores.viewModel.liveData.UsuarioFirebaseLiveData

class IniciarSesionViewModel : ViewModel() {

    enum class EstadoDeAutenticacion {
        AUTENTICADO, NO_AUTENTICADO, AUTENTICACION_INVALIDA
    }

    val estadoDeAutenticacion = UsuarioFirebaseLiveData().map { usuario ->

        if (true){
            EstadoDeAutenticacion.AUTENTICADO
        }else{
            EstadoDeAutenticacion.NO_AUTENTICADO
        }

    }

    var foo = "Holaa <3"
    val mensaje = MutableLiveData<Evento<String>>()

    val usuario = MutableLiveData<String>("")
    val password = MutableLiveData<String>("")

    val esUsuarioValido = MediatorLiveData<Boolean>().apply {
        addSource(usuario) {
            value = usuarioValido(it)
        }
    }


    lateinit var navController: NavController

    fun onIngresar() {

        mensaje.value = Evento("Click en ingresar | ${usuario.value} | ${password.value}")

        navController.navigate(R.id.productosFragment)
    }

    fun noAutenticado(){
        mensaje.value = Evento("NO AUTENTICADO !!!!!!")
    }

    fun onRegistrarse() {

        mensaje.value = Evento("Pase por aquí omegalul")

        navController.navigate(R.id.regsitrarseFragment)
        Log.d("wtf1", "El nav -> $navController")
    }

    fun usuarioValido(usuario: String): Boolean {
        return usuario.length > 5
    }
}