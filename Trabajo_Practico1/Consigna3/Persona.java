/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consigna1;
/**
 *
 * @author arnal
 */
public class Persona {

    private long dni;
private String apellido;
private String nombre;

    public Persona() {
    }

    public Persona(long dni, String apellido, String nombre) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
    }


    public long getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
public void input(long _dni,String _apellido,String _nombre){
setDni(_dni);
setApellido(_apellido);
setNombre(_nombre);
}
public void show() {

    System.out.println(+getDni());
    System.out.println(getNombre()+" "+getApellido());     
    

}    
}
