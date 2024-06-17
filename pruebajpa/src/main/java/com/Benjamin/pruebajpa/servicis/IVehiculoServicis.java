/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Benjamin.pruebajpa.servicis;

import com.Benjamin.pruebajpa.model.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author Benji
 */
public interface IVehiculoServicis {
    public void crearvehi( Vehiculo v);
    public void eliminarvehi();
    public void editarvehicu();
    public Vehiculo traervejhiculo();
    public ArrayList<Vehiculo> traervehiculos();
    
}
