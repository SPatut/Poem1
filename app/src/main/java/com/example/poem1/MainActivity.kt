package com.example.poem1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonWeb:Button = findViewById(R.id.btnWeb)
        val buttonMap:Button = findViewById(R.id.btnMap)
        val btnActTwo:Button = findViewById(R.id.btnActTwo)

        buttonWeb.setOnClickListener  {
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/embed/F6hFB0mComk?rel=0&autoplay=1&start=1"))
            startActivity(intent)
        }
        buttonMap.setOnClickListener  {
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo: 43.2697, 6.63861"))
            startActivity(intent)
        }
        btnActTwo.setOnClickListener  {
           intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}
