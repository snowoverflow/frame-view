package com.yangjl.frameview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yangjl.ui.toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast(this, "hello")
    }
}