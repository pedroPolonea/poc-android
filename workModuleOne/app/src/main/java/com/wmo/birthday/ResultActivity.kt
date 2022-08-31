package com.wmo.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.wmo.birthday.MainActivity.Companion.TAG

class ResultActivity : AppCompatActivity() {
    private lateinit var btnReturn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "C=ResultActivity, M=onCreate, I=Begin")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        btnReturn = findViewById<Button>(R.id.btnReturn)
        addListenerOnButtonReturn()
    }

    private fun addListenerOnButtonReturn() {
        btnReturn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "C=ResultActivity, M=onStart, I=Begin")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "C=ResultActivity, M=onRestart, I=Begin")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "C=ResultActivity, M=onPause, I=Begin")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "C=ResultActivity, M=onStop, I=Begin")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "C=ResultActivity, M=onDestroy, I=Begin")
    }
}