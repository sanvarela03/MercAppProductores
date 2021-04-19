package com.example.mercappproductores.viewModel.liveData

import androidx.lifecycle.LiveData
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class UsuarioFirebaseLiveData: LiveData<FirebaseUser>() {

    private val autenticacionFirebase = FirebaseAuth.getInstance()
    private val oyenteDeEstadoDeAutenticacion = FirebaseAuth.AuthStateListener { autenticacionFirebase -> value = autenticacionFirebase.currentUser }

    override fun onActive() {
        autenticacionFirebase.addAuthStateListener (oyenteDeEstadoDeAutenticacion)
    }
    override fun onInactive() {
        autenticacionFirebase.removeAuthStateListener (oyenteDeEstadoDeAutenticacion)
    }
}