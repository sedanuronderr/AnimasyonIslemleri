package com.example.animasyonislemleri

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.BounceInterpolator
import android.view.animation.OvershootInterpolator
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //buttonAsagidanEkranaGiris()
        //yaziSagdanEkranaGiris()
        //resimSoldanEkranaGiris()

        button.setOnClickListener {
            //alphaAnimasyonu()
            //scaleAnimasyonu()
            //rotateAnimasyonu()
            //translationAnimasyonu()
            //gecikmeOzelligi()
            //ivmeOzelligi()
            //tekrarOzelligi()
            //cokluAnimasyon()
            ardisikAnimasyon()
        }
    }

    fun ardisikAnimasyon(){
        val a = ObjectAnimator.ofFloat(resim,"alpha",1.0f,0.0f)
        val sX = ObjectAnimator.ofFloat(resim,"scaleX",1.0f,2.0f)
        val sY = ObjectAnimator.ofFloat(resim,"scaleY",1.0f,3.0f)

        val coklu = AnimatorSet().apply {
            duration = 1000
            playSequentially(sX,sY,a)
        }

        coklu.start()
    }

    fun cokluAnimasyon(){
        val a = ObjectAnimator.ofFloat(resim,"alpha",1.0f,0.0f)
        val sX = ObjectAnimator.ofFloat(resim,"scaleX",1.0f,2.0f)
        val sY = ObjectAnimator.ofFloat(resim,"scaleY",1.0f,3.0f)

        val coklu = AnimatorSet().apply {
            duration = 1000
            playTogether(a,sX,sY)
        }

        coklu.start()
    }

    fun tekrarOzelligi(){
        val t = ObjectAnimator.ofFloat(resim,"translationY",0.0f,100.0f).apply {
            duration = 1000
            repeatCount = ObjectAnimator.INFINITE
            repeatMode = ObjectAnimator.REVERSE
        }

        t.start()
    }

    fun ivmeOzelligi(){
        val t = ObjectAnimator.ofFloat(resim,"translationY",0.0f,300.0f).apply {
            duration = 1000
            interpolator = BounceInterpolator()
        }

        t.start()
    }

    fun gecikmeOzelligi(){
        val t = ObjectAnimator.ofFloat(resim,"translationY",0.0f,50.0f).apply {
            duration = 3000
            startDelay = 2000
        }

        t.start()
    }

    fun resimSoldanEkranaGiris(){
        val t = ObjectAnimator.ofFloat(resim,"translationX",-800.0f,0.0f).apply {
            duration = 1000
        }

        t.start()
    }

    fun yaziSagdanEkranaGiris(){
        val t = ObjectAnimator.ofFloat(yazi,"translationX",800.0f,0.0f).apply {
            duration = 1000
        }

        t.start()
    }

    fun buttonAsagidanEkranaGiris(){
        val t = ObjectAnimator.ofFloat(button,"translationY",800.0f,0.0f).apply {
            duration = 1000
        }

        t.start()
    }

    fun translationAnimasyonu(){
        val t = ObjectAnimator.ofFloat(yazi,"translationY",0.0f,-50.0f).apply {
            duration = 3000
        }

        t.start()
    }

    fun rotateAnimasyonu(){
        val r = ObjectAnimator.ofFloat(yazi,"rotation",0.0f,90.0f).apply {
            duration = 3000
        }

        r.start()
    }

    fun scaleAnimasyonu(){
        val s = ObjectAnimator.ofFloat(resim,"scaleY",1.0f,0.5f).apply {
            duration = 3000
        }

        s.start()
    }

    fun alphaAnimasyonu(){
        val a = ObjectAnimator.ofFloat(resim,"alpha",0.0f,1.0f).apply {
            duration = 3000
        }

        a.start()
    }
}