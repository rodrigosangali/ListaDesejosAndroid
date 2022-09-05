package com.example.listadedesejos.datamodel;

import java.math.BigDecimal;

public class ListaModel {

    public static final String TABELA = "lista";

    public static final String ID = "id";
    public static final String PRODUTO = "produto";
    public static final String VALOR = "valor";
    public static final String DATA = "data";

    public static String queryCriarTabela = "";


    public static String criarTabela() {

        queryCriarTabela += "CREATE TABLE " + TABELA + " (";
        queryCriarTabela += ID + " integer primary key autoincrement, ";
        queryCriarTabela += PRODUTO + " text, ";
        queryCriarTabela += VALOR + " decimal, ";
        queryCriarTabela += DATA + " date ";
        queryCriarTabela += ")";

        return queryCriarTabela;

    }


}
