package cl.example.myloginpage2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ImgLogo = findViewById<ImageView>(R.id.imgLogo)
        Picasso.get()
            .load("http://blog.desafiolatam.com/wp-content/uploads/2015/03/desafio-latam-logonegro.png")
            .into(ImgLogo)

        val btnIngresar = findViewById<Button>(R.id.btn)
        btnIngresar.setOnClickListener {
            Toast.makeText(applicationContext, "Usuario ingresado con exito", Toast.LENGTH_SHORT)
                .show()
        }
    }
}