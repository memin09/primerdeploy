/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Benjamin.pruebajpa.servicis;

import com.Benjamin.pruebajpa.model.Persona;
import java.util.ArrayList;

/**
 *
 * @author Benji
 */
public interface IPersonaservicis {
    public ArrayList<Persona> traerpesrsona();
    public void savePersona(Persona per);
    public void deletePersona(Long id);
    public Persona findPersona(Long id);
    public void editPersona(Long idOriginal ,String nombre,String apellido,int edad );

    public void editarpe(Persona perso);
}
