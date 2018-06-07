/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.basedatos.ejemplo1;

import java.util.List;

/**
 *
 * @author arnal
 */
public interface ITarea {
public void agregarTareas(Tarea tarea);
public List<Tarea> obtenerTareas();
public List<Tarea> obtenerTarea(int id);
public void actualizarTarea(Tarea tarea);
public void eliminarTarea(int id);
}
