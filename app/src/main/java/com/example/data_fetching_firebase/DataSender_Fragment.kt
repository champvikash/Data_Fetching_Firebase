package com.example.data_fetching_firebase

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.data_fetching_firebase.databinding.FragmentDataSenderBinding
import com.example.data_fetching_firebase.viewmodel.DataWritingViewModel


class DataSender_Fragment : Fragment() {
    private lateinit var binding: FragmentDataSenderBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDataSenderBinding.inflate(inflater, container, false)
        val viewModel = ViewModelProvider(requireActivity())[DataWritingViewModel::class.java]

        binding.add.setOnClickListener {
            val title: String = binding.edtTitle.text.toString()
            val body: String = binding.edtBody.text.toString()
            viewModel.addUserDatabase(title, body)
        }

        return binding.root
    }

}