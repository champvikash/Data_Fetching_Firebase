package com.example.data_fetching_firebase

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.data_fetching_firebase.model.MainModel


class UserAdater(private val context: Context, val userList: List<MainModel>) :
    RecyclerView.Adapter<UserAdater.UserViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {

        val view: View =
            LayoutInflater.from(context).inflate(R.layout.main_layout_res, parent, false)
        return UserViewHolder(view)

    }

    override fun getItemCount(): Int {

        return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        val currentName = userList[position]

        holder.textName.text = currentName.title
        holder.textName.text = currentName.body

        holder.itemView.setOnClickListener {
        }
    }

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textName = itemView.findViewById<TextView>(R.id.title)


    }

}