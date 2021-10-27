/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop5;

/**
 *
 * @author migue
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("###Getters y Setters###");
        Circulo cir = new Circulo();
        System.out.println(cir);
        cir.setRadio(5);
        System.out.println(cir);
        System.out.println("Radio de cir = "+cir.getRadio());
        cir.setRadio((float) 7.2);
        cir.setRadio((float) 8.9);
        cir.setRadio((float) 7.66);
        
        float var = 5;
        cir.setRadio(var);

        cir.setRadio(-7);
        System.out.println(cir);
        
        System.out.println("###Composición 1###");
        Persona persona1 = new Persona();
        System.out.println(persona1);
        persona1.setNombre("Miguel");
        persona1.setApellido("Camacho");
        Fecha fNac1 = new Fecha(27,12,2001);
        persona1.setfNacimiento(fNac1);
        System.out.println(persona1);
        
        System.out.println("###Composición 2###");
        Fecha fNac2 = new Fecha(25,10,1999);
        Persona persona2 = new Persona("Ricardo", "Lopéz", fNac2);
        System.out.println(persona2);
        
        System.out.println("###Composición 3###");
        //Fecha fNac3 = new Fecha(22,4,1998);
        Persona persona3 = new Persona("Liliana","Fuentes",22,4,1998);
        System.out.println(persona3);
        
        System.out.println("###Actividad extra###");
        Persona c1 = new Persona("Juan","Pascual",25,9,1994);
        Persona c2 = new Persona("Araceli","Fernández",4,8,1996);
        Persona c3 = new Persona("Paula","Romero",30,8,1995);
        Persona c4 = new Persona("Rebeca","Carmona",21,4,1997);
        Carro pasajeros = new Carro(c1,"Estoy en la posición del piloto",c2,"Estoy en la posición del copiloto",c3,"Estoy en la posición del pasajero 1",c4,"Estoy en la posición de pasajero");
        System.out.println(pasajeros);
    }
}
