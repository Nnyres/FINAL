package com.ejemplo.estudiantes.application;

import com.ejemplo.estudiantes.infrastructure.repository.EstudianteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class EliminacionEstudianteService {

    private final EstudianteRepository estudianteRepository;

    public void eliminarEstudiante(Long estudiantePorID) {
        if (estudianteRepository.existsById(estudiantePorID)) {
            estudianteRepository.deleteById(estudiantePorID);
            log.info("Se elimino estudiante con el id  " + estudiantePorID);
        } else {
            log.info("El estudiante con el id " + estudiantePorID + " No existe");
        }
    }
}
