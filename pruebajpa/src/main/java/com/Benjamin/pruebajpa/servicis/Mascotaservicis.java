/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Benjamin.pruebajpa.servicis;

import com.Benjamin.pruebajpa.model.Mascota;
import com.Benjamin.pruebajpa.repository.IMascotareposirory;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mascotaservicis implements IMascotaservicis{
    @Autowired
   private IMascotareposirory mas;
   

    @Override
    public ArrayList<Mascota> traermascotas() {
        ArrayList<Mascota> mascotas=(ArrayList<Mascota>) mas.findAll();
      
        
return mascotas;
    }

    @Override
    public void agregarmascota(Mascota masc) {
mas.save(masc);
    }

    @Override
    public void eliminarmascota(Long id) {
mas.deleteById(id);
    }

    @Override
    public void editarmascota(Long id, String nombre, String raza, String color, String espacie) {
       Mascota masedi=traermascota(id);
       masedi.setNombre(nombre);
       masedi.setRaza(raza);
       masedi.setEspacie(espacie);
       masedi.setColor(color);
        agregarmascota(masedi);
    }

    @Override
    public Mascota traermascota(Long id) {
return mas.findById(id).orElse(null);
    }
    
}
