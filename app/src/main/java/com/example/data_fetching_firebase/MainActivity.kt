package com.example.data_fetching_firebase

import android.app.LauncherActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.data_fetching_firebase.databinding.ActivityMainBinding
import com.example.data_fetching_firebase.viewmodel.MainViewModel
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        supportFragmentManager.beginTransaction().apply {
            replace(b.frame1.id, DataSender_Fragment())
            commit()
        }



        supportFragmentManager.beginTransaction().apply {
            replace(b.frame2.id, DataReader_Fragment())
            commit()
        }









    }



}