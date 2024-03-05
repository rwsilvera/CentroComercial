package com.rodolfo.sprintboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Cuota_Social")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CuotaSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CUOTA_SOCIAL")
    private Long id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "IMPORTE")
    private  int importe;

}
