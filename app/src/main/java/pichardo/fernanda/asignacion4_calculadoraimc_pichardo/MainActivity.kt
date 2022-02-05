package pichardo.fernanda.asignacion4_calculadoraimc_pichardo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val weight: EditText = findViewById(R.id.weight)
        val height: EditText = findViewById(R.id.height)
        val calculate: Button = findViewById(R.id.calculate)
        var imc: TextView = findViewById(R.id.imc)
        val range: TextView = findViewById(R.id.range)

        calculate.setOnClickListener {

            var res:Double = 0.0

            var n1: Double = (weight.text.toString()).toDouble()

            var n2: Double = (height.text.toString()).toDouble()

            res = n1 / (n2*n2)
            var imcRes: String = res.toString()

            imc.setText(imcRes)

            if (res < 18.5){
                range.setText("Bajo peso")
                range.setBackgroundResource(R.color.colorGreenish)
            } else if(res >= 18.5 && res < 25){
                range.setText("Normal")
                range.setBackgroundResource(R.color.colorGreen)
            } else if (res >= 25 && res < 30){
                range.setText("Sobrepeso")
                range.setBackgroundResource(R.color.colorYellow)
            } else if (res >= 30 && res < 35){
                range.setText("Obesidad grado 1")
                range.setBackgroundResource(R.color.colorOrange)
            } else if (res >= 35 && res < 40){
                range.setText("Obesidad grado 2")
                range.setBackgroundResource(R.color.colorRed)
            } else {
                range.setText("Obesidad grado 3")
                range.setBackgroundResource(R.color.colorBrown)
            }
        }
    }
}




