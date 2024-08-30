package com.ejercicio_practico.ejercicio_practico.domain;


public class Producto {
    private String codigo;
    private String nombre;
    private double price;
    private int stock;

    public Producto(){}

    public Producto(String codigo, String nombre, double price, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.price = price;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    
}
