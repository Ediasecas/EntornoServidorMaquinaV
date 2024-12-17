package com.example.meteo_app.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudad") // Asegúrate de que el nombre coincide con la tabla en la base de datos
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generación del ID
    private Integer idCiudad;


    @Column(nullable = false) // Nombre de la ciudad
    private String nombreCiudad;

    @Column(nullable = false) // Altitud de la ciudad
    private String altitud;

    @Column( nullable = false) // Coordenada de latitud
    private String coordLat;

    @Column( nullable = false) // Coordenada de longitud
    private String coordLong;

    @OneToMany(mappedBy = "ciudad", cascade = CascadeType.ALL)
    private List<PronosticoDia> pronositcosDia;

    @OneToMany(mappedBy = "ciudad", cascade = CascadeType.ALL)
    private List<PronosticoHoras> pronositcosHora;

    // Getters y Setters

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getAltitud() {
        return altitud;
    }

    public void setAltitud(String altitud) {
        this.altitud = altitud;
    }

    public String getCoordLat() {
        return coordLat;
    }

    public void setCoordLat(String coordLat) {
        this.coordLat = coordLat;
    }

    public String getCoordLong() {
        return coordLong;
    }

    public void setCoordLong(String coordLong) {
        this.coordLong = coordLong;
    }

    public List<PronosticoDia> getPronositcosDia() {
        return pronositcosDia;
    }

    public void setPronositcosDia(List<PronosticoDia> pronositcosDia) {
        this.pronositcosDia = pronositcosDia;
    }

    public List<PronosticoHoras> getPronositcosHora() {
        return pronositcosHora;
    }

    public void setPronositcosHora(List<PronosticoHoras> pronositcosHora) {
        this.pronositcosHora = pronositcosHora;
    }


    

    
}
