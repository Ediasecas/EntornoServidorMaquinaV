package com.example.meteo_app.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pronositcoDia") // Asegúrate de que el nombre coincide con la tabla en la base de datos
public class PronosticoDia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generación del ID
    private Integer idPronosticoDias;

    @Column(nullable = false) // Mapea la columna idCiudad2
    private Integer idCiudad2;

    @Column(nullable = false) // Hora de salida del sol
    private Date salidaSol;

    @Column(nullable = false) // Hora de bajada del sol
    private Date bajadaSol;

    @Column(nullable = false) // Nivel de humedad
    private Integer humedad;

    @Column(nullable = false) // Tipo de clima
    private String climaPronDia;

    @Column(nullable = false) // Fecha del pronóstico
    private Date fechaPronDia;

    @Column(nullable = false) // Precipitaciones en mm
    private Integer precipitaciones;

    @Column(nullable = false) // Velocidad del viento en km/h
    private Integer velViento;

    @ManyToOne
    @JoinColumn(name = "idCiudad", nullable = false)
    private Ciudad ciudad;

    // Getters y Setters

    public Integer getIdPronosticoDias() {
        return idPronosticoDias;
    }

    public void setIdPronosticoDias(Integer idPronosticoDias) {
        this.idPronosticoDias = idPronosticoDias;
    }

    public Integer getIdCiudad2() {
        return idCiudad2;
    }

    public void setIdCiudad2(Integer idCiudad2) {
        this.idCiudad2 = idCiudad2;
    }

    public Date getSalidaSol() {
        return salidaSol;
    }

    public void setSalidaSol(Date salidaSol) {
        this.salidaSol = salidaSol;
    }

    public Date getBajadaSol() {
        return bajadaSol;
    }

    public void setBajadaSol(Date bajadaSol) {
        this.bajadaSol = bajadaSol;
    }

    public Integer getHumedad() {
        return humedad;
    }

    public void setHumedad(Integer humedad) {
        this.humedad = humedad;
    }

    public String getClimaPronDia() {
        return climaPronDia;
    }

    public void setClimaPronDia(String climaPronDia) {
        this.climaPronDia = climaPronDia;
    }

    public Date getFechaPronDia() {
        return fechaPronDia;
    }

    public void setFechaPronDia(Date fechaPronDia) {
        this.fechaPronDia = fechaPronDia;
    }

    public Integer getPrecipitaciones() {
        return precipitaciones;
    }

    public void setPrecipitaciones(Integer precipitaciones) {
        this.precipitaciones = precipitaciones;
    }

    public Integer getVelViento() {
        return velViento;
    }

    public void setVelViento(Integer velViento) {
        this.velViento = velViento;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
}
    