package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(textView_1, textView_2, textView_3,
                                                textView_4, textView_5, button_1,
                                                button_2, button_3)
        for (item in clickableViews){
            item.setOnClickListener { changeColor(it) }
        }
    }

    private fun changeColor(view: View){
        when(view.id){
            R.id.textView_1 -> view.setBackgroundColor(Color.BLUE)
            R.id.textView_2 -> view.setBackgroundColor(Color.CYAN)

            R.id.textView_3 -> view.setBackgroundResource(android.R.color.holo_orange_light)
            R.id.textView_4 -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.textView_5 -> view.setBackgroundResource(android.R.color.holo_red_light)

            R.id.button_1 -> view.setBackgroundResource(R.color.my_green)
            R.id.button_2 -> view.setBackgroundResource(R.color.my_red)
            R.id.button_3 -> view.setBackgroundResource(R.color.my_blue)

            else -> view.setBackgroundColor(Color.DKGRAY)
        }
    }
}
