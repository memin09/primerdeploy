/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Benjamin.pruebajpa.controller;

import com.Benjamin.pruebajpa.model.Mascota;
import com.Benjamin.pruebajpa.servicis.IMascotaservicis;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mascotacontroller {
    @Autowired
    private IMascotaservicis mas;
    @GetMapping("/traer/{id}")
    @ResponseBody
    public Mascota mostrarmasco(@PathVariable Long id){
        return mas.traermascota(id);
    }
    @GetMapping("/traermascotas")
    @ResponseBody
    public ArrayList<Mascota>mostrarmascotas(){
        return mas.traermascotas();
    }
    @DeleteMapping("/eliminar")
    public void deletemasco(@RequestParam Long id){
        mas.eliminarmascota(id);
    }
    @PostMapping("/agregar")
    public void agregarmasco(@RequestBody Mascota masc){
        mas.agregarmascota(masc);
    }
    @PutMapping("/editar")
    public void editarmasco(@RequestParam Long id,@RequestParam String nombre,@RequestParam String apelllido,@RequestParam String raza,@RequestParam String especie,@RequestParam String color){
        mas.editarmascota(id, nombre, raza, color, especie);
    }
    
    
}
