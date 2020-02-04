package com.alekseioshurkovdeveloper.meetupclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alekseioshurkovdeveloper.about.presentation.AboutGroupFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.container, AboutGroupFragment.newInstance())
            .commit()
    }
}
