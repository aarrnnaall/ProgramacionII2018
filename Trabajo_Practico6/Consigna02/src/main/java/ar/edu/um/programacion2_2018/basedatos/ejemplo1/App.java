package ar.edu.um.programacion2_2018.basedatos.ejemplo1;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
 ITarea interfaz= new ImplTarea();
 
 
//  Tarea tarea= new Tarea(1,"2019-01-01","Pepe","Arnaldo");
//  interfaz.actualizarTarea(tarea);
Scanner sn = new Scanner(System.in);
boolean salir = false;
int opcion;
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
 Tarea tarea= new Tarea();
 System.out.println("\nInicio (YYYY-MM-DD): ");
 String inicio = sn.next();
 tarea.setInicio(inicio);
 System.out.println("\nAutor: ");
 String autor = sn.next();
 tarea.setAutor(autor);
 System.out.println("\nDescripcion: ");
 sn.nextLine();
 String desc = sn.nextLine();
 tarea.setDescripcion(desc);   
 interfaz.agregarTareas(tarea);
              break;
               case 2:
 
 System.out.println("\nIngresar Id a Modificar: ");
 int idmod = sn.nextInt();
 System.out.println("\nInicio (YYYY-MM-DD): ");
 String iniciomod = sn.next();
 System.out.println("\nAutor: ");
 String autormod = sn.next();
 System.out.println("\nDescripcion: ");
 sn.nextLine();
 String descmod = sn.nextLine();
 Tarea tareamod= new Tarea(idmod,iniciomod,autormod,descmod);
 interfaz.actualizarTarea(tareamod);
 
                   break;
               case 3:
 System.out.println("\nIngresar Id a Borrar: ");
 int idborrar = sn.nextInt();
 interfaz.eliminarTarea(idborrar);
                   break;
               case 4:
System.out.println("\nIngresar Id a Buscar: ");
int idbuscar = sn.nextInt();
System.out.println(interfaz.obtenerTarea(idbuscar));  
                   break;
                case 5:
System.out.println(interfaz.obtenerTareas()+"\n");
                   break;
                case 6:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 - 6");
           }
            
       }
    }
    
}