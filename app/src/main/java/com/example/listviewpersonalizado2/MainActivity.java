package com.example.listviewpersonalizado2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvCoches;
    ArrayList <Coche> lista_coches= new ArrayList<Coche>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();

        lvCoches=(ListView)findViewById(R.id.lvCoches);
        AdaptadorCoche adaptadorCoche = new AdaptadorCoche(this,lista_coches);
        lvCoches.setAdapter(adaptadorCoche);




    }//ONCREATE

    private void cargarDatos(){

        lista_coches.add(new Coche("Seat","Alhambra","alhambra",13000));

        lista_coches.add(new Coche("Seat","Altea","altea",17500));

        lista_coches.add(new Coche("Seat","Arona","arona",12300));

        lista_coches.add(new Coche("Seat","Ateca","ateca",21500));

        lista_coches.add(new Coche("Seat","Bocanegra","bocanegra",19000));

        lista_coches.add(new Coche("Seat","Cupra","cupra",18500));

        lista_coches.add(new Coche("Seat","Leon","leon",14900));

        lista_coches.add(new Coche("Seat","Ibiza","ibiza",9000));


    }




}//ACTIVITY
