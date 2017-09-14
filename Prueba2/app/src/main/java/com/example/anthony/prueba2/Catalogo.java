package com.example.anthony.prueba2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Catalogo extends AppCompatActivity {

    Datos global = Datos.getInstance();
    private lugarAdapter adapter;
    private ArrayList<String> lista;
    private ListView lvLugares;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);
        lvLugares = (ListView)findViewById(R.id.lvLugares);
        Log.e("prueba","jeje");
        Log.e("prueba",global.getListaLugares().get(1).getNombre());
        Log.e("prueba","jeje2");
        lvLugares.setAdapter(new lugarAdapter(this,global.getListaLugares()));

    }
}
