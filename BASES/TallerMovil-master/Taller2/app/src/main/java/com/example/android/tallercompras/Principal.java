package com.example.android.tallercompras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    private EditText cajaCantidad;
    private TextView cajamMensaje;
    private Spinner comboMaterial, comboDije, comboTipo;
    private RadioButton r1, r2;
    String material, dije, tipo, moneda;
    private ArrayAdapter<String> ad1, ad2, ad3;
    private  String[] opc1, opc2, opc3;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaCantidad = (EditText)findViewById(R.id.txtCantidad);
        cajamMensaje = (TextView)findViewById(R.id.lblMensaje);
        comboMaterial = (Spinner)findViewById(R.id.cmbMaterial);
        comboDije = (Spinner)findViewById(R.id.cmbDije);
        comboTipo = (Spinner)findViewById(R.id.cmbTipo);
        r1 = (RadioButton)findViewById(R.id.r1);
        r2 = (RadioButton)findViewById(R.id.r2);

        opc1 = this.getResources().getStringArray(R.array.material);
        opc2 = this.getResources().getStringArray(R.array.dije);
        opc3 = this.getResources().getStringArray(R.array.tipo);

        ad1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,opc1);
        ad2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,opc2);
        ad3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,opc3);

        comboMaterial.setAdapter(ad1);
        comboDije.setAdapter(ad2);
        comboTipo.setAdapter(ad3);

        //i = new Intent(this.)
        //b = new Bundle();
    }

    public void calculo(View v){
        int precio = 0, total;
        String cant;
        int cant2;
        if(validar()){
            cant = cajaCantidad.getText().toString();
            cant2 = Integer.parseInt(cant);
            material = comboMaterial.getSelectedItem().toString();
            dije = comboDije.getSelectedItem().toString();
            tipo = comboTipo.getSelectedItem().toString();
            if(r1.isChecked()) moneda = getResources().getString(R.string.dolar);
            if(r2.isChecked()) moneda = getResources().getString(R.string.peso);

            if(material.equalsIgnoreCase(getResources().getString(R.string.cuero)) && dije.equalsIgnoreCase(getString(R.string.martillo)) && tipo.equalsIgnoreCase(getString(R.string.oro))){
                precio=100;
            }
            if(material.equalsIgnoreCase(getResources().getString(R.string.cuero)) && dije.equalsIgnoreCase(getString(R.string.martillo)) && tipo.equalsIgnoreCase(getString(R.string.oroR))){
                precio=100;
            }
            if(material.equalsIgnoreCase(getResources().getString(R.string.cuero)) && dije.equalsIgnoreCase(getString(R.string.martillo)) && tipo.equalsIgnoreCase(getString(R.string.plata))){
                precio=80;
            }
            if(material.equalsIgnoreCase(getResources().getString(R.string.cuero)) && dije.equalsIgnoreCase(getString(R.string.martillo)) && tipo.equalsIgnoreCase(getString(R.string.niquel))){
                precio=70;
            }
            if(material.equalsIgnoreCase(getResources().getString(R.string.cuero)) && dije.equalsIgnoreCase(getString(R.string.ancla)) && tipo.equalsIgnoreCase(getString(R.string.oro))){
                precio=120;
            }
            if(material.equalsIgnoreCase(getResources().getString(R.string.cuero)) && dije.equalsIgnoreCase(getString(R.string.ancla)) && tipo.equalsIgnoreCase(getString(R.string.oroR))){
                precio=120;
            }
            if(material.equalsIgnoreCase(getResources().getString(R.string.cuero)) && dije.equalsIgnoreCase(getString(R.string.ancla)) && tipo.equalsIgnoreCase(getString(R.string.plata))){
                precio=100;
            }
            if(material.equalsIgnoreCase(getResources().getString(R.string.cuero)) && dije.equalsIgnoreCase(getString(R.string.ancla)) && tipo.equalsIgnoreCase(getString(R.string.niquel))){
                precio=90;
            }
            if(material.equalsIgnoreCase(getResources().getString(R.string.cuerda)) && dije.equalsIgnoreCase(getString(R.string.martillo)) && tipo.equalsIgnoreCase(getString(R.string.oro))){
                precio=90;
            }
            if(material.equalsIgnoreCase(getResources().getString(R.string.cuerda)) && dije.equalsIgnoreCase(getString(R.string.martillo)) && tipo.equalsIgnoreCase(getString(R.string.oroR))){
                precio=90;
            }
            if(material.equalsIgnoreCase(getResources().getString(R.string.cuerda)) && dije.equalsIgnoreCase(getString(R.string.martillo)) && tipo.equalsIgnoreCase(getString(R.string.plata))){
                precio=70;
            }
            if(material.equalsIgnoreCase(getResources().getString(R.string.cuerda)) && dije.equalsIgnoreCase(getString(R.string.martillo)) && tipo.equalsIgnoreCase(getString(R.string.niquel))){
                precio=50;
            }
            if(material.equalsIgnoreCase(getResources().getString(R.string.cuerda)) && dije.equalsIgnoreCase(getString(R.string.ancla)) && tipo.equalsIgnoreCase(getString(R.string.oro))){
                precio=110;
            }
            if(material.equalsIgnoreCase(getResources().getString(R.string.cuerda)) && dije.equalsIgnoreCase(getString(R.string.ancla)) && tipo.equalsIgnoreCase(getString(R.string.oroR))){
                precio=110;
            }
            if(material.equalsIgnoreCase(getResources().getString(R.string.cuerda)) && dije.equalsIgnoreCase(getString(R.string.ancla)) && tipo.equalsIgnoreCase(getString(R.string.plata))){
                precio=90;
            }
            if(material.equalsIgnoreCase(getResources().getString(R.string.cuerda)) && dije.equalsIgnoreCase(getString(R.string.ancla)) && tipo.equalsIgnoreCase(getString(R.string.niquel))){
                precio=80;
            }

            if(r2.isChecked()){
                total = cant2*precio;
                cajamMensaje.setText(getResources().getString(R.string.mensaje)+": "+total+" "+getResources().getString(R.string.valor2));
            }
            if(r1.isChecked()){
                total = (precio*cant2)*3200;
                cajamMensaje.setText(getResources().getString(R.string.mensaje)+": "+total+" "+getResources().getString(R.string.valor1));
            }




        }
    }

    public boolean validar(){
        if (cajaCantidad.getText().toString().isEmpty() ){
            //Toast.makeText(getApplicationContext(), "Digite por favor el nombre" , Toast.LENGTH_SHORT).show();
            cajaCantidad.setError(getResources().getString(R.string.error_1));
            return false;
        }
        return true;
    }


}
