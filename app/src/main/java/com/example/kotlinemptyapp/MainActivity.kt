package com.example.kotlinemptyapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.example.kotlinemptyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val array = arrayOf("Melbourne", "Vienna", "Vancouver", "Toronto", "Calgary", "Adelaide", "Perth", "Auckland", "Helsinki", "Hamburg", "Munich", "New York", "Sydney", "Paris", "Cape Town", "Barcelona", "London", "Bangkok");

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ArrayAdapter<String>(this, R.layout.listview_item, array);

        val listView = findViewById<ListView>(R.id.listView);
        listView.adapter = adapter;

        listView.setOnItemClickListener { parent, view, position, id ->
            val element = adapter.getItem(position);
            Log.d("Log", "$element");
        };

        binding.textView.text = "Hello Humans!";
    }
}