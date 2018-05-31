/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.tp5_definitivo;
public class Cajero extends Thread{
	private Cliente cliente;
	//private static int i = 1;
	
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

        
	public Cajero() {
		
	}
	
	public Cajero(Cliente cliente) {
		super();
		this.cliente = cliente;
                
	}

    public Cliente getCola() {
        return cliente;
    }

    public void setCola(Cliente cliente) {
        this.cliente = cliente;
    }

	public void procesar() throws InterruptedException {
	    
                for (int i = 0; i < this.cliente.productos.size(); i++) {
			if(cliente.productos.get(i) != null) {
				System.out.println("Producto n:" + i);
				cliente.productos.get(i).procesar();
			        
                        }else {
				System.out.println("TERMINADO");
			}
		}
	}
	

}
