package com.example.meteo_app.repository;

import com.example.meteo_app.entity.PronosticoDia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PronosticoDiaRepository extends JpaRepository<PronosticoDia, Integer> {
}

