/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.advanced.impl;

import com.architecture.advanced.Animal;
import com.architecture.advanced.interfaces.IAnimalPersistencia;

/**
 *
 * @author felix
 */
public class AnimalPersistencia implements IAnimalPersistencia {

    @Override
    public void agregar(Animal animal) {
        System.out.println("agregando animal");
    }
    
}
