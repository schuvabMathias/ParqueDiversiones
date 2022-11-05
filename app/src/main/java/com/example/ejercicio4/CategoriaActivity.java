package com.example.ejercicio4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CategoriaActivity extends AppCompatActivity {

    public static String[] categories = {
            "punteria", "destreza", "onevsone", "fuerza"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorias);
    }
}