package com.wmo.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnClickHere: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "C=MainActivity, M=onCreate, I=Begin")
        setContentView(R.layout.activity_main)
        btnClickHere = findViewById<Button>(R.id.btnClickHere)
        addListenerOnButtonClickHere()
    }

    private fun addListenerOnButtonClickHere() {
        btnClickHere.setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "C=MainActivity, M=onStart, I=Begin")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "C=MainActivity, M=onRestart, I=Begin")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "C=MainActivity, M=onPause, I=Begin")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "C=MainActivity, M=onStop, I=Begin")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "C=MainActivity, M=onDestroy, I=Begin")
    }

    companion object {
        const val TAG = "birthdayApp";
    }
}