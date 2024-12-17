package com.example.meteo_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.meteo_app.entity.PronosticoDia;
import com.example.meteo_app.repository.PronosticoDiaRepository;

@Controller
public class MeteoController {

    @Autowired
    private PronosticoDiaRepository pronosticoDiaRepository;

    @GetMapping("/")
    public String index(Model model) {
        // Obtener todos los pronósticos del día
        List<PronosticoDia> pronosticos = pronosticoDiaRepository.findAll();
        
        // Pasar los pronósticos al modelo para que estén disponibles en el template
        model.addAttribute("pronosticos", pronosticos);
        
        // Retornar la vista index.html
        return "index";
    }
}
