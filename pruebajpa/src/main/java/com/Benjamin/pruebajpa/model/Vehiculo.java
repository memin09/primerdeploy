/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Benjamin.pruebajpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

        
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
@Entity
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idvehi;
    private String marca;
     private String modelo;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="id_perso")
     private Persona perso;
   
public Vehiculo(){
    
}

    public Vehiculo(Long idvehi, String marca, String modelo, Persona perso) {
        this.idvehi = idvehi;
        this.marca = marca;
        this.modelo = modelo;
        this.perso = perso;
    }

  

  

   
   

    
}
