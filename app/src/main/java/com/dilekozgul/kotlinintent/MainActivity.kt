package com.dilekozgul.kotlinintent


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun next(view: View){

        val intent = Intent(applicationContext,NextActivity::class.java)
        intent.putExtra("name",etname.text.toString())
        intent.putExtra("username",etusername.text.toString())
        startActivity(intent)

    }
}