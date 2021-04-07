package com.example.mercappproductores.network.model

import com.example.mercappproductores.network.model.Rol


open class Usuario(val idUsuario: Long) {

    var nombre: String = ""
    var apellido: String = ""
    var email: String = ""
    var fechaNacimiento: String = ""
    var createAt: String = ""
    var rol: Rol
    var direccion: String = ""
    var nombreUsuario: String = ""
    var password: String = ""
    var foto: String = ""

    init {
        this.rol = Rol(3, "productor")
    }

}