package com.example.mercappproductores.viewModel

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.MediatorLiveData

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

import androidx.navigation.fragment.findNavController
import com.example.mercappproductores.MainActivity
import com.example.mercappproductores.R
import com.example.mercappproductores.view.Evento
import com.example.mercappproductores.view.IniciarSesionFragmentDirections

class IniciarSesionViewModel : ViewModel() {
    var foo = "Holaa <3"
    val mensaje = MutableLiveData<Evento<String>>()

    val usuario = MutableLiveData<String>("")
    val password = MutableLiveData<String>("")

    val esUsuarioValido = MediatorLiveData<Boolean>().apply {
        addSource(usuario){
            value = usuarioValido(it)
        }
    }


    lateinit var navController : NavController

    fun onIngresar() {

        mensaje.value = Evento("Click en ingresar | ${usuario.value} | ${password.value}")
    }

    fun onRegistrarse() {

        mensaje.value = Evento("Pase por aquí omegalul")

        navController.navigate(R.id.action_logInFragment_to_regsitrarseFragment)
        Log.d("wtf1","El nav -> $navController")
    }

    fun usuarioValido(usuario:String): Boolean{
        return usuario.length > 5
    }
}