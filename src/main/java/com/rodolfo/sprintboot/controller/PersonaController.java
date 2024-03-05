package com.rodolfo.sprintboot.controller;


import com.rodolfo.sprintboot.entity.Persona;
import com.rodolfo.sprintboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    PersonaService personaService;
    @GetMapping("/findAllPersona")
    public List<Persona> findAllPersona (){

        return personaService.findAllPersona();
    }
    @PostMapping("/savePersona")
    public Persona savePersona (@RequestBody Persona persona){

        return personaService.savePersona(persona);
    }
    @PutMapping("/updatePersona/{id}")
    public Persona updatePersona(@PathVariable Long id, @RequestBody Persona persona){
        return personaService.updatePersona(id, persona);

    }
    @DeleteMapping("/deletePersona/{id}")
    public String deletePersona(@PathVariable Long id){
        personaService.deletePersona(id);

        return "Borrado Correctamente";
    }
    @GetMapping("/findPersonaByCedula/{cedula}")
    public Persona findPersonaByCedula(@PathVariable int cedula){
        return personaService.findPersonaByCedula(cedula);
    }





}
