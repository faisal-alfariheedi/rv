package com.example.rv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ed1=findViewById<EditText>(R.id.ed1)
        var ed2=findViewById<EditText>(R.id.ed2)
        var ed3=findViewById<EditText>(R.id.ed3)
        var ed4=findViewById<EditText>(R.id.ed4)
        var add=findViewById<Button>(R.id.add)
        add.setOnClickListener {
            if(ed1.text.isNotEmpty()&&ed2.text.isNotEmpty()&&ed3.text.isNotEmpty()&&ed4.text.isNotEmpty())
            person.people.add(person(ed1.text.toString(),ed2.text.toString(),ed3.text.toString(),ed4.text.toString(),))
            if(person.people.size > 5){
                intent= Intent(this,ac2::class.java)
                startActivity(intent)
            }
        }
    }
}