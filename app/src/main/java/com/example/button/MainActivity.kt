package com.example.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ListView
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var addBtn: Button? = null
    var removeBtn: Button? = null
    var listView: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addBtn = findViewById(R.id.addBtn)
        removeBtn = findViewById(R.id.removeBtn)
        listView = findViewById(R.id.listView)

        addBtn!!.setOnClickListener { addButton() }
        removeBtn!!.setOnClickListener { removeButton() }

    }

    private fun addButton() {
        val newButton = Button(this);
        newButton.text = "New Button: " + listView!!.childCount
        listView!!.addView(newButton)
    }

    private fun removeButton() {
        val lastIndex = listView!!.childCount - 1;
        if(lastIndex < 0) return
        listView!!.removeViewAt(lastIndex)
    }
}