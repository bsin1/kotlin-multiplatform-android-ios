package com.example.githubmkp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.Greeting
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        greeting_text_view.text = Greeting().greeting()
    }
}
