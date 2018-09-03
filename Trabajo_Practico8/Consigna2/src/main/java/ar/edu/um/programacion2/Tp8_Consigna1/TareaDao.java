package ar.edu.um.programacion2.Tp8_Consigna1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class TareaDao {
	protected SessionFactory sf;
    public TareaDao() {
        this.sf = HibernateUtils.getSessionFactory();

    }
    public void escribir(Tarea p) {
        Session ses = this.sf.openSession();
        ses.beginTransaction();
        ses.persist(p);
        ses.getTransaction().commit();
        ses.close();
    }

    public Tarea Buscar(Long id) {
    	Session ses = this.sf.openSession();
        String sql = "select p from Tarea p where p.id = :id";
        Query<Tarea> query = ses.createQuery(sql);
        query.setParameter("id",id);
        Tarea resultado = query.getSingleResult();
        return resultado;
}

    public List<Tarea> Listar() {
        Session ses = this.sf.openSession();
        ses.beginTransaction();
        String sql = "select p from Tarea p";
        Query<Tarea> query = ses.createQuery(sql);
        List<Tarea> resultado = query.getResultList();
        ses.getTransaction().commit();
        ses.close();
        return resultado;
    }

    public void Eliminar(Tarea p)	{
    	Session ses = this.sf.openSession();
    	ses.beginTransaction();
        ses.delete(p);
    	ses.getTransaction().commit();
        
    } 
   public void Modificar(Tarea p)	{
	   Session ses = this.sf.openSession();
	   ses.beginTransaction();
	   
	   ses.saveOrUpdate(p);
	   
	   ses.getTransaction().commit();
	   
   }
}
