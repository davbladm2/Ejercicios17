package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad2B extends AppCompatActivity {

    TextView textViewRespuesta;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2_b);
        textViewRespuesta=(TextView)findViewById(R.id.textViewRespuesta);
        Bundle extras=getIntent().getExtras();
        textViewRespuesta.setText(extras.getString("respuesta"));
    }

    public void volver(View v){
        finish();
    }
}
