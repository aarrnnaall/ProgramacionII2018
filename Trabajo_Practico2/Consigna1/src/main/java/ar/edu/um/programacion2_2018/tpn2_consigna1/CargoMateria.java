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
public class CargoMateria {
    private Materia materia;
    private Cargo cargo;

    public CargoMateria(Materia materia, Cargo cargo) {
        this.materia = materia;
        this.cargo = cargo;
    }

    public CargoMateria() {
    }

    public Materia getMateria() {
        return materia;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public String toString(){   
return this.cargo +"-"+ this.materia;
}

}
