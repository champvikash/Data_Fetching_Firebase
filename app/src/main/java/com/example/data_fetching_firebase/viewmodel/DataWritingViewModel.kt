package com.example.data_fetching_firebase.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.data_fetching_firebase.model.MainModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class DataWritingViewModel : ViewModel()  {

    lateinit var firebaseDatabase: FirebaseDatabase
    lateinit var databaseReference: DatabaseReference
    private val _dataList = MutableLiveData<List<MainModel>>()

    val dataList: LiveData<List<MainModel>> get() = _dataList




    fun addUserDatabase(title: String, body: String) {

        val user = MainModel(title , body)
        firebaseDatabase = FirebaseDatabase.getInstance()
        databaseReference = firebaseDatabase.getReference("User")
        val newmsg = databaseReference.push()
        newmsg.setValue(user)
    }

}