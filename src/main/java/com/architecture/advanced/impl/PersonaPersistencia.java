/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.advanced.impl;

import com.architecture.advanced.Persona;
import com.architecture.advanced.interfaces.IPersonaPersistencia;

/**
 *
 * @author felix
 */
public class PersonaPersistencia implements IPersonaPersistencia{

    @Override
    public void agregar(Persona persona) {
        System.out.println("agregando persona");
    }
    
}
