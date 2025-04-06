package com.villanueva.alfonso

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.villanueva.alfonso.adapter.miAdapter
import com.villanueva.alfonso.data.Gato

class RecyclerViewTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view_test)

        val gato1= Gato("URL","Hola")
        //Crear varios y hacer arreglo

        //val miAdaptador = miAdapter(//nombre arreglo)

        val miRecycler: RecyclerView = findViewById(R.id.rvMain)

        miRecycler.layoutManager = LinearLayoutManager(this)
        //miRecycler.layoutManager = GridLayoutManager(this,2)
        //miRecycler.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        //miRecycler.adapter = miAdapter


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}