package com.example.labredes.movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cono extends AppCompatActivity {
    private EditText Radio, Altura;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);

        Radio = (EditText) findViewById(R.id.cajaRadio);
        Altura = (EditText)findViewById(R.id.cajaAltura);
        i = new Intent(this, Cono2.class);
        b = new Bundle();
    }

    public void Cono (View v){
        double num,num2, total,pi=3.14159;
        String operacion="", dato="";
        num = Double.parseDouble((Radio.getText().toString()));
        num2 = Double.parseDouble(Altura.getText().toString());
        total = pi*(num*num)*num2/3 ;
        String t2=""+total;
        dato = "Radio: " + Radio.getText().toString() + "," + "Altura: "+ Altura.getText().toString();
        operacion = "Volumen del Cono";

        b.putDouble("Area", total);
        i.putExtras(b);
        OperacionesRealizadas or = new OperacionesRealizadas(operacion,dato,t2);
        or.SalvarCambios();
        startActivity(i);
    }

    public void BorrarCono (View v){
        Radio.setText("");
        Radio.requestFocus();
        Altura.setText("");
        Altura.requestFocus();
    }
}
