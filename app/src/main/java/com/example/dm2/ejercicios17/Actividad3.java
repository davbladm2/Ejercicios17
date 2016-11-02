package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad3 extends AppCompatActivity {

    EditText editTextNum1,editTextNum2,editTextResultado;
    TextView textRespuCorrectas,textRespuIncorrecta;
    int num1,num2,resCorrecta,resIncorrecta;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
        editTextNum1=(EditText)findViewById(R.id.editTextNum1);
        editTextNum2=(EditText)findViewById(R.id.editTextNum2);
        editTextResultado=(EditText)findViewById(R.id.editTextResultado);
        textRespuCorrectas=(TextView)findViewById(R.id.textRespuCorrectas);
        textRespuIncorrecta=(TextView)findViewById(R.id.textRespuIncorrecta);
        aleatorio();
    }

    public void aleatorio(){
        num1=(int) (Math.random()*100+1);
        num2=(int) (Math.random()*100+1);
        editTextNum1.setText(Integer.toString(num1));
        editTextNum2.setText(Integer.toString(num2));
    }

    public void calcular(View v){
        if(!editTextResultado.getText().toString().equals("")){
            Intent intent = new Intent(Actividad3.this, Actividad3B.class);
            intent.putExtra("num1",editTextNum1.getText().toString());
            intent.putExtra("num2",editTextNum2.getText().toString());
            intent.putExtra("res",editTextResultado.getText().toString());
            startActivityForResult(intent,1234);
        }else{
            Toast toast1 = Toast.makeText(getApplicationContext(),"Introduce un resultado", Toast.LENGTH_SHORT);
            toast1.show();
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1234 && resultCode == RESULT_OK) {
            resCorrecta = Integer.parseInt(textRespuCorrectas.getText().toString());
            resCorrecta += 1;
            textRespuCorrectas.setText(Integer.toString(resCorrecta));
            editTextResultado.setText("");
            aleatorio();
        }

        if (requestCode == 1234 && resultCode == RESULT_CANCELED) {
            resIncorrecta = Integer.parseInt(textRespuIncorrecta.getText().toString());
            resIncorrecta += 1;
            textRespuIncorrecta.setText(Integer.toString(resIncorrecta));
            editTextResultado.setText("");
            aleatorio();
        }
    }
}
