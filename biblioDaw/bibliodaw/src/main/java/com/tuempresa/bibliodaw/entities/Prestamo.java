package com.tuempresa.bibliodaw.entities;
import java.time.LocalDate;


public class Prestamo {
    private static int idCounter = 1; 
    private int id;
    private String usuario;
    private LocalDate fechaPrestamo;
    private Libro libro; 


    public Prestamo(String usuario, LocalDate fechaPrestamo, Libro libro) {
        this.id = idCounter++;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.libro = libro;
    }


    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
