package com.example.labredes.movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cubo extends AppCompatActivity {
    private EditText Arista;
    private Intent i;
    private Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);

        Arista = (EditText)findViewById(R.id.cajaArista);
        i = new Intent(this, Cubo2.class);
        b = new Bundle();
    }

    public void Cubo (View v){
        double num, total;
        String operacion="", dato="";
        num = Double.parseDouble((Arista.getText().toString()));
        total = num*num*num ;
        String t2=""+total;
        dato = "Arista: " + Arista.getText().toString();
        operacion = "Volumen del Cubo";

        b.putDouble("Area", total);
        i.putExtras(b);
        OperacionesRealizadas or = new OperacionesRealizadas(operacion,dato,t2);
        or.SalvarCambios();
        startActivity(i);
    }

    public void BorrarCubo (View v){
        Arista.setText("");
        Arista.requestFocus();

    }
}
