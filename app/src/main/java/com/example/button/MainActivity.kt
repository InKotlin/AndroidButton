package com.example.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var showBtn: Button? = null
    var hideBtn: Button? = null
    var targetBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showBtn = findViewById(R.id.showBtn)
        hideBtn = findViewById(R.id.hideBtn)
        targetBtn = findViewById(R.id.target)

        showBtn!!.setOnClickListener { targetBtn!!.visibility = View.VISIBLE }
        hideBtn!!.setOnClickListener { targetBtn!!.visibility = View.INVISIBLE }
    }
}