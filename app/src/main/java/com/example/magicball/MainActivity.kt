package com.example.magicball

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //запускаем функцию при нажатии на картинку
        magicBall.setOnClickListener() {
            answer()

        }
    }

    fun answer() {
        var messages = resources.getStringArray(R.array.messages) //array of mes
        var randomIndex: Int = Random.nextInt(messages.size)
        var msg = messages[randomIndex]
        //анимация для текстового эл экрана (появление ответа)
        var fadeInAnim = AnimationUtils.loadAnimation(this, android.R.anim.fade_in)
        message.startAnimation(fadeInAnim)
        //анимация тряска шарика

        //передаем значение текстовому элементу экрана
        message.text = msg

    }
    
}