package com.tuempresa.bibliodaw.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tuempresa.bibliodaw.repositories.PrestamoRepository;
import com.tuempresa.bibliodaw.entities.Prestamo;

import java.util.List;
import java.util.Optional;

@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    // Listar todos los préstamos
    public List<Prestamo> listarPrestamos() {
        return prestamoRepository.findAll();
    }

    // Guardar un préstamo
    public Prestamo guardarPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    // Eliminar un préstamo por su ID
    public void eliminarPrestamo(Integer id) {
        prestamoRepository.deleteById(id);
    }

    // Buscar un préstamo por su ID
    public Prestamo buscarPrestamoPorId(int id) {
        Optional<Prestamo> prestamo = prestamoRepository.findById(id);
        return prestamo.orElse(null); // Retorna el préstamo si existe, de lo contrario retorna null
    }
}
