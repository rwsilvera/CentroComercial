package com.rodolfo.sprintboot.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "Socios")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@NoArgsConstructor
public class Socio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_SOCIO")
    private Long id;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "ID_CUOTA_SOCIAL")
    private CuotaSocial cuotaSocial;
    @Column(name = "FECHA_ALTA")
    private LocalDate fechaAlta;
    @Column(name = "FECHA_BAJA")
    private LocalDate fechaBaja;
    @Column(name = "CELULAR",length = 20)
    private String celular;
    @Column(name = "TELEFONO",nullable = true,length = 20)
    private String telefono;
    @Column(name = "EMAIL",nullable = true,length = 70)
    private String email;
    @Column(name = "DIRECCION",length = 100)
    private String direccion;





}
