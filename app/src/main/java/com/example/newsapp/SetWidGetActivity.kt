package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import io.paperdb.Paper

class SetWidGetActivity : AppCompatActivity() {
    lateinit var btnSave:Button
    lateinit var e1: EditText
    lateinit var e2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_wid_get)
        Paper.init(this)
        btnSave=findViewById(R.id.btnSet)
        e1=findViewById(R.id.e1)
        e2=findViewById(R.id.e2)
        btnSave.setOnClickListener{
            Paper.book().write("title",e1.text.toString())
            Paper.book().write("des",e2.text.toString())
            Toast.makeText(this,"Saved",Toast.LENGTH_LONG).show()

        }
    }
}