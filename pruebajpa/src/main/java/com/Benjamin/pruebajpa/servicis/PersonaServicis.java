/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Benjamin.pruebajpa.servicis;

import com.Benjamin.pruebajpa.model.Persona;
import com.Benjamin.pruebajpa.repository.IPersonaRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicis implements IPersonaservicis{
    @Autowired
    private IPersonaRepository per_repo;

    @Override
    public ArrayList<Persona> traerpesrsona() {
      ArrayList<Persona > listaPerso=(ArrayList<Persona >) per_repo.findAll();
      
          
        return listaPerso;
    }

    @Override
    public void savePersona(Persona per) {
    per_repo.save(per);
    }

    @Override
    public void deletePersona(Long id) {
        per_repo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
   Persona per=per_repo.findById(id).orElse(null);
   return per;
    }

    @Override
    public void editPersona(Long idOriginal, String nombre, String apellido, int edad) {
Persona per=this.findPersona(idOriginal);

per.setNombre(nombre);
per.setApellido(apellido);
per.setEdad(edad);
   this.savePersona(per);
    }

    @Override
    public void editarpe(Persona perso) {
        savePersona(perso);
    }
    
            
}
