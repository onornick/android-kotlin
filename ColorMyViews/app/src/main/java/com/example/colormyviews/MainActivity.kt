package com.example.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import com.example.colormyviews.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }



    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    /**
     * Attaches listeners to all the views.
     */

    private fun setListeners() {
        binding.apply {
            val clickableViews: List<View> =
                listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText);

            for (item in clickableViews) {
                item.setOnClickListener { makeColored(it) }
            }
        }
    }
}