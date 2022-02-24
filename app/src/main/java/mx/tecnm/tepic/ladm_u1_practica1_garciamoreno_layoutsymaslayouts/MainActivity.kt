package mx.tecnm.tepic.ladm_u1_practica1_garciamoreno_layoutsymaslayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.tecnm.tepic.ladm_u1_practica1_garciamoreno_layoutsymaslayouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ver.setOnClickListener {
            val ventanaTab = Intent(this,MainActivity2::class.java)
            startActivity(ventanaTab)
        }
        binding.opciones.setOnClickListener {
            val ventanaOpciones = Intent(this,SettingsActivity::class.java)
            startActivity(ventanaOpciones)
        }
    }


}