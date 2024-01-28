//package com.example.data_fetching_firebase.viewmodelfactory
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//import com.example.data_fetching_firebase.model.MainModel
//import com.example.data_fetching_firebase.viewmodel.DataWritingViewModel
//import com.example.data_fetching_firebase.viewmodel.MainViewModel
//
//class ViewModelFactory(private val mainRepo : MainModel) : ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
//            return MainViewModel(mainRepo) as T
//        }
//
//        throw IllegalArgumentException("View Model Class not found")
//    }
//}