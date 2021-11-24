package com.dilekozgul.kotlinintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val intent = intent
        var name= intent.getStringExtra("name")
        var username = intent.getStringExtra("username")
        tvname.text =name.toString()
        tvusername.text= username.toString()
    }
}