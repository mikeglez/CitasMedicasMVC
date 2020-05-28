/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.CitasMedicasMVC.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 *
 * @author jmigu
 */
@Entity
@Table(name = "cita_table")
public class Cita {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 30)
    private String nombreDoctor;
    
    @Column(length = 30)
    private String nombrePaciente;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    public Cita(){}
    public void setId(Integer id){
        this.id = id;
    }
    
    public Integer getId(){
        return id;
    }
    
    public void setNombreDoctor(String nombreDoctor){
        this.nombreDoctor = nombreDoctor;
    }
    
    public String getNombreDoctor(){
        return nombreDoctor;
    }
    
    public void setNombrePaciente(String nombrePaciente){
        this.nombrePaciente = nombrePaciente;
    }
    
    public String getNombrePaciente(){
        return nombrePaciente;
    }
    
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    
    public Date getFecha(){
        return fecha;
    }
}
