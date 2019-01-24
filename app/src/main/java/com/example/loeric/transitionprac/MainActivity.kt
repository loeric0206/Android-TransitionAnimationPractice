package com.example.loeric.transitionprac

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.view.Window
import android.widget.Button

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        setContentView(R.layout.activity_main)
        val addTransition = TransitionAnimationMethod()

//        setupTransition()

        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            val i = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(i, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
        }

        setupWindowAnimation(addTransition)

    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupWindowAnimation(addTransition: TransitionAnimationMethod?) {

        window.enterTransition = addTransition!!.setSlideTransitions("start")
        window.exitTransition = addTransition.setSlideTransitions("end")

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
