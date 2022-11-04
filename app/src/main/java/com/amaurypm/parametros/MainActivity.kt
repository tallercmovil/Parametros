package com.amaurypm.parametros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.amaurypm.parametros.model.Alumno
import com.amaurypm.parametros.model.Alumno2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        val intent = Intent(this, MainActivity2::class.java)

        val alumno1 = Alumno(3,"Héctor", "Local")
        val alumno2 = Alumno2(8,"Valeria", "Extranjero")

        val parametros = Bundle()

        parametros.putString("nombre", "Amaury")
        parametros.putInt("sesion", 12345)
        parametros.putSerializable("alumno", alumno1)
        parametros.putParcelable("alumno2", alumno2)

        intent.putExtras(parametros)

        startActivity(intent)
    }
}