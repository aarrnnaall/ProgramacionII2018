/*System.out.println("\nIngresar Id a Buscar: ");
   int idbuscar = sn.nextInt();
   
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.basedatos.ejemplo1;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author arnal
 */
public class ImplTarea implements ITarea {

  List<Tarea> tareas = new ArrayList<Tarea>();     
  Connection con = Conexion.conexion();
  
    public ImplTarea() {
    }
	
 @Override
	public void agregarTareas(Tarea tarea) {
        
String sqlInsertar = "insert into tarea values (null,?,?,?);";
        try {
 
           
PreparedStatement stmt = null;
stmt=con.prepareStatement(sqlInsertar);
stmt.setDate(1,java.sql.Date.valueOf(tarea.getInicio()));
stmt.setString(2,tarea.getAutor());
stmt.setString(3,tarea.getDescripcion());
stmt.execute();
       //  con.close();
         
        } catch (SQLException e) {
            e.printStackTrace();
        }
	
        }
	
    @Override
    public List<Tarea> obtenerTareas() {
      try {
    PreparedStatement consulta=null;
    consulta=con.prepareStatement("SELECT * FROM tarea");
    ResultSet res = consulta.executeQuery();
    while(res.next()){  
    Tarea tarea= new Tarea();
    tarea.setId(Integer.parseInt(res.getString("id")));
    tarea.setInicio(res.getString("inicio"));
    tarea.setAutor(res.getString("autor"));
    tarea.setDescripcion(res.getString("descripcion"));
    tareas.add(tarea);
    }
     res.close();
     consulta.close();
     //con.close();
         
      } catch (SQLException ex) {
          System.out.println(ex);
      }
    return tareas;
    }
@Override
 public List<Tarea> obtenerTarea(int id) {
      try {
          PreparedStatement consulta=null;
          consulta=con.prepareStatement("SELECT * FROM tarea where id = ? ");
          consulta.setInt(1, id);
          ResultSet res = consulta.executeQuery();
    if(res.next()){  
    Tarea tarea= new Tarea();
    tarea.setId(Integer.parseInt(res.getString("id")));
    tarea.setInicio(res.getString("inicio"));
    tarea.setAutor(res.getString("autor"));
    tarea.setDescripcion(res.getString("descripcion"));
    tareas.add(tarea);
    }
       res.close();
       consulta.close();
       //con.close();
         
      } catch (SQLException ex) {
          System.out.println(ex);
      }
 
 return tareas;
    }
@Override
    public void actualizarTarea(Tarea tarea) {
    String sqlModificar = "update tarea set inicio=?,autor=?,descripcion=? where id=?;";
        try {
 
   PreparedStatement stmtmod = null;
   stmtmod=con.prepareStatement(sqlModificar);
   stmtmod.setInt(4, tarea.getId());
   stmtmod.setDate(1,java.sql.Date.valueOf(tarea.getInicio()));
   stmtmod.setString(2,tarea.getAutor());
   stmtmod.setString(3,tarea.getDescripcion());
   stmtmod.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

   
    }
@Override
   public void eliminarTarea(int id) {
   String sqlBorrar = "DELETE FROM tarea WHERE tarea.id='"+id+"';";
   Statement bor=null;
      try {
          bor= con.createStatement();
          bor.execute(sqlBorrar);
   
      } catch (SQLException ex) {
          System.out.println(ex);
      }
   
    }
    
}
