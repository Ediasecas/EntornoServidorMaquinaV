package com.tuempresa.bibliodaw.controllers;

import com.tuempresa.bibliodaw.services.PrestamoService;
import com.tuempresa.bibliodaw.entities.Prestamo;
import com.tuempresa.bibliodaw.services.LibroService;
import com.tuempresa.bibliodaw.entities.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @Autowired
    private LibroService libroService;

    // Listar préstamos
    @GetMapping
    public String listarPrestamos(Model model) {
        List<Prestamo> prestamos = prestamoService.listarPrestamos();
        model.addAttribute("prestamos", prestamos);
        return "prestamos"; // Nombre del archivo HTML en templates
    }

    // Mostrar formulario para registrar un nuevo préstamo
    @GetMapping("/nuevo")
    public String mostrarFormularioPrestamo(Model model) {
        model.addAttribute("prestamo", new Prestamo(null, null, null));
        model.addAttribute("libros", libroService.listarLibros()); // Lista de libros disponibles
        return "formulario-prestamo"; // Nombre del archivo HTML en templates
    }

    // Guardar un nuevo préstamo
    @PostMapping
    public String guardarPrestamo(@ModelAttribute Prestamo prestamo, @RequestParam int libroId) {
        Libro libro = libroService.buscarLibroPorId(libroId);
        if (libro != null && libro.isDisponible()) {
            libro.setDisponible(false); // Marcar el libro como no disponible
            prestamo.setFechaPrestamo(LocalDate.now());
            prestamo.setLibro(libro);
            prestamoService.guardarPrestamo(prestamo);
            libroService.guardarLibro(libro); // Actualizar el estado del libro
        }
        return "redirect:/prestamos";
    }

    // Eliminar un préstamo
    @GetMapping("/eliminar/{id}")
    public String eliminarPrestamo(@PathVariable int id) {
        Prestamo prestamo = prestamoService.buscarPrestamoPorId(id);
        if (prestamo != null) {
            Libro libro = prestamo.getLibro();
            if (libro != null) {
                libro.setDisponible(true); // Marcar el libro como disponible nuevamente
                libroService.guardarLibro(libro);
            }
            prestamoService.eliminarPrestamo(id);
        }
        return "redirect:/prestamos";
    }
}
