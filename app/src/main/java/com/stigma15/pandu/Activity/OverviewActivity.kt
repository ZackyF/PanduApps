package com.stigma15.pandu.Activity

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.stigma15.pandu.R
import kotlinx.android.synthetic.main.fragment_overview.*


class OverviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_overview)
        //val animationd = AnimationUtils.loadAnimation(this, R.anim.slide_down)
        //kontainer.startAnimation(animationd)
        //Hide status bar
        swipeUp.setOnClickListener{
            val intent = Intent(this, ScrollingActivity::class.java)
            startActivity(intent)
        }

        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21)
        {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true)
        }
        if (Build.VERSION.SDK_INT >= 19)
        {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
        }
        if (Build.VERSION.SDK_INT >= 21)
        {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
            getWindow().setStatusBarColor(Color.TRANSPARENT)
        }
    }
    fun setWindowFlag(activity: Activity, bits:Int, on:Boolean) {
        val win = activity.getWindow()
        val winParams = win.getAttributes()
        if (on)
        {
            winParams.flags = winParams.flags or bits
        }
        else
        {
            winParams.flags = winParams.flags and bits.inv()
        }
        win.setAttributes(winParams)
    }
}


