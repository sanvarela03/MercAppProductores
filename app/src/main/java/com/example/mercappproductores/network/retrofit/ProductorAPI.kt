package com.example.mercappproductores.network.retrofit

import com.example.mercappproductores.network.model.Productor
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*



//const val BASE_URL = "http://192.168.0.108:8090/mercaleaf/productores/"

interface ProductorAPI {
    companion object Factory {
        fun create(): ProductorAPI {

            var retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            var service = retrofit.create(ProductorAPI::class.java)

            return service
        }
    }

    @POST("guardar")
    fun save(@Body productor: Productor): Call<Productor>

    @GET("obtener/{email}")
    fun getByEmail(@Path("email") email: String?): Call<Productor>

    @DELETE("borrar/{id}")
    fun delete(@Path("id") id: Long): Call<ResponseBody>
}