package com.example.loeric.transitionprac

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.view.animation.FastOutSlowInInterpolator
import android.transition.Slide
import android.view.Gravity
import android.view.Window
import android.widget.Button

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        setContentView(R.layout.activity_main)

//        setupTransition()



        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            val i = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(i, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
        }
        setupWindowAnimation()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupWindowAnimation() {
        val slide1  = Slide(Gravity.START)
        slide1.duration = 500
        window.enterTransition = slide1
        window.exitTransition = slide1
//        window.allowEnterTransitionOverlap = false
//        window.allowReturnTransitionOverlap = false
    }

//    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
//    private fun setupTransition() {
//        val slide = Slide(Gravity.LEFT)
//        slide.duration = 2000
//        slide.interpolator = FastOutSlowInInterpolator()
//        window.exitTransition = slide
//
//    }
}
