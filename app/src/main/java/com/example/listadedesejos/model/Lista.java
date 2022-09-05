package com.example.listadedesejos.model;

public class Lista {

//    private int id;
    private String produto;
    private Double valor;
    private String data;


    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public String toString(){

        return produto + " - " + valor;
    }

}
