/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.tpn4_consigna1;

//import java.util.Iterator;
//import java.util.List;

/**
 *
 * @author arnal
 */
public class Supermercado extends Thread{
    
   private Cajero cajero; 

    public Supermercado(Cajero cajero) {
        this.cajero = cajero;
    }

    public Supermercado() {
    }


   public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }
    
   @Override 
    public void run(){
       
           
           System.out.println("----------------");
        try {
			this.cajero.getSuCola().procesar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
       
       
    }
}



