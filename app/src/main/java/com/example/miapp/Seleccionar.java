package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seleccionar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar);

        Button btnButton = findViewById(R.id.btn_Productos);
        Button btnButton2 = findViewById(R.id.btn_Nosotros);
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Seleccionar.this, RecycV.class);
                startActivity(intent);
            }
        });
        btnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Seleccionar.this, Sobree.class);
                startActivity(intent);
            }
        });
    }
}