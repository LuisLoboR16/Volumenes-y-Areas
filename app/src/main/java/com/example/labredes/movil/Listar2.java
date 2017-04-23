package com.example.labredes.movil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Listar2 extends AppCompatActivity {
    private TableLayout t;
    private ArrayList<OperacionesRealizadas> operaciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar2);

        t = (TableLayout)findViewById(R.id.tblOperaciones);
        operaciones = Array.getOperaciones();

        for (int i = 0;  i < operaciones.size(); i++){
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText(""+(i+1));
            c2.setText(operaciones.get(i).getOperaciones());
            c3.setText(operaciones.get(i).getResultados());
            c4.setText(operaciones.get(i).getDatos());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            t.addView(fila);
        }
    }
}
