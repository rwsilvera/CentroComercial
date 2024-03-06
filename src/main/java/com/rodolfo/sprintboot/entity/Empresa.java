package com.rodolfo.sprintboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.List;

public class Empresa {
    @Column(name = "NOMBRES_FANTASIA",length = 50)
    private String nombreFantasia;
    @Column(name = "RAZON_SOCIAL",length = 50)
    private String razonSocial;
    @Column(name = "RUT",length = 12)
    private String rut;
    @Column(name = "ACTIVIDAD",length = 100)
    private String actividad;


    @Column(name = "CONTACTOS_DE_REFERENCIA")
    private List<Persona>contactos;
}
