package com.ejemplo.estudiantes.exception;

public class ResourceNotFoundException extends RuntimeException {

    public  ResourceNotFoundException (String mensajeError) {
        super(mensajeError); // herencia
    }
}
