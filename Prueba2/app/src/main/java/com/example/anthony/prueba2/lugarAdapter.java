package com.example.anthony.prueba2;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Anthony on 31/08/2017.
 */

public class lugarAdapter extends BaseAdapter{
    Activity activity;
    protected ArrayList<Lugar> lugares;

    public lugarAdapter(Activity activity, ArrayList<Lugar> lugares){
        this.activity = activity;
        this.lugares = lugares;
    }

    @Override
    public int getCount() {
        return lugares.size();
    }

    @Override
    public Object getItem(int position) {
        return lugares.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lugares.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.item_lugar,null);
        }
        Lugar lugar = lugares.get(position);
        TextView nombre = (TextView) v.findViewById(R.id.txtNombre);
        nombre.setText(lugar.getNombre());
        TextView telefono = (TextView) v.findViewById(R.id.txtDescripcion);
        telefono.setText(lugar.getTelefono().toString());
        return v;
    }
}
