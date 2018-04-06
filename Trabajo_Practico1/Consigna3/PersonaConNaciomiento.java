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
public class PersonaConNaciomiento extends Persona {
    private Fecha Nacimento ;
    private String Nacimiento;

    public PersonaConNaciomiento() {
    super();
    }

    public PersonaConNaciomiento(Fecha Nacimento, long dni, String apellido, String nombre) {
        super(dni, apellido, nombre);
        this.Nacimento = Nacimento;
    }

    public Fecha getNacimento() {
        return Nacimento;
    }

    public void setNacimento(Fecha Nacimento) {
        this.Nacimento = Nacimento;
    }
public void input(Fecha _Nacimiento){
setNacimento(_Nacimiento);
}
public void show(){   
getNacimento();
}
public String toString(){   
return this.Nacimiento;
}

}
