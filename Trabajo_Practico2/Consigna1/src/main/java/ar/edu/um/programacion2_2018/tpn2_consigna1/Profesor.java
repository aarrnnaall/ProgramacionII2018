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
public class Profesor {
int profesor_id;
String nombre;
String apellido;
CargoMateria[] cargomateria;

    public Profesor() {
    }

    public Profesor(int profesor_id, String nombre, String apellido, CargoMateria[] cargomateria) {
        this.profesor_id = profesor_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargomateria = cargomateria;
    }

    public int getProfesor_id() {
        return profesor_id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public CargoMateria[] getCargomateria() {
        return cargomateria;
    }

    public void setProfesor_id(int profesor_id) {
        this.profesor_id = profesor_id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCargomateria(CargoMateria[] cargomateria) {
        this.cargomateria = cargomateria;
    }

public String toString(){
return this.profesor_id +"-"+ this.nombre+"-"+ this.apellido+"-"+ this.cargomateria;
}


}
