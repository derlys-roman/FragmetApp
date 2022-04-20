package com.example.fragmentapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentapp.R
import com.example.fragmentapp.databinding.ActivityMainBinding
import com.example.fragmentapp.fragments.BlankFragment
import com.example.fragmentapp.fragments.BlueFragment
import com.example.fragmentapp.interfaces.OnFragmentActionListener

class MainActivity : AppCompatActivity(), OnFragmentActionListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBlue.setOnClickListener { loadFragment(BlueFragment()) }
        binding.btnRed.setOnClickListener { loadFragment(BlankFragment()) }
    }

    override fun onClickFragmentButton() {
        Toast.makeText(this,
            "The button has clicked",
            Toast.LENGTH_SHORT).show()

    }

    private fun loadFragment(fragment: Fragment){
        val fragmentTransaction =
            supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}
    //https://cursokotlin.com/capitulo-22-fragments-en-kotlin/