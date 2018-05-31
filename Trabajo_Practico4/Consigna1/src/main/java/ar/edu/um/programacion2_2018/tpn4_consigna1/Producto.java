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
public class Producto {
    private String nombre;
	private int precio;
	int min=100;
        int max=500;
        int tiempo = (int) (Math.random() * max) + min;
	
	public Producto() {
		super();
	}
	
	public Producto(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void procesar() throws InterruptedException {
		System.out.println("-------------- "+this.nombre + " / Tiempo:" + tiempo);
		Thread.sleep(tiempo);
	}
}
