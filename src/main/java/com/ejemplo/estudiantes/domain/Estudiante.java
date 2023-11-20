package com.ejemplo.estudiantes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Estudiante {
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
}
