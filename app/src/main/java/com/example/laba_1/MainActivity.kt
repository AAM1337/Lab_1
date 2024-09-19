package com.example.laba_1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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

        val EditTextSymbol=findViewById<EditText>(R.id.editTextText);
        val Btn=findViewById<Button>(R.id.button2)

        Btn.setOnClickListener{
            val Symbol=EditTextSymbol.text.toString()

            if(Symbol.all{it.isUpperCase() && it in 'A'..'Z'})
            {
                when(Symbol)
                {
                    "L"->{
                        Toast.makeText(this,"Это согласные буквы",Toast.LENGTH_LONG).show()
                    }
                    "M"->{
                        Toast.makeText(this,"Это согласные буквы",Toast.LENGTH_LONG).show()
                    }
                    "K"->{
                        Toast.makeText(this,"Это согласные буквы",Toast.LENGTH_LONG).show()
                    }
                    "D"->{
                        Toast.makeText(this,"Это согласные буквы",Toast.LENGTH_LONG).show()
                    }
                    else->
                    {
                        Toast.makeText(this,"Возможно, это гласные буквы",Toast.LENGTH_LONG).show()
                    }
                }
            }
            else{
                Toast.makeText(this,"Нужно написать заглавную латинскую букву",Toast.LENGTH_LONG).show()
            }
        }
    }
}