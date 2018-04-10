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
public class Materia {
private String codigoMateria;
private String nombre; 

    public Materia() {
    }

    public Materia(String codigoMateria, String nombre) {
        this.codigoMateria = codigoMateria;
        this.nombre = nombre;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
public String toString(){
return this.codigoMateria +"-"+ this.nombre;
}

}
