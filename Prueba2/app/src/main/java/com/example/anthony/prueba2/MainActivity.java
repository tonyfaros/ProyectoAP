package com.example.anthony.prueba2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnIngresar;
    Datos global = Datos.getInstance();
    DatosDefecto datosDefecto = new DatosDefecto();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        datosDefecto.datosLugares();
        Log.e("prueba",global.getListaLugares().get(1).getNombre());

    }

    public void onClickRegistrar(View v){
        Intent registrar = new Intent(this, Registrar.class);
        startActivity(registrar);

    }

    public void onClickIngresar(View view){
        Intent ingresar = new Intent(this,Catalogo.class);
        startActivity(ingresar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
