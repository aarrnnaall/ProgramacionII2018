package ar.edu.um.programacion2_2018.basedatos.ejemplo1;
//package ar.edu.um.programacion2_2018.tp6_consigna1.Conexion;
//import ar.edu.um.programacion2_2018.basedatos.ejemplo1.Conexion;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author arnal
 */
public class Opciones {
 
public void opciones(){


    String sqlInsertar = "insert into tarea values (null,?,?,?);";
    String sqlModificar = "update tarea set inicio=?,autor=?,descripcion=? where id=?;";
    String sqlListar = "select id, inicio, autor, descripcion from tarea;";
        
        try {
   Connection con = Conexion.conexion();
   Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
            System.out.println("BD: ");
       while(!salir){
            
           System.out.println("1. Agregar");
           System.out.println("2. Modificar");
           System.out.println("3. Eliminar");
           System.out.println("4. Buscar");
           System.out.println("5. Listar");
           System.out.println("6. Salir");
            
           System.out.println("Escribe una de las opciones: ");
           opcion = sn.nextInt();
System.out.flush();
            
           switch(opcion){

               case 1:
   //
   System.out.println("---------------------------------------------------------");
   PreparedStatement stmt = null;
   stmt=con.prepareStatement(sqlInsertar);
   System.out.println("\nInicio (YYYY-MM-DD): ");
   String inicio = sn.next();
   stmt.setDate(1,java.sql.Date.valueOf(inicio));
   System.out.println("\nAutor: ");
   String autor = sn.next();
   stmt.setString(2,autor);
   System.out.println("\nDescripcion: ");
   sn.nextLine();
   String desc = sn.nextLine();
   stmt.setString(3,desc);
   stmt.execute();
   System.out.println("---------------------------------------------------------");
                   break;
               case 2:
   //listar
   System.out.println("---------------------------------------------------------");
   Statement listar = null;
   ResultSet rs = null;
   listar=con.createStatement();
   rs = listar.executeQuery(sqlListar);
   while (rs.next()) {  
   Integer id = rs.getInt("id");
   String iniciolist = rs.getString("inicio");
   String autorlist = rs.getString("autor");
   String desclist = rs.getString("descripcion");
   System.out.println("ID: "+String.valueOf(id)+" - Inicio: "+iniciolist+" - Autor: "+autorlist+" - Descripcion: "+desclist);
   }
   listar.close();
  System.out.println("---------------------------------------------------------");
   //modificar
   PreparedStatement stmtmod = null;
   stmtmod=con.prepareStatement(sqlModificar);
   System.out.println("\nIngresar Id a Modificar: ");
   int id = sn.nextInt();
   stmtmod.setInt(4, id);
   System.out.println("\nInicio (YYYY-MM-DD): ");
   String iniciomod = sn.next();
   stmtmod.setDate(1,java.sql.Date.valueOf(iniciomod));
   System.out.println("\nAutor: ");
   String autormod = sn.next();
   stmtmod.setString(2,autormod);
   System.out.println("\nDescripcion: ");
   sn.nextLine();
   String descmod = sn.nextLine();
   stmtmod.setString(3,descmod);
   stmtmod.executeUpdate();
   System.out.println("---------------------------------------------------------");
                   break;
               case 3:
  System.out.println("---------------------------------------------------------");
   Statement listar5 = null;
   ResultSet rs5 = null;
   listar5=con.createStatement();
   rs5 = listar5.executeQuery(sqlListar);
   while (rs5.next()) {  
   Integer id5 = rs5.getInt("id");
   String iniciolist5 = rs5.getString("inicio");
   String autorlist5 = rs5.getString("autor");
   String desclist5 = rs5.getString("descripcion");
   System.out.println("ID: "+String.valueOf(id5)+" - Inicio: "+iniciolist5+" - Autor: "+autorlist5+" - Descripcion: "+desclist5);
   }
   listar5.close();
  System.out.println("---------------------------------------------------------");
                   
   System.out.println("\nIngresar Id a Borrar: ");
   int idborrar = sn.nextInt();
   String sqlBorrar = "DELETE FROM tarea WHERE tarea.id='"+idborrar+"';";
   Statement bor=null;
   bor= con.createStatement();
   bor.execute(sqlBorrar);
                   break;
               case 4:
   System.out.println("---------------------------------------------------------");
   
   
   System.out.println("\nIngresar Id a Buscar: ");
   int idbuscar = sn.nextInt();
   String sqlBuscar = "select id, inicio, autor, descripcion from tarea where id='"+idbuscar+"';";
   Statement listar3 = null;
   ResultSet rs3 = null;
   listar3=con.createStatement();
   rs3 = listar3.executeQuery(sqlBuscar);
   while (rs3.next()) {  
   Integer id3 = rs3.getInt("id");
   String iniciolist3 = rs3.getString("inicio");
   String autorlist3 = rs3.getString("autor");
   String desclist3 = rs3.getString("descripcion");
   System.out.println("ID: "+String.valueOf(id3)+" - Inicio: "+iniciolist3+" - Autor: "+autorlist3+" - Descripcion: "+desclist3);
   }
   listar3.close();
   System.out.println("---------------------------------------------------------");
   
                    break;
                case 5:
   System.out.println("---------------------------------------------------------");
   Statement listar2 = null;
   ResultSet rs2 = null;
   listar2=con.createStatement();
   rs2 = listar2.executeQuery(sqlListar);
   while (rs2.next()) {  
   Integer id2 = rs2.getInt("id");
   String iniciolist2 = rs2.getString("inicio");
   String autorlist2 = rs2.getString("autor");
   String desclist2 = rs2.getString("descripcion");
   System.out.println("ID: "+String.valueOf(id2)+" - Inicio: "+iniciolist2+" - Autor: "+autorlist2+" - Descripcion: "+desclist2);
   }
   listar2.close();
   System.out.println("---------------------------------------------------------");
   
                  break;
                case 6:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 - 6");
           }
            
       }
        
   
         con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
}  

    
}
