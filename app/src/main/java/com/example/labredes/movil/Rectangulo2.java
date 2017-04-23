package com.example.labredes.movil;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by LabRedes on 21/04/2017.
 */
public class Rectangulo2 extends AppCompatActivity {
    private TextView total;
    private double c;
    private String aux;
    private Intent i;
    private Bundle b;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo_dos);

        total = (TextView)findViewById(R.id.txtResultadoCaja);
        b = getIntent().getExtras();
        c = b.getDouble("Area");
        aux = ""+c;
        total.setText(aux);
    }

    public void VolverRectangulo (View v){
        i = new Intent(this, Cuadrado.class);
        startActivity(i);
    }
}
