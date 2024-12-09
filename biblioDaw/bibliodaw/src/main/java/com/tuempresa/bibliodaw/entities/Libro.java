package com.tuempresa.bibliodaw.entities;

public class Libro {
    private static int idCounter = 1; 
    private int id;
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;


    public Libro(String titulo, String autor, String isbn, boolean disponible) {
        this.id = idCounter++;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = disponible;
    }


    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

  
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
