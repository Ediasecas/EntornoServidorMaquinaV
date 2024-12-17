package com.example.meteo_app.repository;

import com.example.meteo_app.entity.PronosticoHoras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PronosticoHorasRepository extends JpaRepository<PronosticoHoras, Integer> {
    // Puedes agregar métodos personalizados si lo necesitas
}
