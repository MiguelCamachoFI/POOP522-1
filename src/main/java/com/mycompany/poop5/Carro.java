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
public class Carro {
    private Persona chofer;
    private String lugar1;
    private Persona copiloto;
    private String lugar2;
    private Persona pasajero1;
    private String lugar3;
    private Persona pasajero2;
    private String lugar4;

    public Carro(Persona chofer, String lugar1, Persona copiloto, String lugar2, Persona pasajero1, String lugar3, Persona pasajero2, String lugar4) {
        this.chofer = chofer;
        this.lugar1 = lugar1;
        this.copiloto = copiloto;
        this.lugar2 = lugar2;
        this.pasajero1 = pasajero1;
        this.lugar3 = lugar3;
        this.pasajero2 = pasajero2;
        this.lugar4 = lugar4;
    }

    @Override
    public String toString() {
        return "Carro{" + "chofer=" + chofer + ", lugar1=" + lugar1 + ", copiloto=" + copiloto + ", lugar2=" + lugar2 + ", pasajero1=" + pasajero1 + ", lugar3=" + lugar3 + ", pasajero2=" + pasajero2 + ", lugar4=" + lugar4 + '}';
    }
    
}
