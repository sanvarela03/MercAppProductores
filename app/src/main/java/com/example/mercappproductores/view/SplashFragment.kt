package com.example.mercappproductores.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.mercappproductores.R
import com.example.mercappproductores.databinding.FragmentSplashBinding
import com.example.mercappproductores.viewModel.SplashViewModel

class SplashFragment : Fragment() {

    private val TIEMPO_ESPERA_SPLASH:Long = 1000 // 1 segundo

    private val splashViewModel: SplashViewModel by lazy {
        ViewModelProvider(this).get(SplashViewModel::class.java)
    }

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val vinculacion = FragmentSplashBinding.inflate(inflater)
        vinculacion.lifecycleOwner = this
        vinculacion.viewModelSplash = splashViewModel
        return vinculacion.root
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({actualizarInterfazUsuario()},TIEMPO_ESPERA_SPLASH)
    }

    private fun actualizarInterfazUsuario() {
        findNavController().popBackStack()
        findNavController().navigate(R.id.iniciarSesionFragmentID)
    }

}