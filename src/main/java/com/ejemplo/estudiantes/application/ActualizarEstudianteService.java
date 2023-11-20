package com.ejemplo.estudiantes.application;

import com.ejemplo.estudiantes.application.mapper.EstudianteMapper;
import com.ejemplo.estudiantes.domain.Estudiante;
import com.ejemplo.estudiantes.exception.ResourceNotFoundException;
import com.ejemplo.estudiantes.infrastructure.repository.EstudianteRepository;
import com.ejemplo.estudiantes.infrastructure.repository.model.EstudianteEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
@RequiredArgsConstructor
public class ActualizarEstudianteService {

    private final EstudianteRepository estudianteRepository;
    private final VerEstudianteService verEstudianteService;

    public Estudiante actualizarEstudiante(Long id, Estudiante actualizarEstudiante) {
        estudianteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("No se encuentra el Id: " + id + ". Ingreso un Id existente")));

        EstudianteEntity estudianteActualizado = EstudianteMapper.INSTANCE.mapToEntity(actualizarEstudiante);
        estudianteActualizado.setId(id);

        EstudianteEntity numero = estudianteRepository.save(estudianteActualizado);
        log.info("Se actualizo el id: " +id);

        return EstudianteMapper.INSTANCE.mapToDomain(numero);

    }

}
