package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad1 extends AppCompatActivity {

    EditText editTextNombre,editTextApellidos;
    TextView textViewAceptarCondiciones;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        editTextNombre=(EditText)findViewById(R.id.editTextNombre);
        editTextApellidos=(EditText)findViewById(R.id.editTextApellidos);
        textViewAceptarCondiciones=(TextView)findViewById(R.id.textViewAceptarCondiciones);
    }

    public void verificar(View v) {
        if  (v.getId() == R.id.buttonVerificar){
            Intent intent = new Intent(Actividad1.this, Actividad1B.class);
            intent.putExtra("nombre", editTextNombre.getText().toString());
            intent.putExtra("apellidos",editTextApellidos.getText().toString());
            startActivityForResult(intent,1234);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==1234 && resultCode==RESULT_OK){
            textViewAceptarCondiciones.setText("Aceptas condiciones: ACEPTADO");
        }
        if(requestCode==1234 && resultCode==RESULT_CANCELED){
            textViewAceptarCondiciones.setText("Aceptas condiciones: RECHAZADO");
        }
    }

    public void volver(View v){
        finish();
    }
}