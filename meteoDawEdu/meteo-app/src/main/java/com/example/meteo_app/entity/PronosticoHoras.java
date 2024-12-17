package com.example.meteo_app.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pronositcoHoras") // Asegúrate de que el nombre coincide con la tabla en la base de datos
public class PronosticoHoras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generación del ID
    private Integer idPronosticoHoras;


    @Column(nullable = false) // Temperatura registrada
    private String temperatura;

    @Column(nullable = false) // Fecha y hora del pronóstico
    private Date fechaPronHoras;

    @Column(nullable = false) // Tipo de clima
    @Enumerated(EnumType.STRING)
    private ClimaPronostico climaPronHoras;

    @Column(nullable = false) // Precipitaciones en mm
    private Integer precipitaciones;

    @Column(nullable = false) // Velocidad del viento en km/h
    private Integer velViento;

    @ManyToOne
    @JoinColumn(name = "idCiudad", nullable= false)
    private Ciudad ciudad;

    
    //getter Setter

    public Integer getIdPronosticoHoras() {
        return idPronosticoHoras;
    }

    public void setIdPronosticoHoras(Integer idPronosticoHoras) {
        this.idPronosticoHoras = idPronosticoHoras;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public Date getFechaPronHoras() {
        return fechaPronHoras;
    }

    public void setFechaPronHoras(Date fechaPronHoras) {
        this.fechaPronHoras = fechaPronHoras;
    }

    public enum ClimaPronostico  {
        Despejado, Nubes, Viento
    }

    public void setClimaPronHoras(ClimaPronostico climaPronHoras) {
        this.climaPronHoras = climaPronHoras;
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