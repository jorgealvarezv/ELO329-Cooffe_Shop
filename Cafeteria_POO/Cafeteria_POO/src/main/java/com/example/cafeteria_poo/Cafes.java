package com.example.cafeteria_poo;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class Cafes {
    /*------------Atributos------------*/
    private int precio;
    private String nombre;
    private ArrayList<String> ingredientes;
    private String imagenPath;
    private Image image;
    private String size;

    public Cafes() {
        this.precio = 0;
        this.nombre = "";
        this.imagenPath = "";
        this.size = "";

    }

    public Cafes(int precio, String nombre, ArrayList<String> ingredientes, String imagenPath) {
        this.precio = precio;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.imagenPath = imagenPath;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes.add(ingredientes);
    }

    public String getImagenPath() {
        return imagenPath;
    }

    public void setImagenPath(String imagenPath) {
        this.imagenPath = imagenPath;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
