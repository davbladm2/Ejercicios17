package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Actividad4B extends AppCompatActivity {

    TextView textResultado;
    String nombre,apellidos,radioSele;
    ArrayList<String> lista;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4_b);
        textResultado=(TextView)findViewById(R.id.textResultado);
        Bundle extras=getIntent().getExtras();
        nombre=extras.getString("nombre");
        apellidos=extras.getString("apellidos");
        radioSele=extras.getString("radioSele");
        lista=extras.getStringArrayList("aficiones");
        textResultado.setText("Hola "+nombre+" "+apellidos+" tu sexo es: "+radioSele+".");
        if(lista.size()>0){
            textResultado.setText(textResultado.getText()+" Tus aficiones son ");
            for(String res: lista) {
                textResultado.setText(textResultado.getText()+res+" ");
            }
        }else{
            textResultado.setText(textResultado.getText()+" Y no tienes aficiones.");
        }
    }
    public void volver(View v){
        finish();
    }
}
