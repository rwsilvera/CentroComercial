package com.rodolfo.sprintboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "Personas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Persona extends Socio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PERSONA")
    private Long id;


    @Column(name ="CEDULA" )
    private int cedula;
    @Column(name = "NOMBRES",length = 50)
    private String nombre;
    @Column(name = "APELLIDOS",length = 50)
    private String apellido;
    @Column(name = "SEXO",length = 50)
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @Column(name = "FECHA_NACIMIENTO")
    private LocalDate fechaNacimiento;






}
