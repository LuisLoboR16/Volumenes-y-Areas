package com.example.labredes.movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Esfera extends AppCompatActivity {
    private EditText Radio;
    private Intent i;
    private Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);

        Radio = (EditText) findViewById(R.id.cajaRadio);
        i = new Intent(this, Esfera2.class);
        b = new Bundle();
    }

    public void Esfera (View v){
        double num, total,pi=3.14159;
        String operacion="", dato="";
        num = Double.parseDouble((Radio.getText().toString()));
        total = 4*pi*(num*num*num)/3 ;
        String t2=""+total;
        dato = "Radio: " +Radio.getText().toString();
        operacion = "Volumen de la Esfera";

        b.putDouble("Area", total);
        i.putExtras(b);
        OperacionesRealizadas or = new OperacionesRealizadas(operacion,dato,t2);
        or.SalvarCambios();
        startActivity(i);
    }

    public void BorrarEsfera (View v){
        Radio.setText("");
        Radio.requestFocus();
    }
}
