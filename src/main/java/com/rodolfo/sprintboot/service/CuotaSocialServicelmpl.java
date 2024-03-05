package com.rodolfo.sprintboot.service;

import com.rodolfo.sprintboot.entity.CuotaSocial;
import com.rodolfo.sprintboot.entity.Persona;
import com.rodolfo.sprintboot.repository.CuotaSocialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CuotaSocialServicelmpl implements CuotaSocialService {
    @Autowired
    CuotaSocialRepository cuotaSocialRepository;
    @Override
    public CuotaSocial saveCuotaSocial(CuotaSocial cuotaSocial) {
        return cuotaSocialRepository.save(cuotaSocial);

    }

    @Override
    public CuotaSocial updateCuotaSocial(Long id, CuotaSocial cuotaSocial) {
        CuotaSocial cuotaSocialUpdate = cuotaSocialRepository.findById(id).get();
        cuotaSocialUpdate.setNombre(cuotaSocial.getNombre());
        cuotaSocialUpdate.setImporte(cuotaSocial.getImporte());

        return cuotaSocialRepository.save(cuotaSocialUpdate);
    }

    @Override
    public void deleteCuotaSocial(Long id) {
        cuotaSocialRepository.deleteById(id);

    }

    @Override
    public List<CuotaSocial> findAllCuotaSocial() {
        return cuotaSocialRepository.findAll();
    }
}
