package com.example.labredes.movil;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by LabRedes on 21/04/2017.
 */
public class Array{
    private static ArrayList<OperacionesRealizadas> operaciones = new ArrayList<>();

    public static void SalvarCambios (OperacionesRealizadas ops) {

        operaciones.add(ops);
    }

    public static ArrayList<OperacionesRealizadas> getOperaciones(){
        return operaciones;
    }
}
