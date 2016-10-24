package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad1B extends AppCompatActivity {

    TextView textView;
    String nombre,apellidos;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1_b);
        textView=(TextView)findViewById(R.id.textView);
        Bundle extras=getIntent().getExtras();
        nombre=extras.getString("nombre");
        apellidos=extras.getString("apellidos");
        textView.setText("Hola "+nombre+" "+apellidos+" ¿Aceptas las condiciones?");
    }

    public void aceptarRechazar(View v) {
        if (v.getId() == R.id.buttonAceptar){
            Intent intent = new Intent();
            intent.putExtra("resultado","ACEPTADO");
            setResult(RESULT_OK,intent);
        }
        if (v.getId() == R.id.buttonRechazar){
            Intent intent = new Intent();
            intent.putExtra("resultado","RECHAZADO");
            setResult(RESULT_CANCELED,intent);
        }
        finish();
    }


}
