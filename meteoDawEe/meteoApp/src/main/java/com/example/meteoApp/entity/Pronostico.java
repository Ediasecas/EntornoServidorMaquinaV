package com.example.meteoApp.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pronostico {
    
    @Id
    private LocalDateTime hora;
    
    @Column(nullable = false)
    private int temperatura;

    @Column(nullable = false)
    private String clima;

    @ManyToOne()
    @JoinColumn(name = "fecha")
    private Dias dias;


    public String getClima() {
        return clima;
    }

    // Setter para 'clima'
    public void setClima(String clima) {
        this.clima = clima;
    }

    // Getter y Setter para los otros campos
    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public Dias getDias() {
        return dias;
    }

    public void setDias(Dias dias) {
        this.dias = dias;
    }

}
