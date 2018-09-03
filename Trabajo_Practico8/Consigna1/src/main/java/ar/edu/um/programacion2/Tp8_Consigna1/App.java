package ar.edu.um.programacion2.Tp8_Consigna1;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;



public class App 
{
    public static void main( String[] args )
    {
    	
    	Tarea tarea = new Tarea();
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        App app= new App();
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
        	app.escribir(tarea);    
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
            app.Modificar(tarea_mod);
            break;

        case 3:
        	System.out.println ("\nIngresar ID a eliminar: ");
            long ideliminar = entradaEscaner.nextLong();
            Tarea tarea_buscar = app.Buscar(ideliminar);
            app.Eliminar(tarea_buscar);
            System.out.println (tarea_buscar.toString());
            System.out.println ("\n-------Eliminado-------\n");
            
            break;
        
        case 4:
        	System.out.println ("\nIngresar ID a buscar: ");
            long idbuscar = entradaEscaner.nextLong(); 
            System.out.println(app.Buscar(idbuscar).toString());
            
            break;
        
        case 5:
        	List<Tarea> todos = app.Listar();
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
    public void escribir(Tarea p) {
    	SessionFactory sf= HibernateUtils.getSessionFactory();

    	Session ses = sf.openSession();
        ses.beginTransaction();
        ses.persist(p);
        ses.getTransaction().commit();
        ses.close();
    }

    public Tarea Buscar(Long id) {
    	SessionFactory sf= HibernateUtils.getSessionFactory();

    	Session ses = sf.openSession();
        String sql = "select p from Tarea p where p.id = :id";
        Query<Tarea> query = ses.createQuery(sql);
        query.setParameter("id",id);
        Tarea resultado = query.getSingleResult();
        return resultado;
}

    public List<Tarea> Listar() {
    	SessionFactory sf= HibernateUtils.getSessionFactory();

    	Session ses = sf.openSession();
        ses.beginTransaction();
        String sql = "select p from Tarea p";
        Query<Tarea> query = ses.createQuery(sql);
        List<Tarea> resultado = query.getResultList();
        ses.getTransaction().commit();
        ses.close();
        return resultado;
    }

    public void Eliminar(Tarea p)	{
    	SessionFactory sf= HibernateUtils.getSessionFactory();

    	Session ses = sf.openSession();
    	ses.beginTransaction();
        ses.delete(p);
    	ses.getTransaction().commit();
        
    } 
   public void Modificar(Tarea p)	{
	   SessionFactory sf= HibernateUtils.getSessionFactory();

	   Session ses = sf.openSession();
	   ses.beginTransaction();
	   
	   ses.saveOrUpdate(p);
	   
	   ses.getTransaction().commit();
	   
   }
    
}
 