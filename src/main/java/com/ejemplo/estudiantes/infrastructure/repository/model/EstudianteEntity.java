package com.ejemplo.estudiantes.infrastructure.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "estudiante")
@Data
@Builder
@NoArgsConstructor //Agrega el constructor vacio
@AllArgsConstructor //Agrega el constructor que recibe TODOS los parametros
public class EstudianteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private int edad;
}
