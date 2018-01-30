package com.example.listviewpersonalizado2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vicente FN on 30/01/2018.
 */

public class AdaptadorCoche extends ArrayAdapter<Coche> {

    ArrayList<Coche> coches;
    Context c;

    public AdaptadorCoche(Context c, ArrayList<Coche> coches){
        super(c,R.layout.item_coche,coches);
        this.c = c;
        this.coches = coches;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_coche,null);

        //TextView Marca
        TextView tv_marca=(TextView)item.findViewById(R.id.item_tvmarca);
        tv_marca.setText(coches.get(position).getMarca());

        //TextView Modelo
        TextView tv_modelo=(TextView)item.findViewById(R.id.item_tvmodelo);
        tv_modelo.setText(coches.get(position).getModelo());

        //ImageView
        String imagen = coches.get(position).getImagen();

        int idImagen = c.getResources().getIdentifier(imagen, "drawable", c.getPackageName());
        ImageView iv_logo = (ImageView)item.findViewById(R.id.item_imagencoche);

        iv_logo.setImageResource(idImagen);


        return item;

    }
}