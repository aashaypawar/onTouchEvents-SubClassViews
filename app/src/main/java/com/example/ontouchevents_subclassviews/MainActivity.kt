package com.example.ontouchevents_subclassviews

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.core.view.MotionEventCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val v1 = findViewById<View>(R.id.view1)

        v1.setOnTouchListener { v, event ->

            return@setOnTouchListener when (MotionEventCompat.getActionMasked(event)) {
                MotionEvent.ACTION_DOWN -> {
                    Toast.makeText(applicationContext,"Move",Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }

        }
    }
}