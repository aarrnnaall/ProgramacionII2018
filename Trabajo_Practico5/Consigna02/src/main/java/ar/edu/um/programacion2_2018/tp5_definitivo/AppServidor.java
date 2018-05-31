/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.tp5_definitivo;
import java.io.IOException;

/**
 *
 * @author arnal
 */
public class AppServidor {
    
public static void main(String[] args) throws IOException
    {
        Socket_Servidor serv = new Socket_Servidor(); //Se crea el servidor

        System.out.println("Iniciando servidor\n");
        serv.startServer(); //Se inicia el servidor
        
        
    }
}
