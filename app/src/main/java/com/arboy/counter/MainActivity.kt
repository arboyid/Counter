package com.arboy.counter

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import androidx.core.content.getSystemService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_increment.setOnClickListener{
            count ++
            textArea.text=count.toString()
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(50)
        }
        btn_decrement.setOnClickListener{
            count --
            textArea.text=count.toString()
            textArea.textColors.defaultColor
        }
        btn_reset.setOnClickListener {
            count = 0
            textArea.text=count.toString()
            textArea.textColors.defaultColor
        }
    }
}
