/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Benjamin.pruebajpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_mascota;
   private  String nombre;
   private String raza;
   private String color;
   private String espacie;

    public Mascota(Long id_mascota, String nombre, String espacie, String raza, String color) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.espacie = espacie;
        this.raza = raza;
        this.color = color;
    }

    public Mascota() {
    }
   
   
}
