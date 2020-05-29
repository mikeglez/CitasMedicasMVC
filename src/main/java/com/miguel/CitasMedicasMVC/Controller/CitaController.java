/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.CitasMedicasMVC.Controller;

import com.miguel.CitasMedicasMVC.models.Cita;
import com.miguel.CitasMedicasMVC.service.CitaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * @author jmigu
 */
@Controller
public class CitaController {
    @Value("${spring.application.name}")
    String appName;
    
    @Autowired
    CitaService service;
    
    @GetMapping("/citas")
    public String Citas(Model model){
        List<Cita> citas = service.findAllCitas();
        model.addAttribute("citas", citas);
        return "citas";
    }
    
    @GetMapping("/agregarcita")
    public String agregarCitaPage(){
        return "agregarcita";
    }
    
    @PostMapping("/crear")
    public String crearCita(@ModelAttribute("cita") Cita cita){
        service.createCita(cita);
        return "redirect:citas";
    }
    
    @PostMapping("/eliminarcita")
    public String eliminarCita(@ModelAttribute("id") Integer id){
        service.deleteCitaById(id);
        return "redirect:citas"; 
    }
}
