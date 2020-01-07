package com.mx.isc.edu.p3p3jjgt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    GridView gvdatos;
    ArrayList<String> arreglo=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        gvdatos=findViewById(R.id.gvdatos);
        contenido contenidoobj=new contenido(arreglo, this);
        gvdatos.setAdapter(contenidoobj);
        arreglo.add("yayo");
        arreglo.add("yoya");
        arreglo.add("joss");
        arreglo.add("tecoya");
        arreglo.add("gael");
        arreglo.add("gaby");
        arreglo.add("jair");
    }
}
