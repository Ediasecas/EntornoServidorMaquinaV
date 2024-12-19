package com.example.meteoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

import com.example.meteoApp.entity.Dias;
@Repository
public interface DiasRepository extends JpaRepository<Dias,LocalDate> {
    
}
