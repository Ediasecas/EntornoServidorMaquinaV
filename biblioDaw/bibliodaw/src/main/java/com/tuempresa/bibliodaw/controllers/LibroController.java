package com.tuempresa.bibliodaw.controllers;

import com.tuempresa.bibliodaw.services.LibroService;
import com.tuempresa.bibliodaw.entities.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    // Listar libros
    @GetMapping
    public String listarLibros(Model model) {
        List<Libro> libros = libroService.listarLibros();
        model.addAttribute("libros", libros);
        return "libros"; // Nombre del archivo HTML en templates
    }

    // Mostrar formulario para agregar un nuevo libro
    @GetMapping("/nuevo")
    public String mostrarFormularioLibro(Model model) {
        model.addAttribute("libro", new Libro(null, null, null, false));
        return "formulario-libro"; // Nombre del archivo HTML en templates
    }

    // Guardar un nuevo libro
    @PostMapping
    public String guardarLibro(@ModelAttribute Libro libro) {
        libroService.guardarLibro(libro);
        return "redirect:/libros";
    }

    // Eliminar un libro
    @GetMapping("/eliminar/{id}")
    public String eliminarLibro(@PathVariable int id) {
        libroService.eliminarLibro(id);
        return "redirect:/libros";
    }
}
