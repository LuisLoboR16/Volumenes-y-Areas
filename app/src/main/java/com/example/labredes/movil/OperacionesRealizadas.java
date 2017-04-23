package com.example.labredes.movil;

import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;

import java.util.ArrayList;

/**
 * Created by LabRedes on 21/04/2017.
 */
public class OperacionesRealizadas {
    private String Operaciones,resultados,datos;


    public OperacionesRealizadas(String operaciones, String resultados, String datos) {
        this.Operaciones = operaciones;
        this.resultados = resultados;
        this.datos = datos;
    }
        public String getOperaciones() {

            return Operaciones;
        }

        public void setOperaciones(String operaciones) {

            Operaciones = operaciones;
        }

        public String getResultados() {

            return resultados;
        }

        public void setResultados(String resultados) {

            this.resultados = resultados;
        }

        public String getDatos() {

            return datos;
        }

        public void setDatos(String datos) {

            this.datos = datos;
        }

        public void SalvarCambios(){

            Array.SalvarCambios(this);
        }
}
