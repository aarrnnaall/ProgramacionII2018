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
public class ColaCaja {

    List<Cliente> lista_cliente = new ArrayList<Cliente>();     

    public ColaCaja() {
    }
    
    public ColaCaja(List<Cliente> clientes) {
		super();
		this.lista_cliente = clientes;
	}
    
    public List<Cliente> getLista() {
        return lista_cliente;
    }

    public void setLista(List<Cliente> lista) {
        this.lista_cliente = lista;
    }
   public void procesar() throws InterruptedException {
		for (int i = 0; i < lista_cliente.size(); i++) {
			System.out.println("Cliente n:" + i);
			lista_cliente.get(i).procesar();			
		}
	} 
}
