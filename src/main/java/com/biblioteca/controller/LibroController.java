package com.biblioteca.controller;

import com.biblioteca.dto.LibroRequest;
import com.biblioteca.dto.LibroResponse;
import com.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping
    public ResponseEntity<LibroResponse> crearLibro(@RequestBody LibroRequest request) {
        LibroResponse nuevoLibro = libroService.crearLibro(request);
        return new ResponseEntity<>(nuevoLibro, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<LibroResponse>> listarLibros() {
        List<LibroResponse> libros = libroService.listarLibros();
        return ResponseEntity.ok(libros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LibroResponse> consultarLibro(@PathVariable String id) {
        LibroResponse libro = libroService.consultarLibro(id);
        return ResponseEntity.ok(libro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LibroResponse> actualizarLibro(@PathVariable String id, @RequestBody LibroRequest request) {
        LibroResponse libroActualizado = libroService.actualizarLibro(id, request);
        return ResponseEntity.ok(libroActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarLibro(@PathVariable String id) {
        libroService.eliminarLibro(id);
        return ResponseEntity.noContent().build();
    }
}
