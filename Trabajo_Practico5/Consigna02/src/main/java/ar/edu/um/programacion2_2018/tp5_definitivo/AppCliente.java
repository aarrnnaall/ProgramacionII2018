/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ar.edu.um.programacion2_2018.servidor.cliente;
package ar.edu.um.programacion2_2018.tp5_definitivo;

import java.io.IOException;

/**
 *
 * @author arnal
 */

public class AppCliente {
	//private Persona per1= new Persona ("pepe",2);
    public static void main(String[] args) throws IOException
    {  
 
    	Socket_Cliente cli = new Socket_Cliente(); //Se crea el cliente
        
         
        System.out.println("Iniciando cliente\n");
        cli.startClient(); //Se inicia el cliente
    }
   
}