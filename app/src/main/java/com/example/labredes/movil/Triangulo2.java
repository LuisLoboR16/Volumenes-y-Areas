package com.example.labredes.movil;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Triangulo2 extends AppCompatActivity {
    private TextView total;
    private double c;
    private String aux;
    private Intent i;
    private Bundle b;
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo2);

        total = (TextView) findViewById(R.id.txtResultadoCaja);
        b = getIntent().getExtras();
        c = b.getDouble("Area");
        aux = "" + c;
        total.setText(aux);
    }

    public void VolverTriangulo (View v){
        i = new Intent(this, Triangulo.class);
        startActivity(i);
    }
}
