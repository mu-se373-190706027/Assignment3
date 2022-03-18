package com.ermanyalcin.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
    }

    fun increase(view : View){
        val textView = findViewById<TextView>(R.id.textView)
        textView.setText(counter.toString());
        counter++
    }

    fun checked(view : View){
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        if(checkBox.isChecked){
            val imageView = findViewById<ImageView>(R.id.imageView)
            val button = findViewById<Button>(R.id.button)
            button.isEnabled = true
            imageView.setImageResource(R.color.teal_700)
        }else{
            val imageView = findViewById<ImageView>(R.id.imageView)
            val button = findViewById<Button>(R.id.button)
            button.isEnabled = false
            imageView.setImageResource(com.google.android.material.R.color.design_default_color_error)
        }


    }
}