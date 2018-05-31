/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.tpn4_consigna1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arnal
 */
public class Cliente {
    List<Producto> lista_producto = new ArrayList<Producto>();
   int Num_cli;
    public Cliente() {
		
	}

    public Cliente(int Num_cli) {
        this.Num_cli = Num_cli;
    }

   
	public List<Producto> getProductos() {
		return lista_producto;
	}

	public void setProductos(List<Producto> productos) {
		this.lista_producto = productos;
	}
	
	
	
	public void procesar() throws InterruptedException {
		for (int i = 0; i < this.lista_producto.size(); i++) {
			System.out.println("Producto n:" + i);
			lista_producto.get(i).procesar();
		}
	}
    
    
}
