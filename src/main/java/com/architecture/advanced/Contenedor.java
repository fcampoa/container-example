/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.advanced;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felix
 */
public class Contenedor {

    private static Contenedor instancia;
    private List objetos = new ArrayList();

    private Contenedor() {
    }

    public static Contenedor getContenedor() {
        return (instancia != null) ? instancia : (instancia = new Contenedor());
    }

    public Contenedor agregarServicio(Class interfaz, Class impl) throws Exception {
        if (interfaz.getName().equals(impl.getInterfaces()[0].getName())) {
            var exist = objetos.stream().filter(o -> o.getClass().getName().equals(impl.getClass().getName())).findFirst();
            if (exist.isEmpty()) {
                objetos.add(impl.getDeclaredConstructor().newInstance());
            }
        }
        return this;
    }

    public Object obtener(Class servicio) throws Exception {
        var exist = objetos.stream().filter(o -> o.getClass().getInterfaces()[0].getName().equals(servicio.getName())).findFirst();
        return exist.isPresent() ? exist.get() : null;
    }
    
    public <T> T get(Class<T> type) {
        var exist = objetos.stream().filter(o -> o.getClass().getInterfaces()[0].getName().equals(type.getName())).findFirst();
        return exist.isPresent() ? (T) exist.get() : null;
    }
}
