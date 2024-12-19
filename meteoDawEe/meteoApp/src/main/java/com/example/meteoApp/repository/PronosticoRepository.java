package com.example.meteoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

import com.example.meteoApp.entity.Pronostico;
@Repository
public interface PronosticoRepository extends JpaRepository<Pronostico,LocalDateTime> {
    
}
