/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.tpn2_consigna1;

/**
 *
 * @author arnal
 */
public class Cargo {
private String nombre;
private double basico;

    public Cargo(String nombre, double basico) {
        this.nombre = nombre;
        this.basico = basico;
    }

    public Cargo() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public String getNombre() {
        return nombre;
    }

    public double getBasico() {
        return basico;
    }
public String toString(){   
return this.basico +"-"+ this.nombre;
}
}
