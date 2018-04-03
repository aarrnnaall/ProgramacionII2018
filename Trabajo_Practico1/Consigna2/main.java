/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consigna2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author arnal
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
Scanner sc = new Scanner(System.in);
        Fecha fecha= new Fecha();
        
        int _dia, _mes,_ano;
        int _dia2, _mes2,_ano2;
        int _sumadia;
        System.out.println("Ingresar Primer Fecha");
        System.out.print("Dia: ");
        _dia = sc.nextInt();
        System.out.print("Mes: ");
        _mes = sc.nextInt();
        System.out.print("Año: ");
        _ano = sc.nextInt();
        
        System.out.println("Ingresar Segunda Fecha");
        System.out.print("Dia: ");
        _dia2 = sc.nextInt();
        System.out.print("Mes: ");
        _mes2 = sc.nextInt();
        System.out.print("Año: ");
        _ano2 = sc.nextInt();
        
        System.out.println("Opciones");
        System.out.println("1)Comparar fechas");
        System.out.println("2)Sumar o Restar dias");
        int opcion = sc.nextInt();
        switch (opcion) {
        case 1:
        fecha.compararFecha(_dia, _mes, _ano, _dia2, _mes2, _ano2);
        break;

        case 2:
        System.out.print("Ingresar numero: ");
        _sumadia= sc.nextInt();
        
        
        Date fecha1 = new Date(_ano-1900,_mes-1,_dia);
       
        fecha.sumarRestarDiasFecha(fecha1, _sumadia);
         
        break;

        default:

            System.out.println("Opcion NO VALIDA");

        break;

 

 }
        
        
        
                

        
        
        
        
       
// TODO code application logic here
    }
    
}
