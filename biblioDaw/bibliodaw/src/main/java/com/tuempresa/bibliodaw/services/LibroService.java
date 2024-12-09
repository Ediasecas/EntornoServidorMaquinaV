package com.tuempresa.bibliodaw.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tuempresa.bibliodaw.repositories.LibroRepository;
import com.tuempresa.bibliodaw.entities.Libro;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    // Listar todos los libros
    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }

    // Guardar un libro
    public Libro guardarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    // Eliminar un libro por su ID
    public void eliminarLibro(Integer id) {
        libroRepository.deleteById(id);
    }

    // Buscar un libro por su ID
    public Libro buscarLibroPorId(int libroId) {
        Optional<Libro> libro = libroRepository.findById(libroId);
        return libro.orElse(null); // Retorna el libro si existe, de lo contrario retorna null
    }
}
