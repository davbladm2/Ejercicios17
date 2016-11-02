package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navegacion(View v) {
        if (v.getId() == R.id.buttonActividad01){
            Intent intent = new Intent(MainActivity.this, Actividad1.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.buttonActividad02){
            Intent intent = new Intent(MainActivity.this, Actividad2.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.buttonActividad03){
            Intent intent = new Intent(MainActivity.this, Actividad3.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.buttonActividad04){
            Intent intent = new Intent(MainActivity.this, Actividad4.class);
            startActivity(intent);
        }
    }

    public void salir(View v){
        finish();
    }
}