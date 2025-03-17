package com.villanueva.alfonso

import android.widget.Toast
import android.content.Context
import android.content.Intent
import android.icu.text.DecimalFormat
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import coil3.load
import com.villanueva.alfonso.databinding.ActivityMainBinding
import kotlinx.coroutines.delay


class MainActivity : AppCompatActivity() {
    //Inicio
    //Variables
    var altura = 0.0
    var peso = 0.0
    var imc = 0.0
    var x = 0

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivGif.load("https://media1.tenor.com/m/bOF1MhmFG7oAAAAC/gawr-gura-roomba.gif")



        binding.btnCalcular.setOnClickListener {
            val pesoTexto = binding.etPeso.text.toString()
            val alturaTexto = binding.etAltura.text.toString()

            if (pesoTexto.isEmpty() || alturaTexto.isEmpty()) {
                camposVacios(this)
                //Cambio de imagen
                x ++
                if(x == 1){
                    binding.ivGif.load("https://media1.tenor.com/m/ij__sPU0KmgAAAAd/mumei-nanashi-mumei.gif")
                }
                if (x==10){
                    binding.ivGif.load("https://media1.tenor.com/m/wVe74xP_iukAAAAd/iroha-%E9%A2%A8%E7%9C%9F%E3%81%84%E3%82%8D%E3%81%AF.gif")
                }

            } else {
                altura = alturaTexto.toDouble()
                peso = pesoTexto.toDouble()
                calcularIMC()

                val intent = Intent(this, resultActivity::class.java)
                intent.putExtra("IMC", imc)
                startActivity(intent)
            }
        }
    }

    private fun calcularIMC(){
        imc = String.format("%.2f", peso / (altura * altura)).toDouble()
        //imc = peso / (altura * altura)
    }

    fun camposVacios(context: Context) {
        val toast = Toast.makeText(this, "Debes llenar todos los campos", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER, 0, 300)  // Centrado horizontal y verticalmente

        toast.show()

    }

}