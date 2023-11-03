package com.arshdeep.week9app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import java.util.Calendar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val datePi = findViewById<DatePicker>(R.id.date) as DatePicker

        val calendar : Calendar = Calendar.getInstance()

        datePi.init(calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)


        ) { view, year,monthofyear, dayofMonth ->
            Toast.makeText(
                applicationContext,
                "#" + datePi.year +"-"+datePi.month+"-" + datePi.dayOfMonth + "/", Toast.LENGTH_LONG
            ).show()
        }
    }
}