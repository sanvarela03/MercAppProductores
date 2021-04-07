package com.example.mercappproductores.viewModel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.example.mercappproductores.network.model.Productor
import com.example.mercappproductores.repository.ProductorRepository

class ProductorViewModel : ViewModel() {

    private val _productor = MutableLiveData<String>()

    val productor: LiveData<String>
        get() = _productor


    init {
        getProductor()
    }

    fun getProductor() {
        _productor.value = "Holi :("
    }
}