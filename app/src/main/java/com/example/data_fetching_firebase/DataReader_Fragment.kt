package com.example.data_fetching_firebase

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.data_fetching_firebase.databinding.FragmentDataReaderBinding
import com.example.data_fetching_firebase.viewmodel.MainViewModel


class DataReader_Fragment : Fragment() {
    private lateinit var binding: FragmentDataReaderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDataReaderBinding.inflate(layoutInflater , container , false)



val mainViewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]

        mainViewModel.dataList.observe(viewLifecycleOwner, Observer {data->
            println("data list size $data")
        })

        return binding.root
    }

}