package com.example.meteo_app.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pronositcoDia") // Asegúrate de que el nombre coincide con la tabla en la base de datos
public class PronosticoDia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generación del ID
    private Integer idPronosticoDias;

    @Column(name = "idCiudad2", nullable = false) // Mapea la columna idCiudad2
    private Integer idCiudad;

    @Column(name = "salidaSol") // Hora de salida del sol
    private Date salidaSol;

    @Column(name = "bajadaSol") // Hora de bajada del sol
    private Date bajadaSol;

    @Column(name = "humedad") // Nivel de humedad
    private Integer humedad;

    @Column(name = "climaPronDia") // Tipo de clima
    private String climaPronDia;

    @Column(name = "fechaPronDia") // Fecha del pronóstico
    private Date fechaPronDia;

    @Column(name = "precipitaciones") // Precipitaciones en mm
    private Integer precipitaciones;

    @Column(name = "velViento") // Velocidad del viento en km/h
    private Integer velViento;

    // Getters y Setters

    public Integer getIdPronosticoDias() {
        return idPronosticoDias;
    }

    public void setIdPronosticoDias(Integer idPronosticoDias) {
        this.idPronosticoDias = idPronosticoDias;
    }

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
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
}
