package com.ejemplo.estudiantes.application;

import com.ejemplo.estudiantes.application.mapper.EstudianteMapper;
import com.ejemplo.estudiantes.domain.Estudiante;
import com.ejemplo.estudiantes.exception.ResourceNotFoundException;
import com.ejemplo.estudiantes.infrastructure.repository.EstudianteRepository;
import com.ejemplo.estudiantes.infrastructure.repository.model.EstudianteEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VerEstudianteService {

    private final EstudianteRepository estudianteRepository;

    public List<Estudiante> obtenerEstudiantes() {

        return estudianteRepository.findAll().stream()
                .map(estudianteEntity ->
                        Estudiante.builder()
                                .id(estudianteEntity.getId())
                                .edad(estudianteEntity.getEdad())
                                .nombre(estudianteEntity.getNombre())
                                .apellido(estudianteEntity.getApellido())
                                .build())
                .collect(Collectors.toList());
    }

    public Estudiante obtenerEstudiante(Long EstudiantePorId) {
        EstudianteEntity estuporId = estudianteRepository.findById(EstudiantePorId)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Estudiante %d no encontrado ", EstudiantePorId)));

        return EstudianteMapper.INSTANCE.mapToDomain(estuporId);
    }

}
