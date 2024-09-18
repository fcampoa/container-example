/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.architecture.advanced;

import com.architecture.advanced.impl.AnimalPersistencia;
import com.architecture.advanced.impl.PersonaPersistencia;
import com.architecture.advanced.interfaces.IAnimalPersistencia;
import com.architecture.advanced.interfaces.IPersonaPersistencia;

/**
 *
 * @author felix
 */
public class Advanced {

    public static void main(String[] args) throws Exception {
        var persona = new Persona("jhon", "jhon@example.com", "5551234567");
        var animal = new Animal();
        
        // Se crea el contenedor
        Contenedor contenedor = Contenedor.getContenedor();
        
        // Agregamos los servicios
        contenedor.agregarServicio(IPersonaPersistencia.class, PersonaPersistencia.class)
                  .agregarServicio(IAnimalPersistencia.class, AnimalPersistencia.class);
        
        IPersonaPersistencia persistenciaPersona = contenedor.<IPersonaPersistencia>get(IPersonaPersistencia.class);
        persistenciaPersona.agregar(persona);
        
        IAnimalPersistencia persistenciaAnimal = (IAnimalPersistencia) contenedor.obtener(IAnimalPersistencia.class);
        persistenciaAnimal.agregar(animal);
    }
}
