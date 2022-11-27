package com.example.rockpaperscissor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import androidx.core.os.HandlerCompat.postDelayed
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val topanim=AnimationUtils.loadAnimation(this,R.anim.top_animation)
        val middleanim=AnimationUtils.loadAnimation(this,R.anim.middle_animation)
        linear.startAnimation(topanim)
        splashIcon.startAnimation(middleanim)
//        val splash_time_out= 5000
        val homeIntent=Intent(this@SplashScreen,MainActivity::class.java)

//        handler =Handler()
        Handler().postDelayed({
            startActivity(homeIntent)
            finish()
        }, 3000)
    }
}