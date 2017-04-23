package com.example.labredes.movil;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Volumenes extends AppCompatActivity {
    private ListView l;
    private Resources res;
    private String [] opc2;
    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumenes);
        l = (ListView)findViewById(R.id.lvVolumenes);
        res = this.getResources();
        opc2 = res.getStringArray(R.array.Volumenes);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,opc2);
        l.setAdapter(adapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        i = new Intent(Volumenes.this, Esfera.class);
                        startActivity(i);
                        break;

                    case 1:
                        i = new Intent(Volumenes.this, Cilindro.class);
                        startActivity(i);
                        break;

                    case 2:
                        i = new Intent(Volumenes.this, Cono.class);
                        startActivity(i);
                        break;
                    case 3:
                        i = new Intent(Volumenes.this, Cubo.class);
                        startActivity(i);
                        break;
                }
            }
        });
    }
}

