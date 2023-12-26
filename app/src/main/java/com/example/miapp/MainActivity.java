package com.example.miapp;

import static com.example.miapp.R.id.btn_Registrar;
import static com.example.miapp.R.id.btn_Registrarr;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnIniciar = findViewById(R.id.btn_Inicia);

        Button btnRegistrarme = findViewById(btn_Registrar);



        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iniciarSesionIntent = new Intent(MainActivity.this, IniciarSesion.class);
                startActivity(iniciarSesionIntent);
            }
        });

        btnRegistrarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrarmeIntent = new Intent(MainActivity.this, Registrarme.class);
                startActivity(registrarmeIntent);
            }
        });

    }
}
