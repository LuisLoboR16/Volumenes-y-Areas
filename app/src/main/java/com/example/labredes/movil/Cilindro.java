package com.example.labredes.movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cilindro extends AppCompatActivity {
    private EditText Radio, Altura;
    private Intent i;
    private Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);

        Radio = (EditText) findViewById(R.id.cajaRadio);
        Altura = (EditText)findViewById(R.id.cajaAltura);
        i = new Intent(this, Cilindro2.class);
        b = new Bundle();
    }

    public void Cilindro (View v){
        double num,num2, total,pi=3.14159;
        String operacion="", dato="";
            num = Double.parseDouble((Radio.getText().toString()));
            num2 = Double.parseDouble(Altura.getText().toString());
            total = pi * (num * num) * num2;
            String t2 = "" + total;
            dato = "Radio: " + Radio.getText().toString() + "," + "Altura: " + Altura.getText().toString();
            operacion = "Volumen del Cilindro";

            b.putDouble("Area", total);
            i.putExtras(b);
            OperacionesRealizadas or = new OperacionesRealizadas(operacion, dato, t2);
            or.SalvarCambios();
            startActivity(i);
    }

    public void BorrarCilindro (View v){
        Radio.setText("");
        Radio.requestFocus();
        Altura.setText("");
        Altura.requestFocus();
    }

    public boolean ValidarCaja(){
        if(Radio.getText().toString().isEmpty() ||Altura.getText().toString().isEmpty()){
            return false;
        }
        return true;
    }
}
