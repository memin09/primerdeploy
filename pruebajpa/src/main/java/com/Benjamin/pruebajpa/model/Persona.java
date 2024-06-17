/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Benjamin.pruebajpa.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   
    private String nombre;
    private String apellido;
    private int edad;
 @OneToMany(mappedBy ="perso")
    private List<Vehiculo> ve ;

    public Persona(Long id, String nombre, String apellido, int edad, List<Vehiculo> ve) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ve = new ArrayList<>();
    }



    

  


   



    public Persona() {
    }

        
}
