package com.uabc.edu.mx.holamundo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//Clase hereda de APP COMPAT ACTIVITY ..
//El activity es un componente de una aplicacion para
// realizar acciones en el dispostivo y como medio para interactuar
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Aqui se agrega el layout de la visualizacion de la pantalla
        setContentView(R.layout.activity_main)
        println("OnCreate!!!!!!!!")


        saludo.text="Soy el texto"
        leTexto.text="Soy otro texto"
        leTexto.setTextColor(Color.GREEN)
        leTexto.textSize=35f

    }

    override fun onStart() {
        println("OnStart!!!!!!!!")

        super.onStart()
    }
    override fun onPause() {
        println("OnPause!!!!!!!!")

        super.onPause()
    }

    override fun onRestart() {
        println("OnRestart!!!!!!!!")

        super.onRestart()
    }

    override fun onResume() {
        println("OnRestart!!!!!!!!")

        super.onResume()
    }

    override fun onDestroy() {
        println("OnDestroy!!!!!!!!")

        super.onDestroy()
    }

    override fun onStop() {
        println("OnStop!!!!!!!!")

        super.onStop()
    }

}
