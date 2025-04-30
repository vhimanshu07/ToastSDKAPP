package com.example.toastsdkapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.toastshowing.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        Toaster.showToast(this,"This is my sdk testing code")
    }
}