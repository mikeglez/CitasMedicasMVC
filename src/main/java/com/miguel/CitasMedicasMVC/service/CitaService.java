/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.CitasMedicasMVC.service;

import com.miguel.CitasMedicasMVC.models.Cita;
import java.util.List;

/**
 *
 * @author jmigu
 */
public interface CitaService {
    
    List<Cita> findAllCitas();
    
    Cita createCita(Cita cita);
    
    Cita findCitaById(Integer id);
    
    Cita updateCitaById(Integer id, Cita cita);
    
    void deleteCitaById(Integer id);
}
