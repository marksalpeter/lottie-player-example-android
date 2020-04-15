package com.marksalpeter.lottieplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // this is a lottie export from flow. it does not work
//        lottie_animation_view.setAnimation(R.raw.flow_animation)

        // this is the lottie logo. it does work
        lottie_animation_view.setAnimation(R.raw.lottie_logo)
    }
}
