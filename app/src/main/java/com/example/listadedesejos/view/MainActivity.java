package com.example.listadedesejos.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.listadedesejos.R;
import com.example.listadedesejos.controle.ListaController;
import com.example.listadedesejos.model.Lista;



public class MainActivity extends AppCompatActivity {

    ListaController listaController;
    Lista lista;
    EditText editText, editTextValor;
    Button buttonInsert, buttonConsultarDesejo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencia dos objetos na tela
        editText = findViewById(R.id.editTextTextProduct);
        editTextValor = findViewById(R.id.editTextTextValor);
        buttonInsert = findViewById(R.id.buttonInsert);
        buttonConsultarDesejo= findViewById(R.id.buttonConsultarDesejo);



        buttonInsert.setOnClickListener(v -> {

            lista = new Lista();
            lista.setProduto(editText.getText().toString());
            lista.setValor(Double.parseDouble(editTextValor.getText().toString()));
            lista.setData("08-11-2021");

            listaController = new ListaController(getApplicationContext());

            // Inclui os dados
            listaController.incluir(lista);

            // Mensagem de sucesso na tela
            Toast.makeText(MainActivity.this,
                    " Incluído com sucesso", Toast.LENGTH_SHORT).show();

            // apaga o editText depois de inserir
            editText.setText(null);
            editTextValor.setText(null);
        });

        buttonConsultarDesejo.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), ConsultarDesejo.class);
            startActivity(intent);
        });




    }
}