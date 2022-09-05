package com.example.listadedesejos.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.listadedesejos.R;
import com.example.listadedesejos.controle.ListaController;

import com.example.listadedesejos.model.Lista;


import java.util.List;

public class ConsultarDesejo extends AppCompatActivity {

    ListaController listaController;
    TextView textViewConsultarDesejo;
    ListView listViewListaDesejos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_desejo);

        textViewConsultarDesejo = findViewById(R.id.textViewConsultaDesejo);
        listViewListaDesejos = findViewById((R.id.listViewListaDesejos));

        listaController = new ListaController(getApplicationContext());

        List<Lista> list = listaController.listar();

        ArrayAdapter<Lista> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, list);

        listViewListaDesejos.setAdapter(arrayAdapter);

    }
}