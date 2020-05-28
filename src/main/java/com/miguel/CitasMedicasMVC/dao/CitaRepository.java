/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.CitasMedicasMVC.dao;

import com.miguel.CitasMedicasMVC.models.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jmigu
 */
public interface CitaRepository extends JpaRepository<Cita, Integer> {
    
    Cita findCitaById(Integer id);
}
