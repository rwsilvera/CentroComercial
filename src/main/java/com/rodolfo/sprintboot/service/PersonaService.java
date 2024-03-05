package com.rodolfo.sprintboot.service;


import com.rodolfo.sprintboot.entity.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> findAllPersona();
    Persona savePersona(Persona persona);
    Persona updatePersona(Long id,Persona persona);
    void deletePersona(Long id);
    Persona findPersonaByCedula(int cedula);

}
