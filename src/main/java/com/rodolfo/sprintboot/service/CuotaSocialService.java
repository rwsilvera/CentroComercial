package com.rodolfo.sprintboot.service;

import com.rodolfo.sprintboot.entity.CuotaSocial;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CuotaSocialService {
    CuotaSocial saveCuotaSocial(CuotaSocial cuotaSocial);
    CuotaSocial updateCuotaSocial(Long id, CuotaSocial cuotaSocial);
    void deleteCuotaSocial(Long id);
    List<CuotaSocial>findAllCuotaSocial();

}
