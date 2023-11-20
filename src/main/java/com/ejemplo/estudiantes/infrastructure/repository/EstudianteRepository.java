package com.ejemplo.estudiantes.infrastructure.repository;

import com.ejemplo.estudiantes.infrastructure.repository.model.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteEntity, Long> {
}
