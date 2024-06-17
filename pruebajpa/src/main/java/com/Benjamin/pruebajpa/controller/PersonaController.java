/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Benjamin.pruebajpa.controller;

import com.Benjamin.pruebajpa.model.Persona;
import com.Benjamin.pruebajpa.servicis.IPersonaservicis;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/perso")
public class PersonaController {
    @Autowired
    private IPersonaservicis per;
    
    @GetMapping("/traerpersonas")
    @ResponseBody()
    public ArrayList<Persona> traerpesronas(){
       return per.traerpesrsona();
    }
    @PostMapping("/crear")
    public void crearPerso(@RequestBody Persona perso){
        
        per.savePersona(perso);
        
    }
    @DeleteMapping("/Borrar/{id}")
    public void deletePerso(@PathVariable Long id){
        per.deletePersona(id);
    }
    
    @PutMapping("/edita")
    public void editar(@RequestBody Persona perso){
        per.editarpe(perso);
    }
    
}
