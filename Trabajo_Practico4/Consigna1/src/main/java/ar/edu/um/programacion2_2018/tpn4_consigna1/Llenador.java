/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.tpn4_consigna1;

/**
 *
 * @author arnal
 */
public class Llenador extends Thread {
	private ColaCaja cola;
	private static int n = 1;
	private int numLlen;

	public Llenador() {
		numLlen = n++;		
	}

	public Llenador(ColaCaja cola) {
		super();
		this.cola = cola;
		numLlen = n++;
	}
	
	public ColaCaja getCola() {
		return cola;
	}

	public void setCola(ColaCaja cola) {
		this.cola = cola;
	}

	@Override
	public void run() {
		for (int i = 1 ; i <= 10 ; i++) {
			Producto prod1 = new Producto("Manteca",40);
			Cliente cl = new Cliente(i);
			cl.getProductos().add(prod1);
			this.cola.lista_cliente.add(cl);
		}
		System.out.println("Llenador " + this.numLlen + " terminado");
	}
}
