package com.example.mercappproductores.view

open class Evento<out T> (private val contenido : T){
    var haSidoManejado = false
        private set
    fun getContenidoSiNoHaSidoManejadoORDevuelveNull(): T? {
        return if (haSidoManejado){
            null
        }else{
            haSidoManejado = true
            contenido
        }
    }

    fun mirarContenido() : T = contenido
}