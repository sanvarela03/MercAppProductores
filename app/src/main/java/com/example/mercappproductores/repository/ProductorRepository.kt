package com.example.mercappproductores.repository

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.example.mercappproductores.network.model.Productor
import com.example.mercappproductores.network.retrofit.ProductorAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProductorRepository(val context : Context) {


    private val productor = MutableLiveData<Productor>()

    fun getProductor(email: String): MutableLiveData<Productor> {
        var productorAPI = ProductorAPI.create()
        val llamadaProductorAPI = productorAPI.getByEmail(email)

        llamadaProductorAPI.enqueue(object : Callback<Productor> {
            override fun onResponse(call: Call<Productor>, response: Response<Productor>) {
                val data = response.body()
                productor.value = data
            }

            override fun onFailure(call: Call<Productor>, t: Throwable) {
                Log.v("WTF-1", t.message.toString())
                Toast.makeText(context, "Error al acceder al API", Toast.LENGTH_SHORT).show()
            }
        }

        )

        return productor
    }
}