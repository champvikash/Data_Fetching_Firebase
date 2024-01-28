//package com.example.data_fetching_firebase.repository
//
//import android.app.LauncherActivity
//import com.example.data_fetching_firebase.model.MainModel
//import com.google.firebase.database.FirebaseDatabase
//
//class MyRepository {
//
//    private val databaseRef = FirebaseDatabase.getInstance().getReference("items")
//
//    fun addItem(item: ArrayList<MainModel>) {
//        // Push a new item to the "items" node in Firebase
//        val newItemRef = databaseRef.push()
//        newItemRef.setValue(item)
//    }
//}