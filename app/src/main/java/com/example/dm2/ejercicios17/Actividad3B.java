package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad3B extends AppCompatActivity {

    TextView textResultado;
    int num1,num2,res,resultado;
    String resul;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3_b);
        textResultado=(TextView)findViewById(R.id.textResultado);
        Bundle extras=getIntent().getExtras();
        num1=Integer.parseInt(extras.getString("num1"));
        num2=Integer.parseInt(extras.getString("num2"));
        res=Integer.parseInt(extras.getString("res"));
        resultado=num1+num2;
        if(resultado==res){
            textResultado.setText("El resultado de la operación es CORRECTA");
            resul="correcta";
        }else{
            textResultado.setText("El resultado de la operación es INCORRECTA");
            resul="incorrecta";
        }
    }

    public void volver(View v){
        if(resul.equals("correcta")){
            Intent intent = new Intent();
            intent.putExtra("resultado","correcto");
            setResult(RESULT_OK,intent);
        }else{
            Intent intent = new Intent();
            intent.putExtra("resultado","incorrecto");
            setResult(RESULT_CANCELED,intent);
        }
        finish();
    }
}
