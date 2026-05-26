package com.example.fragmentos

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val TAGZ = "FragmentLog"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d(TAGZ, "Activity onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAGZ, "Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAGZ, "Activity onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAGZ, "Activity onDestroy")
    }

}