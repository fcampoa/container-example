/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.architecture.reflection;

import com.architecture.advanced.Persona;

/**
 *
 * @author felix
 */
public class ReflectionTest {
    
    public static void main(String[] args) throws Exception {
        var persona = Persona.class.getDeclaredConstructor().newInstance();
        printMethods(Persona.class);
        printProperties(persona.getClass());
        
        var animal = Class.forName("com.architecture.advanced.Animal").getDeclaredConstructor().newInstance();
        printMethods(animal.getClass());
        printProperties(animal.getClass());
    }
    
    public static void printMethods(Class clazz) {
        var methods = clazz.getClass().getMethods();
        for(var method : methods) {
            System.out.println("method name: " + method.getName());
        }
    }
    
    public static void printProperties(Class clazz) {
        var properties = clazz.getClass().getDeclaredFields();
        for (var field : properties) {
            System.out.println("field name: " + field.getName());
        }
    }
}
