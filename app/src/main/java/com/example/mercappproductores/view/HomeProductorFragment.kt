package com.example.mercappproductores.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.mercappproductores.R
import com.example.mercappproductores.databinding.FragmentHomeProductorBinding
import com.example.mercappproductores.viewModel.HomeProductorViewModel


class HomeProductorFragment : Fragment() {

    private val homeProductorViewModel : HomeProductorViewModel by lazy { ViewModelProvider(this).get(HomeProductorViewModel::class.java) }

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {

        val binding = FragmentHomeProductorBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.viewModelHomeProductor = homeProductorViewModel


        return binding.root
    }
}