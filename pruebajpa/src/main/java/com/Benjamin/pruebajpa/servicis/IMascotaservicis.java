/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Benjamin.pruebajpa.servicis;

import com.Benjamin.pruebajpa.model.Mascota;
import java.util.ArrayList;

/**
 *
 * @author Benji
 */
public interface IMascotaservicis {
    public Mascota traermascota(Long id);
    public ArrayList<Mascota> traermascotas();
    public void agregarmascota(Mascota mas);
    public void eliminarmascota(Long id);
    public void editarmascota(Long id,  String nombre,
    String raza,
    String color,
    String espacie);
}
