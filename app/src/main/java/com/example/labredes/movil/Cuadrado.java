package com.example.labredes.movil;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by LabRedes on 21/04/2017.
 */
public class Cuadrado extends AppCompatActivity {
    private EditText Lado;
    private Intent i;
    private Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado_uno);

        Lado = (EditText) findViewById(R.id.cajLado);
        i = new Intent(this, Cuadrado2.class);
        b = new Bundle();
    }

    public void AlCuadrado (View v){
        double num, total;
        String operacion="", dato="";
        num = Double.parseDouble((Lado.getText().toString()));
        total = num * num;
        String t2=""+total;
        dato = "Lado: " +Lado.getText().toString();
        operacion = "Area del Cuadrado";

        b.putDouble("Area", total);
        i.putExtras(b);
        OperacionesRealizadas or = new OperacionesRealizadas(operacion,dato,t2);
        or.SalvarCambios();
        startActivity(i);
    }

    public void Borrar (View v){
        Lado.setText("");
        Lado.requestFocus();
    }

    public void Validar(View v){

    }
}
