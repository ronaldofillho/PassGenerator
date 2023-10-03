package com.example.passwordgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var btnAdd: FloatingActionButton
    private lateinit var listView: ListView
    private lateinit var conteudo: MutableList<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)
        btnAdd = findViewById(R.id.button)

        this.conteudo = mutableListOf<String>()
        val layout = android.R.layout.simple_list_item_1
        val adapter = ArrayAdapter<String>(this, layout, conteudo)

        this.listView.adapter = adapter

        btnAdd.setOnClickListener {
            (this.listView.adapter as ArrayAdapter<String>).add("Texto ${this.conteudo.size+1}")
        }
    }
}