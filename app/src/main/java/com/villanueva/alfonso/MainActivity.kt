package com.villanueva.alfonso

import android.widget.Toast
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import coil3.load
import com.villanueva.alfonso.databinding.ActivityMainBinding


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
                binding.ivGif.load("https://media1.tenor.com/m/dQ37CGSZ73QAAAAd/gawr-gura-holo-live.gif")
                x ++
                if (x>=10){
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
        imc = peso / (altura * altura)
    }

    fun camposVacios(context: Context) {
        Toast.makeText(context, "Debes llenar todos los campos", Toast.LENGTH_SHORT).show()
    }

}