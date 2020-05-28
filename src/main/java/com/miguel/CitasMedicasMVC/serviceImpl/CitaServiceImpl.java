/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.CitasMedicasMVC.serviceImpl;

import com.miguel.CitasMedicasMVC.dao.CitaRepository;
import com.miguel.CitasMedicasMVC.models.Cita;
import com.miguel.CitasMedicasMVC.service.CitaService;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author jmigu
 */

@Service
@AllArgsConstructor

public class CitaServiceImpl implements CitaService{
    
    public CitaRepository repository;

    @Override
    public List<Cita> findAllCitas() {
        return repository.findAll();
    }
    
    @Override
    public Cita createCita(Cita cita){
        cita.setFecha(new Date());
        return repository.save(cita);
    }

    @Override
    public Cita findCitaById(Integer id) {
        return repository.findCitaById(id);
    }

    @Override
    public Cita updateCitaById(Integer id, Cita cita) {
        
        Cita citaDB = findCitaById(id);
        citaDB.setNombreDoctor(cita.getNombreDoctor());
        citaDB.setNombrePaciente(cita.getNombrePaciente());
        citaDB.setFecha(new Date());
        createCita(citaDB);
        return citaDB;
    }

    @Override
    public void deleteCitaById(Integer id) {
        repository.deleteById(id);
    }
}
