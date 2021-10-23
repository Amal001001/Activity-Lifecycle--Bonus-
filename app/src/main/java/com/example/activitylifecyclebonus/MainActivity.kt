package com.example.activitylifecyclebonus

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv=findViewById(R.id.tv)

    }

    @SuppressLint("SetTextI18n", "SimpleDateFormat")
    override fun onPause() {
        super.onPause()
        tv.text =  tv.text.toString()+"\nLast seen: "+ SimpleDateFormat("hh:mm:ss a dd/M/yyyy").format(Date()).toString()
    }

    @SuppressLint("SetTextI18n")
    override fun onResume() {
        super.onResume()
        tv.text = tv.text.toString()+"\nOnline"
    }

}