package com.villanueva.alfonso

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil3.load
import com.villanueva.alfonso.databinding.ActivityResultBinding

class resultActivity : AppCompatActivity() {
    private lateinit var binding:ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val paqueteDeDatos = intent.extras
        val imc = paqueteDeDatos?.getDouble("IMC")
        binding.tvImc.text = "Su indice de masa corporal es de: $imc kg/m²"


        if(imc!! < 18.5){
            //Peso bajo
            binding.tvImcText.text = "Peso bajo"
            binding.ivGif2.load("https://media1.tenor.com/m/Ssfj2DOGJhAAAAAC/filian-vtuber.gif")
        }else if (imc > 18.5 && imc < 24.9){
            //Peso normal
            binding.tvImcText.text = "Peso Normal"
            binding.ivGif2.load("https://media1.tenor.com/m/aFbvUkn8djMAAAAd/hoshimi-miyabi-zzz.gif")
        }else if (imc > 24.9){
            //Sobrepeso
            binding.tvImcText.text = "Sobrepeso"
            binding.ivGif2.load("https://media1.tenor.com/m/PKK3rFXaUXsAAAAd/spongebob-dokibird.gif")
        }

        binding.btnRegresar.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }


}
