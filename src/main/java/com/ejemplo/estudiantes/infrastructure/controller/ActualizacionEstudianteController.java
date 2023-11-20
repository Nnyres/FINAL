package com.ejemplo.estudiantes.infrastructure.controller;

import com.ejemplo.estudiantes.application.ActualizarEstudianteService;
import com.ejemplo.estudiantes.domain.Estudiante;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("estudiantes")
@RequiredArgsConstructor
public class ActualizacionEstudianteController {

    public final ActualizarEstudianteService actualizarEstudianteService;

    @PutMapping("{id}")
    public Estudiante actualizarEstudiante(@PathVariable("id") Long id, @RequestBody Estudiante estudiante) {
        log.info("Se actualizara estudiante con el ID " + id);
        return actualizarEstudianteService.actualizarEstudiante(id, estudiante);
    }
}
