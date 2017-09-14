package com.example.anthony.prueba2;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anthony on 31/08/2017.
 */

public class Datos {

    private static Datos instance;

    ArrayList<Lugar> listaLugares;

    public Datos() {
    }

    public static Datos getInstance(){
        if(instance == null){
            instance = new Datos();
            instance.listaLugares = new ArrayList<Lugar>();
        }
        return instance;
    }


    public ArrayList<Lugar> getListaLugares() {
        return listaLugares;
    }

    public void addListaLugares(Lugar l){
        Datos global = Datos.getInstance();
        global.getListaLugares().add(l);

    }
}
