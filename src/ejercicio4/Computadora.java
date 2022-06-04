package ejercicio4;

import java.util.Scanner;

public class Computadora {
    private String id;
    private String marca;
    private double peso;
    private double precio;
    private int ramEGb;
    private int almecenamientoGb;

    public Computadora(String id, double precio, String marca) {
        this.id =id ;
        this.precio = precio;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public int getRamEGb() {
        return ramEGb;
    }

    public int getAlmecenamientoGb() {
        return almecenamientoGb;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setRamEGb(int ramEGb) {
        this.ramEGb = ramEGb;
    }

    public void setAlmecenamientoGb(int almecenamientoGb) {
        this.almecenamientoGb = almecenamientoGb;
    }
}
