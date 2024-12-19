package com.example.meteoApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.meteoApp.entity.Pronostico;
import com.example.meteoApp.repository.PronosticoRepository;

@Service
public class PronosticoService 
{
    @Autowired
    private PronosticoRepository pronosticoRepository;

    public List<Pronostico> listarPronosticos()
    {
        return pronosticoRepository.findAll();
    }
}
