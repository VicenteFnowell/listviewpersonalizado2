package com.example.listviewpersonalizado2;

/**
 * Created by Vicente FN on 30/01/2018.
 */

public class Coche {

    String marca;
    String modelo;
    String imagen;
    double precio;

    public Coche(String marca, String modelo, String imagen, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.imagen = imagen;
        this.precio = precio;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }





    }
