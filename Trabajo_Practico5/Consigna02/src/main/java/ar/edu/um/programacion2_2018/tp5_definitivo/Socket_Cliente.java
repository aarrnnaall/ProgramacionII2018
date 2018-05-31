/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.tp5_definitivo;
import java.io.IOException;
import java.io.ObjectOutputStream;

import ar.edu.um.programacion2_2018.tp5_definitivo.Conexion;

public class Socket_Cliente extends Conexion
{

    		
	public Socket_Cliente() throws IOException{super("cliente");} //Se usa el constructor para cliente de Conexion

    public void startClient() //Método para iniciar el cliente
    {
        try
        {
        //Productos
        Producto pr1 = new Producto("Arroz",40);
        
        Producto pr2 = new Producto("Carne",120);
	
        Producto pr3 = new Producto("Gaseosa",60);
	
        Producto pr4 = new Producto("Galletas",20);
				
	Producto pr5 = new Producto("Leche",10);
	
        Producto pr6 = new Producto("Fideos",20);
		
        Producto pr7 = new Producto("Huevo",2);
	
        Producto pr8 = new Producto("Atum",5);
	
        //Clientes 
	Cliente cl1 = new Cliente(1,"Fernando");
		
                cl1.add(pr1);
                cl1.add(pr2);
                
        Cliente cl2 = new Cliente(2,"Carlos");
		
                cl2.add(pr3);
                cl2.add(pr4);
                
		
	Cliente cl3 = new Cliente(3,"Jose");
		
                cl3.add(pr5);
		cl3.add(pr6);
		
        
        //Cola       
        ColaCaja cola = new ColaCaja();
		
		
        cola.getClientes().add(cl1);
        
        cola.getClientes().add(cl2);
        
        cola.getClientes().add(cl3);
        
        
        //Te llana la Cola
        //Llenador lle1 = new Llenador();
        //lle1.setCola(cola);
        //lle1.start();
        
        salidaServidor = new ObjectOutputStream(cs.getOutputStream());
        while(true) {
       
            salidaServidor.writeObject(cola.getCliente());
        }
        

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}