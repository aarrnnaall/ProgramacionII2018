/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.tpn4_consigna1;

//import java.util.Iterator;

/**
 *
 * @author arnal
 */
public class App {
    public static void main(String[] args) {
    
    Cliente cl1=new Cliente();
    Cliente cl2=new Cliente();
    Cliente cl3=new Cliente();
    
    
    Producto pro1=new Producto("Producto1",10);
    Producto pro2=new Producto("Producto2",20);
    Producto pro3=new Producto("Producto3",30);
    
    ColaCaja col1=new ColaCaja();
    
    ColaCaja col2=new ColaCaja();
    
    //agregando productos al Cliente 1 
    cl1.lista_producto.add(pro1);
    cl1.lista_producto.add(pro2);
    cl1.lista_producto.add(pro3);
    
    cl2.lista_producto.add(pro3);
    cl2.lista_producto.add(pro1);
    cl2.lista_producto.add(pro2);
    
    cl3.lista_producto.add(pro3);
    cl3.lista_producto.add(pro2);
    cl3.lista_producto.add(pro1);
    
    
    //agregando Clientes a la Cola Caja 
    col1.lista_cliente.add(cl1);
    col1.lista_cliente.add(cl2);    
    col1.lista_cliente.add(cl3);    
    
     Llenador l1=new Llenador(col2);
    l1.start();
//Cajeros
    Cajero caj1=new Cajero(col1);
    Cajero caj2=new Cajero(col2);
    
    
    Supermercado hilo1= new Supermercado(caj1);
    Supermercado hilo2= new Supermercado(caj2);
    hilo1.start();
    hilo2.start();
    }
}
