package com.rodolfo.sprintboot.controller;

import com.rodolfo.sprintboot.entity.CuotaSocial;
import com.rodolfo.sprintboot.service.CuotaSocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CuotaSocialController {
    @Autowired
    CuotaSocialService cuotaSocialService;
    @PostMapping("/saveCuotaSocial")
    public CuotaSocial saveCuotaSocial(@RequestBody CuotaSocial cuotaSocial ){

        return cuotaSocialService.saveCuotaSocial(cuotaSocial);
    }
    @PutMapping("/updateCuotaSocial/{id}")
    public CuotaSocial updateCuotaSocial(@PathVariable Long id,@RequestBody CuotaSocial cuotaSocial){
        return cuotaSocialService.updateCuotaSocial(id,cuotaSocial);

    }
    @DeleteMapping("/deleteCuotaSocial/{id}")
    public String deleteCuotaSocial(@PathVariable Long id){
        cuotaSocialService.deleteCuotaSocial(id);

        return "Borrada Correctamente";
    }
    @GetMapping("/finAllCuotaSocial")
    public List<CuotaSocial> findAllCuotaSocial(){
        return cuotaSocialService.findAllCuotaSocial();
    }


}
