package com.example.loeric.transitionprac

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.ImageView

class SecondActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        setContentView(R.layout.activity_second)

        val back: Button = findViewById(R.id.btn2)
        val test: Button = findViewById(R.id.btn3)
        val circle : ImageView = findViewById(R.id.imageView2)
        val circle2 : ImageView = findViewById(R.id.imageView3)
        val addTransitions = TransitionAnimationMethod()

        back.setOnClickListener {
            val i = Intent(this@SecondActivity, MainActivity::class.java)
            startActivity(i, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())

        }

        test.setOnClickListener {
            val i = Intent(this@SecondActivity, ThirdActivity::class.java)
            val sharedView : View = circle
            val transitionName : String = getString(R.string.blue_circle)
            val transitionActivityOptions= ActivityOptions.makeSceneTransitionAnimation(this@SecondActivity, sharedView, transitionName)



            startActivity(i, transitionActivityOptions.toBundle())
        }
        circle2.setOnClickListener {
            val i = Intent(this@SecondActivity, ThirdActivity::class.java)
            val sharedView : View = circle2
            val transitionName : String = getString(R.string.red_circle)
            val transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(this@SecondActivity, sharedView, transitionName)

            startActivity(i, transitionActivityOptions.toBundle())
        }


        setupWindowAnimations(addTransitions)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupWindowAnimations(addTransitions: TransitionAnimationMethod) {
//BounceInterpolator()  AnticipateOvershootInterpolator()  AnticipateInterpolator()
//        val explode1 = Explode()
//        explode1.duration = 1000
//        explode1.interpolator = BounceInterpolator()
//        val explode2 = Explode()
//        explode2.duration = 500
//        explode2.interpolator = AnticipateInterpolator()

        window.enterTransition = addTransitions.setExplodeTransitions("BounceInterpolator")
        window.exitTransition = addTransitions.setExplodeTransitions("AnticipateInterpolator")

    }
}