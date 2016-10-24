package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Actividad2 extends AppCompatActivity {

    EditText editTextUsuario,editTextContrasena;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        editTextUsuario=(EditText)findViewById(R.id.editTextUsuario);
        editTextContrasena=(EditText)findViewById(R.id.editTextContrasena);
    }

    public void iniciarSesion(View v) {
        if(editTextUsuario.getText().toString().equalsIgnoreCase("David") && editTextContrasena.getText().toString().equals("1234")){
            Intent intent = new Intent(Actividad2.this, Actividad2B.class);
            intent.putExtra("respuesta","El USUARIO y la PASSWORD son CORRECTAS");
            startActivity(intent);
        }else{
            Intent intent = new Intent(Actividad2.this, Actividad2B.class);
            intent.putExtra("respuesta","USUARIO Y/O PASSWORD INCORRECTAS");
            startActivity(intent);
        }
    }
}
