package com.example.imadicetask1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MultiplicationTable : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplication_table)

        val bundle: Bundle? = intent.extras
        val tableString: String? = bundle?.getString("tableNumber")

        val tableNumber = tableString?.toInt()

        val multiplicationTable = findViewById<TextView>(R.id.multiplicationTableTextView)

        multiplicationTable.text ="$tableNumber x table"



    }
}