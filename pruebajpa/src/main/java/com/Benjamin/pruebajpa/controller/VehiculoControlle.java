/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Benjamin.pruebajpa.controller;

import com.Benjamin.pruebajpa.model.Vehiculo;
import com.Benjamin.pruebajpa.servicis.IVehiculoServicis;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vehiculo")
public class VehiculoControlle {
   @Autowired
    private IVehiculoServicis ve;
    @PostMapping("/agregar")
    public  void agregarvehiculo(@RequestBody Vehiculo v){
        ve.crearvehi(v);
        System.out.println(v.getIdvehi());
        System.out.println(v.getMarca());
        System.out.println(v.getModelo());
        System.out.println(v.getPerso());
    }
    @GetMapping("/traertodos")
    
    public ArrayList<Vehiculo>  traervehiculo(){
        return ve.traervehiculos();
        
    }
}
