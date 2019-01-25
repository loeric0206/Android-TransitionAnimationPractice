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
    fun setSlideTransitions(type: String, d: Long): Slide {
        var slide: Slide? = null

        when (type) {
            "start" -> {
                slide = Slide(Gravity.START)
                slide.duration = d
            }
            "end" -> {
                slide = Slide(Gravity.END)
                slide.duration = d
            }
            "top" -> {
                slide = Slide(Gravity.TOP)
                slide.duration = d
            }
            "bottom" -> {
                slide = Slide(Gravity.BOTTOM)
                slide.duration = d
            }

        }
        return slide!!
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun setExplodeTransitions(type: String, d: Long): Explode {
        val explode = Explode()

        when (type) {
            "BounceInterpolator" -> {
                explode.duration = d
                explode.interpolator = BounceInterpolator()
            }
            "AnticipateInterpolator" -> {
                explode.duration = d
                explode.interpolator = AnticipateInterpolator()

            }
            "AnticipateOvershootInterpolator" -> {
                explode.duration = d
                explode.interpolator = AnticipateOvershootInterpolator()
            }
        }
        return explode
    }
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    fun setFadeTransition(d: Long): Fade {
        val fade = Fade()
        fade.duration = d
        return fade
    }


}