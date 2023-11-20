package com.ejemplo.estudiantes.application;

import com.ejemplo.estudiantes.application.mapper.EstudianteMapper;
import com.ejemplo.estudiantes.domain.Estudiante;
import com.ejemplo.estudiantes.infrastructure.repository.EstudianteRepository;
import com.ejemplo.estudiantes.infrastructure.repository.model.EstudianteEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreacionEstudianteService {
    private final EstudianteRepository estudianteRepository;

    public Estudiante creaEstudiante(Estudiante estudiante) {

        EstudianteEntity entity = EstudianteMapper.INSTANCE.mapToEntity(estudiante);
        EstudianteEntity estudianteResultante = estudianteRepository.save(entity);

        return EstudianteMapper.INSTANCE.mapToDomain(estudianteResultante);
    }
}
