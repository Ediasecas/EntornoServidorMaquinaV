package com.example.meteo_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.meteo_app.entity.PronosticoDia;
import com.example.meteo_app.repository.PronosticoDiaRepository;

import org.springframework.ui.Model;

public class MeteoController {
    
    @Autowired
    private PronosticoDiaRepository diaRepository;
  
    

   @GetMapping("/")
    public String index(Model model) {
        List<PronosticoDia> pronosticos = diaRepository.findAll();
        model.addAttribute("pronosticos", pronosticos);
        return "index";
    }

}
