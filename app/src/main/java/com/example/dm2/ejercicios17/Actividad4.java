package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import java.util.ArrayList;

public class Actividad4 extends AppCompatActivity {

    EditText editTextNombre,editTextApellidos;
    RadioGroup radioGroupSexo;
    RadioButton radioButtonMasculino,radioButtonFemenino;
    CheckBox checkBoxMusica,checkBoxLectura,checkBoxDeportes,checkBoxViajar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4);
        editTextNombre=(EditText)findViewById(R.id.editTextNombre);
        editTextApellidos=(EditText)findViewById(R.id.editTextApellidos);
        radioGroupSexo=(RadioGroup)findViewById(R.id.radioGroupSexo);
        radioButtonMasculino=(RadioButton)findViewById(R.id.radioButtonMasculino);
        radioButtonFemenino=(RadioButton)findViewById(R.id.radioButtonFemenino);
        checkBoxMusica=(CheckBox)findViewById(R.id.checkBoxMusica);
        checkBoxLectura=(CheckBox)findViewById(R.id.checkBoxLectura);
        checkBoxDeportes=(CheckBox)findViewById(R.id.checkBoxDeportes);
        checkBoxViajar=(CheckBox)findViewById(R.id.checkBoxViajar);
    }

    public void enviar(View v){
        boolean comprobar=true;
        ArrayList<String> lista=null;


        //Comprobaciones de Nombre y Apellidos
        if(editTextNombre.getText().toString().equals("")){
            Toast toast1=Toast.makeText(getApplicationContext(),"Introduce un Nombre", Toast.LENGTH_SHORT);
            toast1.show();
            comprobar=false;
        }else{
            if(editTextApellidos.getText().toString().equals("")){
                Toast toast1=Toast.makeText(getApplicationContext(),"Introduce los Apellidos", Toast.LENGTH_SHORT);
                toast1.show();
                comprobar=false;
            }
        }

        //Comprobaciones del radio seleccionado
        int idRadioGroup = radioGroupSexo.getCheckedRadioButtonId();
        int idRadioMasculino=radioButtonMasculino.getId();
        int idRadioFemenino=radioButtonFemenino.getId();
        String radioSele=null;
        if(idRadioGroup==idRadioMasculino){
            radioSele=radioButtonMasculino.getText().toString();
        }else if(idRadioGroup==idRadioFemenino){
            radioSele=radioButtonFemenino.getText().toString();
        }else{
            Toast toast1=Toast.makeText(getApplicationContext(),"Selecciona un Sexo", Toast.LENGTH_SHORT);
            toast1.show();
            comprobar=false;
        }

        //Comprobar las aficiones seleccionadas
        lista=new ArrayList<>();
        if(checkBoxMusica.isChecked()){
            lista.add(checkBoxMusica.getText().toString());
        }
        if(checkBoxLectura.isChecked()){
            lista.add(checkBoxLectura.getText().toString());
        }
        if(checkBoxDeportes.isChecked()){
            lista.add(checkBoxDeportes.getText().toString());
        }
        if(checkBoxViajar.isChecked()){
            lista.add(checkBoxViajar.getText().toString());
        }

        //Comprobar si se ha rellenado bien lo datos y mandar a la otra página
        if(comprobar==true){
            Intent intent = new Intent(Actividad4.this, Actividad4B.class);
            intent.putExtra("nombre",editTextNombre.getText().toString());
            intent.putExtra("apellidos",editTextApellidos.getText().toString());
            intent.putExtra("radioSele",radioSele);
            intent.putExtra("aficiones",lista);
            startActivity(intent);
        }
    }
}
