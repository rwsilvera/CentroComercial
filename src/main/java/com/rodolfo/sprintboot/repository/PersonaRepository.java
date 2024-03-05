package com.rodolfo.sprintboot.repository;



import com.rodolfo.sprintboot.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonaRepository extends JpaRepository<Persona,Long> {
    @Query("SELECT P FROM Persona  P WHERE P.cedula = :cedula")
    Persona findPersonaByCedula(int cedula);


}
