package com.example.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var enableBtn: Button? = null
    var disableBtn: Button? = null
    var targetBtn: Button? = null
    var infoText: TextView? = null

    var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enableBtn = findViewById(R.id.enableBtn)
        disableBtn = findViewById(R.id.disableBtn)
        targetBtn = findViewById(R.id.target)
        infoText = findViewById(R.id.infoText)

        enableBtn!!.setOnClickListener { targetBtn!!.isClickable = true }
        disableBtn!!.setOnClickListener { targetBtn!!.isClickable = false }

        targetBtn!!.setOnClickListener { infoText!!.text = "Click count: " + ++clickCount}
    }
}