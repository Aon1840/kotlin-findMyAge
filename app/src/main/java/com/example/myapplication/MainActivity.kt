package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit.setOnClickListener{
            val text = edtYear.text.toString().toInt()
            if (text == 0) {
                Toast.makeText(this,"Input invalid please try again",Toast.LENGTH_LONG).show()
            }
            calMyAge(text)
        }

//        btnSubmit.setOnClickListener(View.OnClickListener {
//
//        })
    }

    fun calMyAge(year:Int){
        try {
            val yearCarlendar:Int = Calendar.getInstance().get(Calendar.YEAR)
            val result = yearCarlendar - year
            tvMessage.text = "Your age: $result"
        } catch (ex:Exception) {
            Toast.makeText(this,"Input invalid please try again",Toast.LENGTH_LONG).show()
        }

    }
}


