package com.example.exament3.models;

public class Anime {
    public String nombre;
    public String descripcion;
    public String imagen;
    public  boolean favorito;

    public Anime(String nombre, String descripcion, String imagen, boolean favorito) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.favorito = favorito;
    }
}
