/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.practicoN1;
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
        
        System.out.print("Introduzca Nombre: ");
        _nombre = sc.nextLine();
        System.out.print("Introduzca Apellido: ");
        _apellido = sc.nextLine();
        
        System.out.print("Introduce Dni: ");
        _dni = sc.nextInt();
        
        pers.input(_dni, _apellido, _nombre);
        pers.show();
        
        
    }
    
}
