/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.basedatos.ejemplo1;

//import java.sql.Date;


/**
 *
 * @author arnal
 */
public class Tarea {
private int id;
private String inicio;
private String autor;
private String descripcion;

    public Tarea() {
    }

    public Tarea(int id,String inicio, String autor, String descripcion) {
        this.id = id;
       
        this.inicio = inicio;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    public String getInicio() {
        return inicio;
    }

    public String getAutor() {
        return autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", inicio=" + inicio + ", autor=" + autor + ", descripcion=" + descripcion + '}';
    }

    



}
