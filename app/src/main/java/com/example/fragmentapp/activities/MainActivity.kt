package com.example.fragmentapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.fragmentapp.R
import com.example.fragmentapp.interfaces.OnFragmentActionListener

class MainActivity : AppCompatActivity(), OnFragmentActionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClickFragmentButton() {
        Toast.makeText(this, "The button has clicked", Toast.LENGTH_SHORT).show()

    }
}
//https://cursokotlin.com/capitulo-22-fragments-en-kotlin/