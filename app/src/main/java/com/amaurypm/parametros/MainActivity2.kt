package com.amaurypm.parametros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.amaurypm.parametros.model.Alumno
import com.amaurypm.parametros.model.Alumno2

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras

        val nombre = bundle?.getString("nombre", "")
        val sesion = bundle?.getInt("sesion", 0)

        val alumno = bundle?.getSerializable("alumno") as Alumno
        val alumno2 = bundle?.getParcelable<Alumno2>("alumno2")


        Toast.makeText(this, "El nombre recibido del Activity 1 es: $nombre", Toast.LENGTH_LONG)
            .show()

        Toast.makeText(this, "El número de sesión es: $sesion", Toast.LENGTH_LONG)
            .show()

        if(alumno!=null){
            Toast.makeText(this, "El nombre objeto alumno recibido es ${alumno.nombre} con tipo: ${alumno.tipo}", Toast.LENGTH_LONG).show()
        }

        Toast.makeText(this, "El nombre objeto alumno2 recibido es ${alumno2?.nombre} con tipo: ${alumno2?.tipo}", Toast.LENGTH_LONG).show()


    }

    fun click(view: View) {
        startActivity(Intent(this, MainActivity3::class.java))
    }
}