package com.example.meteoApp.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.meteoApp.entity.Dias;
import com.example.meteoApp.entity.Pronostico;
import com.example.meteoApp.service.DiasService;
import com.example.meteoApp.service.PronosticoService;

@Controller
public class meteoController {

    @Autowired
    private DiasService diasService;

    @Autowired
    private PronosticoService pronosticoService;

    private List<Dias> misDias = new ArrayList<>();
    private List<Pronostico> misPronosticos = new ArrayList<>();

    @GetMapping("/")
    public String showIndex(@RequestParam(value = "day", required = false) String selectedDate, Model model) {
    misDias = diasService.listarDias();
    misPronosticos = pronosticoService.listarPronosticos();
    
        Dias selectedDay = misDias.get(2);
        if (selectedDate != null) {
            for (Dias dia : misDias) {
                if (dia.getFecha().toString().equals(selectedDate)) {
                    selectedDay = dia;
                    break;
                }
            }
        }

        List<Pronostico> pronosticosForDay = new ArrayList<>();
        for (Pronostico p : misPronosticos) {
            if (p.getDias().getFecha().equals(selectedDay.getFecha())) {
                pronosticosForDay.add(p);
            }
        }


        model.addAttribute("dias", misDias); 
        model.addAttribute("selectedDay", selectedDay); 
        model.addAttribute("pronosticos", pronosticosForDay); 
        model.addAttribute("climaImages", getClimaImages(pronosticosForDay));
        return "index";
    }
  
    private Map<String, String> getClimaImages(List<Pronostico> pronosticos) {
        Map<String, String> climaImages = new HashMap<>();
        
        for (Pronostico p : pronosticos) {
            String clima = p.getClima().toLowerCase(); 
            String imageUrl = "";
    
            
            switch (clima) {
                case "nublado":
                    imageUrl = "/images/iconoNubes.png";
                    break;
                case "despejado":
                    imageUrl = "/images/iconoDespejado.png";
                    break;
                case "lluvioso":
                    imageUrl = "/images/iconoLluvia.png";
                    break;
                
            }
    
            climaImages.put(p.getHora().toString(), imageUrl);
        }
    
        return climaImages;
    }
    
}
