package com.example.iceonesplashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomePage : AppCompatActivity() {

private lateinit var englishButton: Button
private lateinit var binaryButton: Button
private lateinit var isiZuluButton: Button
private lateinit var japaneseButton: Button
private lateinit var arabicButton: Button
private lateinit var languageTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        //Button are located using ID then matched with the code behind entity
        englishButton = findViewById(R.id.EnglishButton)
        binaryButton = findViewById(R.id.BinaryButton)
        isiZuluButton = findViewById(R.id.IsiZuluButton)
        japaneseButton = findViewById(R.id.JapaneseButton)
        arabicButton = findViewById(R.id.ArabicButton)
        languageTextView = findViewById(R.id.languageTextView)

            //Action is completed when english button is clicked
            englishButton.setOnClickListener {
                languageTextView.text = "Hello World"
            }

        //Action is completed when binaryButton button is clicked
        binaryButton.setOnClickListener {
            languageTextView.text = "01001000 01100101 01101100 01101100 01101111\n 00100000 01110111 01101111 01110010 01101100 01100100"
        }

        //Action is completed when isiZulu button is clicked
        isiZuluButton.setOnClickListener {
            languageTextView.text = getText(R.string.IsiZulu)
        }

        //Action is completed when isiZulu button is clicked
        japaneseButton.setOnClickListener {
            languageTextView.text = getText(R.string.Japanese)
        }

        //Action is completed when isiZulu button is clicked
        arabicButton.setOnClickListener {
            languageTextView.text = getText(R.string.Arabic)
        }



    }
    }
