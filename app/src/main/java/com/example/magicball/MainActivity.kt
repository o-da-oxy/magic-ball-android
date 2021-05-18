package com.example.magicball

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //запускаем функцию при нажатии на картинку
        var magicBall: ImageView = findViewById(R.id.magicBall)
        magicBall.setOnClickListener() {
            answer()
        }
    }

    fun answer() {
        var messages = resources.getStringArray(R.array.messages) //array of mes
        var randomIndex: Int = Random.nextInt(messages.size)
        var msg = messages[randomIndex]
        //передаем значение тексту
        var message: TextView = findViewById(R.id.message)
        message.text = msg

    }
    
}