package com.example.practica2

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AppPractica2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d("CICLO", "onCreate")
    }
    override fun onStart() { super.onStart(); Log.d("CICLO", "onStart") }
    override fun onResume() { super.onResume(); Log.d("CICLO", "onResume") }
    override fun onPause() { super.onPause(); Log.d("CICLO", "onPause") }
    override fun onStop() { super.onStop(); Log.d("CICLO", "onStop") }
    override fun onDestroy() { super.onDestroy(); Log.d("CICLO", "onDestroy") }
    override fun onRestart() { super.onRestart(); Log.d("CICLO", "onRestart") }

}