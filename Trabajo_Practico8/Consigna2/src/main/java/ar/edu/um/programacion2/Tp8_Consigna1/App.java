package ar.edu.um.programacion2.Tp8_Consigna1;

import java.util.List;
import java.util.Scanner;



public class App 
{
    public static void main( String[] args )
    {
    	 App a = new App();
         a.arranque();
    }
    public void arranque() {
    	    Tarea tarea = new Tarea();
            TareaDao tarea_Dao = new TareaDao();
            Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner

           // System.out.println ("Tarea:");
            System.out.println ("1) Agregar: ");
            System.out.println ("2) Modificar: ");
            System.out.println ("3) Eliminar: ");
            System.out.println ("4) Buscar: ");
            System.out.println ("5) Listar:");
            
            int expresion = entradaEscaner.nextInt (); 
            switch (expresion) {

            case 1:
            	System.out.println ("\nIngresar autor: ");
                String autor = entradaEscaner.next(); 
                tarea.setAutor(autor);
                System.out.println ("\nIngresar Inicio(DD/MM/AAAA): ");
                String fecha = entradaEscaner.next(); 
                tarea.setInicio(fecha);
                System.out.println ("\nIngresar Descripcion: ");
                entradaEscaner.nextLine();
                String desc = entradaEscaner.nextLine(); 
                tarea.setDesc(desc);
                tarea_Dao.escribir(tarea);
            	    
                break;

            case 2:
            	System.out.println ("\nIngresar Id a Modificar: ");
                Long idmod = entradaEscaner.nextLong(); 
                System.out.println ("\nIngresar autor: ");
                String autormod = entradaEscaner.next(); 
                System.out.println ("\nIngresar Inicio(DD/MM/AAAA): ");
                String fechamod = entradaEscaner.next(); 
                System.out.println ("\nIngresar Descripcion: ");
                entradaEscaner.nextLine();
                String descmod = entradaEscaner.nextLine(); 
                
               Tarea tarea_mod =new Tarea();
               tarea_mod.setId(idmod);
               tarea_mod.setAutor(autormod);
               tarea_mod.setDesc(descmod);
               tarea_mod.setInicio(fechamod);
               tarea_Dao.Modificar(tarea_mod);
                
                break;

            case 3:
            	System.out.println ("\nIngresar ID a eliminar: ");
                long ideliminar = entradaEscaner.nextLong();
                Tarea tarea_buscar = tarea_Dao.Buscar(ideliminar);
                tarea_Dao.Eliminar(tarea_buscar);
                System.out.println (tarea_buscar.toString());
                System.out.println ("\n-------Eliminado-------\n");
                
                break;
            
            case 4:
            	System.out.println ("\nIngresar ID a buscar: ");
                long idbuscar = entradaEscaner.nextLong(); 
                System.out.println(tarea_Dao.Buscar(idbuscar).toString());
                
                break;
            
            case 5:
            	List<Tarea> todos = tarea_Dao.Listar();
                for (Tarea tar : todos) {
                    System.out.println(tar.toString());
                }
                break;
            
            case 6:
            
            	boolean salir = true;
                break;
             
            default:
            	System.out.println ("Opcion Invalida (1 - 6)");
                
            break;

     

     }
            
            HibernateUtils.shutdown();
        
    }		
}
