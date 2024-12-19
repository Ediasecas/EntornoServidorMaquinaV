package com.example.meteoApp.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Dias {

    @Id
    private LocalDate fecha;

    @Column(name = "temp_max") 
    private int tempMax;

    @Column(name = "temp_min") 
    private int tempMin;

    @Column(name = "temp_media") 
    private int tempMedia;

    @Column(name = "precipitaciones") 
    private String precipitaciones;

    @Column(name = "salida_sol") 
    private String salidaSol;


    @OneToMany(mappedBy = "dias", cascade = CascadeType.ALL)
    private List<Pronostico> pronosticos;

    
    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public List<Pronostico> getPronosticos() {
        return pronosticos;
    }

    public void setPronosticos(List<Pronostico> pronosticos) {
        this.pronosticos = pronosticos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getTempMedia() {
        return tempMedia;
    }

    public void setTempMedia(int tempMedia) {
        this.tempMedia = tempMedia;
    }

    public String getPrecipitaciones() {
        return precipitaciones;
    }

    public void setPrecipitaciones(String precipitaciones) {
        this.precipitaciones = precipitaciones;
    }

    public String getSalidaSol() {
        return salidaSol;
    }

    public void setSalidaSol(String salidaSol) {
        this.salidaSol = salidaSol;
    }

    
    
}

