/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Benjamin.pruebajpa.servicis;

import com.Benjamin.pruebajpa.model.Vehiculo;
import com.Benjamin.pruebajpa.repository.IVehiculo;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Vehiculoservicis implements IVehiculoServicis{
@Autowired
   private  IVehiculo ve;
    @Override
    public void crearvehi( Vehiculo v) {
ve.save(v);
    }

    @Override
    public void eliminarvehi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarvehicu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Vehiculo traervejhiculo() {
return null;
    }

    @Override
    public ArrayList<Vehiculo> traervehiculos() {
        ArrayList <Vehiculo> vei=(ArrayList<Vehiculo>) ve.findAll();
return vei ;
    }
    
}
