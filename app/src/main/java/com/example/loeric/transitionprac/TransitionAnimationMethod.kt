package com.example.loeric.transitionprac

import android.os.Build
import android.support.annotation.RequiresApi
import android.transition.Explode
import android.transition.Fade
import android.transition.Slide
import android.view.Gravity
import android.view.animation.AnticipateInterpolator
import android.view.animation.AnticipateOvershootInterpolator
import android.view.animation.BounceInterpolator

class TransitionAnimationMethod {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun setSlideTransitions(type: String): Slide {
        var slide: Slide? = null

        when (type) {
            "start" -> {
                slide = Slide(Gravity.START)
                slide.duration = 500
            }
            "end" -> {
                slide = Slide(Gravity.END)
                slide.duration = 500
            }
            "top" -> {
                slide = Slide(Gravity.TOP)
                slide.duration = 500
            }
            "bottom" -> {
                slide = Slide(Gravity.BOTTOM)
                slide.duration = 500
            }

        }
        return slide!!
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun setExplodeTransitions(type: String): Explode {
        val explode = Explode()

        when (type) {
            "BounceInterpolator" -> {
                explode.duration = 1000
                explode.interpolator = BounceInterpolator()
            }
            "AnticipateInterpolator" -> {
                explode.duration = 500
                explode.interpolator = AnticipateInterpolator()

            }
            "AnticipateOvershootInterpolator" -> {
                explode.duration = 500
                explode.interpolator = AnticipateOvershootInterpolator()
            }
        }
        return explode
    }
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    fun setFadeTransition(): Fade {
        val fade = Fade()
        fade.duration = 500
        return fade
    }


}