package com.amaurypm.parametros

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.amaurypm.parametros.model.Alumno
import com.amaurypm.parametros.model.Alumno2
import com.amaurypm.parametros.model.Alumno4
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class MainActivity : AppCompatActivity() {

    private lateinit var mp: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*mp = MediaPlayer.create(this, R.raw.zelda)
        mp.start()*/
        Log.d("CICLOVIDA", "onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("CICLOVIDA", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CICLOVIDA", "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CICLOVIDA", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CICLOVIDA", "onDestroy")
    }

    override fun onPause() {
        super.onPause()
        //mp.pause()
        Log.d("CICLOVIDA", "onPause")

    }

    override fun onRestart() {
        super.onRestart()
        //mp.start()
        Log.d("CICLOVIDA", "onRestart")
    }

    fun click(view: View) {
        val intent = Intent(this, MainActivity2::class.java)

        val alumno1 = Alumno(3,"Héctor", "Local")
        val alumno2 = Alumno2(8,"Valeria", "Extranjero")
        val alumno4 = Alumno4(9, "Daniel", "Local")

        val parametros = Bundle()

        parametros.putString("nombre", "Amaury")
        parametros.putInt("sesion", 12345)
        parametros.putSerializable("alumno", alumno1)
        parametros.putParcelable("alumno2", alumno2)

        intent.putExtras(parametros)

        startActivity(intent)
        Animatoo.animateZoom(this)
    }
}