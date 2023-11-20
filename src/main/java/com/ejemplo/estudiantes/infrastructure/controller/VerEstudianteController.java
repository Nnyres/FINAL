package com.ejemplo.estudiantes.infrastructure.controller;

import com.ejemplo.estudiantes.application.VerEstudianteService;
import com.ejemplo.estudiantes.domain.Estudiante;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("estudiantes")
@RequiredArgsConstructor
public class VerEstudianteController {

    private final VerEstudianteService verEstudianteService;

    @GetMapping
    public List<Estudiante> obtenerEstudiantes() {
        log.info("Se están solicitando todos los estudiantes");
        return verEstudianteService.obtenerEstudiantes();
    }

    @GetMapping("{id}") //forID
    public Estudiante obtenerEstudiante(@PathVariable("id") Long EstudiantePorId) {
        log.info("Se están solicitando el id " + EstudiantePorId + " los estudiantes");
        return verEstudianteService.obtenerEstudiante(EstudiantePorId);
    }


}
