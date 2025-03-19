package com.codewati.abhiet

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.codewati.abhiedittext.abhiEditText

class MainActivity : AppCompatActivity() {

    private lateinit var customInput: abhiEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customInput = findViewById(R.id.customInput)

        val inputText = customInput.getText()
        Toast.makeText(this, "Entered: $inputText", Toast.LENGTH_SHORT).show()


    }
}