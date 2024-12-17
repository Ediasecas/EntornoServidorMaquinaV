package com.example.meteo_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.meteo_app.entity.Ciudad;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {
    // Puedes agregar métodos personalizados si lo necesitas
}
