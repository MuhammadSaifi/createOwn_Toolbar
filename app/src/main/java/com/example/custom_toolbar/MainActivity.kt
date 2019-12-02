package com.example.custom_toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// for creating it first implement the design library
        setSupportActionBar(tool as Toolbar?)
        supportActionBar?.setTitle("Toolbar")
    }
}
