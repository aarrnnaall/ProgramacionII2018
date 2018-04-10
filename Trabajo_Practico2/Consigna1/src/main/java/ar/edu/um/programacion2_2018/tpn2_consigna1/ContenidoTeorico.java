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
public class ContenidoTeorico {
private String Tema;
private String descripcion;
private int horasPresenciales;

    public ContenidoTeorico() {
    }

    public ContenidoTeorico(String Tema, String descripcion, int horasPresenciales) {
        this.Tema = Tema;
        this.descripcion = descripcion;
        this.horasPresenciales = horasPresenciales;
    }

    public String getTema() {
        return Tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getHorasPresenciales() {
        return horasPresenciales;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setHorasPresenciales(int horasPresenciales) {
        this.horasPresenciales = horasPresenciales;
    }
public String toString(){
return this.Tema +"-"+ this.descripcion+"-"+ this.horasPresenciales;
}


}
