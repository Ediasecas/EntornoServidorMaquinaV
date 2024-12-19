package com.example.meteoApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.meteoApp.entity.Dias;
import com.example.meteoApp.repository.DiasRepository;

@Service
public class DiasService 
{
    @Autowired
    private DiasRepository diasRepository;

    public List<Dias> listarDias()
    {
        return diasRepository.findAll();
    }

}
