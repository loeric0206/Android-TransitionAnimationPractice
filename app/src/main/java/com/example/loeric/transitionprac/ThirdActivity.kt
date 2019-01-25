package com.example.loeric.transitionprac

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.transition.Fade
import android.view.View
import android.view.ViewAnimationUtils
import android.view.Window
import android.widget.ImageView

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class ThirdActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        setContentView(R.layout.activity_third)

        val circle1 = findViewById<ImageView>(R.id.imageview22)
        val circle2 = findViewById<ImageView>(R.id.imageview33)
        val addTransition = TransitionAnimationMethod()


        circle1?.let {
            it.setOnClickListener {

                val i = Intent(this@ThirdActivity, FourthActivity::class.java)

                startActivity(i, ActivityOptions.makeSceneTransitionAnimation(this).toBundle() )
//                // previously visible view
//                val myView: View = findViewById(R.id.third_conLayout)
//
//// Check if the runtime version is at least Lollipop
//                if (Build.VERSION.SDK_INT == Build.VERSION_CODES.LOLLIPOP) {
//                    // get the center for the clipping circle
//                    val cx = myView.width / 2
//                    val cy = myView.height / 2
//
//                    // get the initial radius for the clipping circle
//                    val initialRadius = Math.hypot(cx.toDouble(), cy.toDouble()).toFloat()
//
//                    // create the animation (the final radius is zero)
//                    val anim = ViewAnimationUtils.createCircularReveal(myView, cx, cy, initialRadius, 0f)
//
//                    // make the view invisible when the animation is done
//                    anim.addListener(object : AnimatorListenerAdapter() {
//
//                        override fun onAnimationEnd(animation: Animator) {
//                            super.onAnimationEnd(animation)
//                            myView.visibility = View.INVISIBLE
//                        }
//                    })
//
//                    // start the animation
//                    anim.start()
//                } else {
//                    // set the view to visible without a circular reveal animation below Lollipop
//                    myView.visibility = View.VISIBLE
//                }

//                //                val i = Intent(this@ThirdActivity, FourthActivity::class.java)
//                val sharedView: View = circle1
//                val transitionName: String = getString(R.string.blue_circle)
//                val transitionActivityOptions =
//                    ActivityOptions.makeSceneTransitionAnimation(this@ThirdActivity, sharedView, transitionName)
//
//                startActivity(i, transitionActivityOptions.toBundle())

//                presentActivity()


            }
        }

        circle2?.let {
            it.setOnClickListener {
                //            val i = Intent(this@ThirdActivity, FourthActivity::class.java)
//            val sharedView: View = circle2
//            val transitionName: String = getString(R.string.red_circle)
//            val transitionActivityOptions =
//            ActivityOptions.makeSceneTransitionAnimation(this@ThirdActivity, sharedView, transitionName)
//
//            startActivity(i, transitionActivityOptions.toBundle())
//              val it : View = findViewById(R.id.imageview3)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    // get the center for the clipping circle
                    val cx = circle2.width / 2
                    val cy = circle2.height / 2

                    // get the final radius for the clipping circle
                    val finalRadius = Math.hypot(cx.toDouble(), cy.toDouble()).toFloat()

                    // create the animator for this view (the start radius is zero)
                    val anim = ViewAnimationUtils.createCircularReveal(circle2, cx, cy, 0f, finalRadius)
                    // make the view visible and start the animation
                    circle2.visibility = View.VISIBLE
                    anim.start()
                } else {
                    // set the view to visible without a circular reveal animation below Lollipop
                    circle2.visibility = View.VISIBLE
                }
            }
        }



        setupWindowAnimation(addTransition)
    }

//    private fun presentActivity(view: View) {
//
//        val options = ActivityOptions.makeSceneTransitionAnimation(this, view, "transitions")
//        val revealX = (view.x + view.width / 2).toInt()
//        val revealY = (view.y + view.height / 2).toInt()
//        val intent = Intent(this@ThirdActivity, FourthActivity::class.java)
//        intent.putExtra(FourthActivity.EXTRA_CIRCULAR_REVEAL_X, revealX)
//        intent.putExtra(FourthActivity.EXTRA_CIRCULAR_REVEAL_Y, revealY)
//        startActivity(intent, options.toBundle())
//
//    }


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun setupWindowAnimation(addTransition: TransitionAnimationMethod) {

//        val fade = Fade()
//        fade.duration = 500

        window.exitTransition = addTransition.setFadeTransition(500)
        window.enterTransition = addTransition.setFadeTransition(500)
//        val slide1 = Slide(Gravity.START)
//        slide1.duration = 500
//
//
//
//        window.enterTransition = slide1
//        window.exitTransition = slide1








    }


}