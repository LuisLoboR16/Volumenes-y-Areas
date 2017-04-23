package com.example.labredes.movil;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by LabRedes on 21/04/2017.
 */
public class Rectangulo extends AppCompatActivity {
    private EditText Base,Altura;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo_uno);

        Base = (EditText) findViewById(R.id.cajaBase);
        Altura = (EditText)findViewById(R.id.cajaAltura);
        i = new Intent(this, Rectangulo2.class);
        b = new Bundle();
    }

    public void Rectangulo (View v){
        double base,altura, total;
        String operacion="", dato="";
        base = Double.parseDouble((Base.getText().toString()));
        altura = Double.parseDouble(Altura.getText().toString());
        total = base * altura;
        String t2 = ""+total;
        dato = "Base: "+ Base.getText().toString()+ ", " + "Altura: "+ Altura.getText().toString();
        operacion = "Area del Rectangulo";

        b.putDouble("Area", total);
        i.putExtras(b);
        OperacionesRealizadas or = new OperacionesRealizadas(operacion,dato,t2);
        or.SalvarCambios();
        startActivity(i);
    }

    public void Borrar (View v){
        Base.setText("");
        Base.requestFocus();
        Altura.setText("");
        Altura.requestFocus();
    }
}
