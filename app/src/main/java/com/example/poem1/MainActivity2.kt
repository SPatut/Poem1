package com.example.poem1

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent


class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    var  btnActOne: Button? = null

    /** Called when the activity is first created.  */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnActOne = findViewById<View>(R.id.btnActOne) as Button
        btnActOne!!.setOnClickListener(this)
        supportActionBar?.hide();
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnActOne -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)}
            else -> {}
        }
    }
}