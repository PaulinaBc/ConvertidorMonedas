package mx.edu.utch.convertidormonedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    fun convertir(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val pesosString = editText.text.toString()
        val pesos = pesosString.toDoubleOrNull() ?: 0.0
        val dolares = pesos * 17.56
        val dolaresString = String.format("%.2f", dolares)
        val MNX = "MNX"
        val USD = "USD"
        val mensaje = "$pesosString $USD son $dolaresString $MNX"
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}