package com.example.trabajomen;

import java.io.Serializable;

public class Pizza implements Serializable {
    private String cliente;
    private String tam;
    private String ing;
    private Integer precio;
   /* private String ing3;
    private String ing4;
    private String ing5;
    private String ing6;
    private String ing7;*/





    public Pizza(String cliente, String tam, String ing, Integer precio) {
        this.cliente = cliente;
        this.tam = tam;
        this.ing = ing;
        this.precio = precio;
    }

    public String getCliente() {
        return cliente;
    }

    public String getTam() {
        return tam;
    }
    public String getIng() {
        return ing;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public void setIng(String ing) {
        this.ing = ing;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
