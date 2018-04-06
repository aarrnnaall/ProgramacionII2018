/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consigna1;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author arnal
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona pers= new Persona();
        long _dni;
        String _nombre;
        String _apellido;
        Fecha fecha;
        int dia,mes,ano;
        System.out.print("Introduzca Nombre: ");
        _nombre = sc.nextLine();
        System.out.print("Introduzca Apellido: ");
        _apellido = sc.nextLine();
        
        System.out.print("Introduce Dni: ");
        _dni = sc.nextInt();
        
        System.out.print("Introduce Fecha de Nacimiento: ");
        System.out.println("Dia: ");
        dia = sc.nextInt();
        System.out.println("Mes: ");
        mes = sc.nextInt();
        System.out.println("Año: ");
        ano = sc.nextInt();
        
        PersonaConNaciomiento nac = new PersonaConNaciomiento();
        
        
        pers.input(_dni, _apellido, _nombre);
        pers.show();
    
        
    }
    
}
