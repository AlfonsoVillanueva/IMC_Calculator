package com.villanueva.alfonso.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil3.load
import com.villanueva.alfonso.R
import com.villanueva.alfonso.data.Gato

//Ca,biar arryt por la mutable list cuando jale
//Checar video del cordi
class MiAdaptador (private val dataSet:Array<Gato>): RecyclerView.Adapter<MiAdaptador.ViewHolder>(){
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        val ivFoto: ImageView
        val ivMensaje: TextView

        init {
            ivFoto=view.findViewById(R.id.ivFoto)
            ivMensaje=view.findViewById(R.id.ivMensaje)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context). inflate(R.layout.activity_item_view,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ivMensaje.text=dataSet[position].mensage
        holder.ivFoto.load(dataSet[position].imagen)
    }


}