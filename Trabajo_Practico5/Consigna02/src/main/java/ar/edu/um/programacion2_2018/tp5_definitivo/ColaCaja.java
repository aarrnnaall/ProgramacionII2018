/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.tp5_definitivo;
import java.util.LinkedList;
import java.util.Queue;

public class ColaCaja extends Thread{
        
	private Queue<Cliente> clientes = new LinkedList<Cliente>();

	public ColaCaja() { 
		super(																																																																																													);
	}
	
	public Queue<Cliente> getClientes() {
		return clientes;
	}

	public Cliente getCliente() {
		return clientes.poll();
	}

	public void setClientes(Queue<Cliente> clientes) {
		this.clientes = clientes;
	}

}
