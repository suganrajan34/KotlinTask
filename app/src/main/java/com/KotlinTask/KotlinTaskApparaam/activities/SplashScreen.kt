package com.androidtutorialshub.KotlinTaskApparaam.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.androidtutorialshub.loginregisterkotlin.R


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val background=object : Thread(){
            override fun run() {
                try {
                    Thread.sleep(3000)
                    val intent = Intent (baseContext, LoginActivity::class.java)
                    startActivity(intent)
                }catch (e:Exception){
                    e.printStackTrace()
                }
            }
        }

background.start()
    }
}