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

class MainViewModel : ViewModel() {

    private var databaseReference: DatabaseReference =
        FirebaseDatabase.getInstance().getReference("User")
    private val _dataList = MutableLiveData<List<MainModel>>()

    val dataList: LiveData<List<MainModel>> get() = _dataList

    init {
        fetchDataFromFirebase()
    }


    fun fetchDataFromFirebase() {
        databaseReference.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val data = mutableListOf<MainModel>()

                for (childSnapshot in snapshot.children) {
                    val value = childSnapshot.getValue(MainModel::class.java)
                    value?.let {
                        data.add(it)
                    }
                }

                _dataList.value = data
            }

            override fun onCancelled(error: DatabaseError) {
            }

        })
    }
}