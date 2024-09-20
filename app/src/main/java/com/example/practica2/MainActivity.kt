package com.example.practica2

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    lateinit var checkBox1: CheckBox
    lateinit var checkBox2: CheckBox
    lateinit var input1:TextInputLayout
    lateinit var input2:TextInputLayout
    lateinit var botoia:Button
    lateinit var testua:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        checkBox1=findViewById(R.id.checkBox1)
        checkBox2=findViewById(R.id.checkBox2)
        input1=findViewById(R.id.input1)
        input2=findViewById(R.id.input2)
        botoia=findViewById(R.id.botoia)
        testua=findViewById(R.id.textua)


        checkBox1.setOnCheckedChangeListener { buttonView, isChecked ->

        }

        }
        }

