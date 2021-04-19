package com.example.mercappproductores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import androidx.activity.viewModels
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.mercappproductores.databinding.ActivityMainBinding
import com.example.mercappproductores.databinding.HeaderDelMenuDesplegableIzquierdoBinding
import com.example.mercappproductores.viewModel.HomeProductorViewModel
import com.example.mercappproductores.viewModel.IniciarSesionViewModel

class MainActivity : AppCompatActivity() {
    private val homeProductorViewModel : HomeProductorViewModel by lazy { ViewModelProvider(this).get(HomeProductorViewModel::class.java) }

    private val iniciarSesionViewModel by viewModels<IniciarSesionViewModel>()

    private lateinit var controladorDeNavegacion: NavController

    private lateinit var vinculacionConVistaPrincipal : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        vinculacionConVistaPrincipal = ActivityMainBinding.inflate(layoutInflater)
        setTheme(R.style.Theme_MercAppProductores)

        setContentView(vinculacionConVistaPrincipal.root)

//      Obtiene el controlador de navegacion
        val anfitrion: NavHostFragment = supportFragmentManager.findFragmentById(R.id.my_anfitrion_de_navegacion_de_fragmentos) as NavHostFragment? ?: return
        controladorDeNavegacion = anfitrion.navController

        configurarMenuSuperior()
        configurarMenuNavegacionInferior()
        configurarMenuDesplegableIzquierdo()
        controlDeVisualizacionDeMenus()
        observarEstadoDeAutenticacion()
    }

    fun observarEstadoDeAutenticacion(){
            iniciarSesionViewModel.estadoDeAutenticacion.observe(this, Observer { estadoDeAutenticacion ->
            when(estadoDeAutenticacion){
                IniciarSesionViewModel.EstadoDeAutenticacion.AUTENTICADO -> {
//                    si esta autenticado mostrar menu inferior, lateral y superior junto con


                }
//                IniciarSesionViewModel.EstadoDeAutenticacion.NO_AUTENTICADO ->{
//
//                    controladorDeNavegacion.navigate(R.id.iniciarSesionFragmentID)
//
//                }
                else -> {
                    controladorDeNavegacion.navigate(R.id.iniciarSesionFragmentID)
                }
            }
        })

    }

    private fun obtenerVistaDelHeader(inflater: LayoutInflater): View{
        //Inflar la vista del header
        val vinculo = HeaderDelMenuDesplegableIzquierdoBinding.inflate(layoutInflater)
        //Configurar el header del menu izquierdo
        vinculo.lifecycleOwner = this
        vinculo.viewModelProductor = homeProductorViewModel

        val vista = vinculo.root

        return vista
    }

    fun configurarMenuNavegacionInferior(){
        vinculacionConVistaPrincipal.bottomNavView.setupWithNavController(controladorDeNavegacion)
    }

    fun configurarMenuDesplegableIzquierdo(){
        vinculacionConVistaPrincipal.idVistaNavegacion.addHeaderView(obtenerVistaDelHeader(layoutInflater))

//        Listeners
        vinculacionConVistaPrincipal.idVistaNavegacion.setNavigationItemSelectedListener { menuItem ->

            var b = false
            when(menuItem.itemId){
                R.id.id_item_mi_cuenta -> {
                    controladorDeNavegacion.navigate(R.id.cuentaFragment)
                    b = true
                }

                R.id.id_item_cerrar_sesion -> {
                    controladorDeNavegacion.navigate(R.id.iniciarSesionFragmentID)
                    b = true
                }
                R.id.id_item_historial_pedidos-> {
                    controladorDeNavegacion.navigate(R.id.historialDePedidosFragment)
                    b = true
                }
                R.id.id_item_ayuda-> {

                    controladorDeNavegacion.navigate(R.id.fragmentAyuda)
                    b = true
                }
            }
            vinculacionConVistaPrincipal.drawerLayout.closeDrawer(GravityCompat.START)
            b
        }
    }

    fun configurarMenuSuperior(){
        vinculacionConVistaPrincipal.topAppBar.setNavigationOnClickListener {
            vinculacionConVistaPrincipal.drawerLayout.openDrawer(Gravity.LEFT)
        }
    }

    fun controlDeVisualizacionDeMenus(){
        controladorDeNavegacion.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.iniciarSesionFragmentID){
                vinculacionConVistaPrincipal.bottomNavView.visibility = View.GONE
                vinculacionConVistaPrincipal.topAppBar.visibility = View.GONE
                vinculacionConVistaPrincipal.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            }else{
                vinculacionConVistaPrincipal.bottomNavView.visibility = View.VISIBLE
                vinculacionConVistaPrincipal.topAppBar.visibility = View.VISIBLE
                vinculacionConVistaPrincipal.idVistaNavegacion.isEnabled = true
                vinculacionConVistaPrincipal.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
            }
        }
    }

}
