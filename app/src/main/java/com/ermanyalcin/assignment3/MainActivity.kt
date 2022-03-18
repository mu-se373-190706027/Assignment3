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

    fun increase(view : View){                                 //Method for increase when button clicked
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = counter.toString()                     //Changing text file
        counter++                                              //increase counter
    }

    fun checked(view : View){                                  //Method for check whether check box is selected or not and allow for clicking button if it is checked
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        if(checkBox.isChecked){                                       //if check box is selected it will be true
            val imageView = findViewById<ImageView>(R.id.imageView)
            val button = findViewById<Button>(R.id.button)
            button.isEnabled = true                                   //enabled button so it becomes clickable
            imageView.setImageResource(R.color.teal_700)              //Change the color
        }else{
            val imageView = findViewById<ImageView>(R.id.imageView)
            val button = findViewById<Button>(R.id.button)
            button.isEnabled = false                                  //disabled button so it becomes can not clickable
            imageView.setImageResource(com.google.android.material.R.color.design_default_color_error)  //Change the color back
        }


    }
}