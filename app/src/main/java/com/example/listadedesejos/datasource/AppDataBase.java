package com.example.listadedesejos.datasource;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.listadedesejos.datamodel.ListaModel;
import com.example.listadedesejos.model.Lista;

import java.util.ArrayList;
import java.util.List;

public class AppDataBase extends SQLiteOpenHelper {

    private static final String DB_NAME = "ListaDesejos";
    private static final int DB_VERSION = 1;

    SQLiteDatabase db;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ListaModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean insert(String tabela, ContentValues dados){

        db = getWritableDatabase();
        db.insert(tabela, null, dados );
        return true;

    }


    @SuppressLint("Range")
    public List<Lista> getList(String table){

        db = getReadableDatabase();
        String SQL = "select * from " + table;
        Cursor cursor;
        cursor = db.rawQuery(SQL,null);

        List<Lista> listas = new ArrayList<>();
        Lista lista;

        if(cursor.moveToFirst()){
            do{
                lista = new Lista();
                lista.setId(cursor.getInt(cursor.getColumnIndex(ListaModel.ID)));
                lista.setProduto(cursor.getString(cursor.getColumnIndex(ListaModel.PRODUTO)));
                lista.setValor(cursor.getDouble(cursor.getColumnIndex(ListaModel.VALOR)));
                lista.setData(cursor.getString(cursor.getColumnIndex(ListaModel.DATA)));

                listas.add(lista);

            }while(cursor.moveToNext());
        }

        cursor.close();

        return listas;

    }

    public void deleteItemList(String table, String where){

        db.delete(table, where, null);

    }

}
