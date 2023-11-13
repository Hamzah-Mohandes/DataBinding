package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	private var counter = 0
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		// DataBinding in eine variable save machen
		val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

	binding.counterText.text = counter.toString()

	binding.buttonText.setOnClickListener{
		counter++
		binding.counterText.text = counter.toString()
	}
	}

}