package com.codewithshubh.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class symtoms extends AppCompatActivity {

    LinearLayout worldDataLayout,gooHabitslayout,feelingSickLayout,indiaLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symtoms);


        worldDataLayout=findViewById(R.id.worldDataLayout);
        indiaLayout=findViewById(R.id.indiaDataLayout);
        feelingSickLayout=findViewById(R.id.feelingSickLyout);

        worldDataLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(symtoms.this, WorldDataActivity.class));
            }
        });

        feelingSickLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(symtoms.this, contact.class));
                // Toast.makeText(MainActivity.this, "Feeling Sick", Toast.LENGTH_SHORT).show();
            }
        });
        indiaLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(symtoms.this, MainActivity.class));
                // Toast.makeText(MainActivity.this, "Good habits", Toast.LENGTH_SHORT).show();
            }
        });
    }
}