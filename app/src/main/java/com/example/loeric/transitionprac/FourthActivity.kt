package com.example.loeric.transitionprac

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.transition.Fade
import android.transition.Slide
import android.transition.Transition
import android.view.*
import android.view.animation.Interpolator
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_four.*

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class FourthActivity : AppCompatActivity(){

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        setContentView(R.layout.activity_four)
//        reveal()


//        setupWindowAnimation()



    }

//    private fun reveal() {
//        // previously visible view
//        val myView: View = findViewById(R.id.rootLayout)
//
//// Check if the runtime version is at least Lollipop
//        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.LOLLIPOP) {
//            // get the center for the clipping circle
//            val cx = myView.width / 2
//            val cy = myView.height / 2
//
//            // get the initial radius for the clipping circle
//            val initialRadius = Math.hypot(cx.toDouble(), cy.toDouble()).toFloat()
//
//            // create the animation (the final radius is zero)
//            val anim = ViewAnimationUtils.createCircularReveal(myView, cx, cy, initialRadius, 0f)
//
//            // make the view invisible when the animation is done
//            anim.addListener(object : AnimatorListenerAdapter() {
//
//                override fun onAnimationEnd(animation: Animator) {
//                    super.onAnimationEnd(animation)
//                    myView.visibility = View.INVISIBLE
//                }
//            })
//
//            // start the animation
//            anim.start()
//        } else {
//            // set the view to visible without a circular reveal animation below Lollipop
//            myView.visibility = View.VISIBLE
//        }
//    }

//    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
//    private fun setupWindowAnimation() {
//        val fade = Fade()
//        fade.duration = 1000
//
//        window.exitTransition = fade
//        window.enterTransition = fade
//
//
//
//
//
//
//
//
//    }
}








