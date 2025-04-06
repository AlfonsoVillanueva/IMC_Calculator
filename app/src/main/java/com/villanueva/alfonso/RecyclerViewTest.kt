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
import com.villanueva.alfonso.adapter.MiAdaptador
import com.villanueva.alfonso.data.Gato

class RecyclerViewTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view_test)

        val gato1= Gato("https://i.pinimg.com/736x/2e/2d/b3/2e2db3394efa67302e2da1deb676839b.jpg","Siiinnn")
        val gato2= Gato("https://i.pinimg.com/736x/2e/2d/b3/2e2db3394efa67302e2da1deb676839b.jpg","Armis #D lets go")
        val gato3= Gato("https://i.pinimg.com/736x/2e/2d/b3/2e2db3394efa67302e2da1deb676839b.jpg","Shiorin")
        val gato4= Gato("https://i.pinimg.com/736x/2e/2d/b3/2e2db3394efa67302e2da1deb676839b.jpg","Hola")

        val prueba = arrayOf(gato1,gato2,gato3,gato4)

        val miAdaptador =MiAdaptador(prueba)

        val miRecycler: RecyclerView = findViewById(R.id.rvMain)

        miRecycler.layoutManager = LinearLayoutManager(this)
        //miRecycler.layoutManager = GridLayoutManager(this,2)
        //miRecycler.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        //miRecycler.adapter = miAdapter


    }
}