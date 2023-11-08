package com.example.listadedesejos.controle;

import android.content.ContentValues;
import android.content.Context;

import com.example.listadedesejos.datamodel.ListaModel;
import com.example.listadedesejos.datasource.AppDataBase;
import com.example.listadedesejos.model.Lista;

import java.util.List;


public class ListaController extends AppDataBase {

    ContentValues dadoDoObjeto;

    public ListaController(Context context) {
        super(context);
    }

    public boolean incluir(Lista lista){

        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ListaModel.PRODUTO, lista.getProduto());
        dadoDoObjeto.put(ListaModel.VALOR, lista.getValor());
        dadoDoObjeto.put(ListaModel.DATA, lista.getData());

        return insert(ListaModel.TABELA, dadoDoObjeto);

    }

    public List<Lista> listar(){
        return getList(ListaModel.TABELA);
    }

}
