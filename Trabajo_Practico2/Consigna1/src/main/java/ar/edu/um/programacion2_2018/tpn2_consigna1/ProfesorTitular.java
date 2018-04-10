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
public class ProfesorTitular extends Profesor {
    private ContenidoTeorico contenido;

    public ProfesorTitular() {
    }

    public ProfesorTitular(ContenidoTeorico contenido) {
        this.contenido = contenido;
    }

    public ProfesorTitular(ContenidoTeorico contenido, int profesor_id, String nombre, String apellido, CargoMateria[] cargomateria) {
        super(profesor_id, nombre, apellido, cargomateria);
        this.contenido = contenido;
    }

    public ContenidoTeorico getContenido() {
        return contenido;
    }

    public void setContenido(ContenidoTeorico contenido) {
        this.contenido = contenido;
    }
  @Override
public String toString(){
return this.profesor_id +"-"+ this.nombre+"-"+ this.apellido+"-"+ this.cargomateria+"-"+this.contenido;
    }

}


