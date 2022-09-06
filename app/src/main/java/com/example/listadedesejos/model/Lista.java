package com.example.listadedesejos.model;

public class Lista {

    private Integer id;
    private String produto;
    private Double valor;
    private String data;

    public int getId(){
        return id;
    }

    public String getProduto() {
        return produto;
    }

    public Double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public void  setId(int id){
        this.id = id;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public void setData(String data) {
        this.data = data;
    }





    public String toString(){

        return produto + " - " + valor;
    }

}
