/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.tp5_definitivo;

import java.io.IOException;
import java.io.ObjectInputStream;

import ar.edu.um.programacion2_2018.tp5_definitivo.Conexion;

public class Socket_Servidor extends Conexion //Se hereda de conexión para hacer uso de los sockets y demás
{

		
		
		    public Socket_Servidor() throws IOException{super("servidor");} //Se usa el constructor para servidor de Conexion

    public void startServer()//Método para iniciar el servidor
    {
    	try{
    	
           
			System.out.println("Esperando... ");
			cs = ss.accept(); //Accept comienza el socket y espera una conexión desde un cliente

            System.out.println("Cliente en línea");
 
                ObjectInputStream entrada = new ObjectInputStream (cs.getInputStream()); 
                
                while(true) {
                	Cliente cli =  (Cliente)entrada.readObject();
                               try {
			//System.out.println("-----------------------");
                        //System.out.println("El Cliente: "+cli.getNombre_cliente());
                        //System.out.println("-----------------------");
                        Dividir_Cajero div=new Dividir_Cajero(cli);
                        div.dividir();
     //                   cli.wait(1000);
                               }catch (NullPointerException e) {
					break;
				}     	
                        
                        
                }
    
        }catch(Exception e){
        System.out.println(e.getMessage());
        }
    }

        
    }
