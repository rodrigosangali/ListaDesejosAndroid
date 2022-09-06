package com.example.listadedesejos.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.listadedesejos.R;
import com.example.listadedesejos.controle.ListaController;

import com.example.listadedesejos.model.Lista;


import java.util.List;

public class ConsultarDesejo extends AppCompatActivity {

    ListaController listaController;
    ListView listViewListaDesejos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_desejo);

        listViewListaDesejos = findViewById((R.id.listViewListaDesejos));

        listaController = new ListaController(getApplicationContext());

        List<Lista> list = listaController.listar();

        // Cria adaptador para a lista
        // ArrayAdapter recebe o contexto, layout e lista
        ArrayAdapter<Lista> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, list);

        // Adiciona o adaptador para a lista
        listViewListaDesejos.setAdapter(arrayAdapter);

        listViewListaDesejos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String valorSelecionado = listViewListaDesejos.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), valorSelecionado, Toast.LENGTH_SHORT).show();

            }
        });

    }
}