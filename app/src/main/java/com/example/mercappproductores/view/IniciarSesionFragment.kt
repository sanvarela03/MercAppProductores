package com.example.mercappproductores.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.mercappproductores.databinding.FragmentIniciarSesionBinding
import com.example.mercappproductores.viewModel.IniciarSesionViewModel


class IniciarSesionFragment : Fragment() {

    private val iniciarSesionViewModel : IniciarSesionViewModel by lazy { ViewModelProvider(this).get(IniciarSesionViewModel::class.java) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        observarEventos()
        iniciarSesionViewModel.navController = findNavController()
        val vinculacion = FragmentIniciarSesionBinding.inflate(inflater)
        vinculacion.lifecycleOwner = this
        vinculacion.viewModelIniciarSesion = iniciarSesionViewModel


        // Inflate the layout for this fragment
        return vinculacion.root
    }

    fun observarEventos(){
        iniciarSesionViewModel.mensaje.observe(this, Observer { evento ->
            evento.getContenidoSiNoHaSidoManejadoORDevuelveNull()?.let {
                Toast.makeText(this.context, it, Toast.LENGTH_SHORT).show()
            }
        })
    }

}