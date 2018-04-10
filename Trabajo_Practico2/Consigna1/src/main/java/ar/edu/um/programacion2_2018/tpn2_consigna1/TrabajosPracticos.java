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
public class TrabajosPracticos {
private int numero;
private String ejecicio;
private int horalaboral;

    public TrabajosPracticos() {
    }

    public TrabajosPracticos(int numero, String ejecicio, int horalaboral) {
        this.numero = numero;
        this.ejecicio = ejecicio;
        this.horalaboral = horalaboral;
    }

    public int getNumero() {
        return numero;
    }

    public String getEjecicio() {
        return ejecicio;
    }

    public int getHoralaboral() {
        return horalaboral;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEjecicio(String ejecicio) {
        this.ejecicio = ejecicio;
    }

    public void setHoralaboral(int horalaboral) {
        this.horalaboral = horalaboral;
    }

public String toString(){
return this.numero +"-"+ this.ejecicio+"-"+ this.horalaboral;
}

}
