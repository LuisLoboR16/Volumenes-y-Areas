package com.example.labredes.movil;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by LabRedes on 21/04/2017.
 */
public class Principal extends AppCompatActivity {
    private ListView l;
    private Resources res;
    private String [] opc;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        l = (ListView)findViewById(R.id.lvOpciones);
        res = this.getResources();
        opc = res.getStringArray(R.array.Combinaciones);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,opc);
        l.setAdapter(adapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        i = new Intent(Principal.this, Areas.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(Principal.this, Volumenes.class);
                        startActivity(i);
                        break;
                    case 2:
                       i = new Intent(Principal.this, Listar2.class);
                        startActivity(i);
                        break;
                }
            }
        });
    }
}
