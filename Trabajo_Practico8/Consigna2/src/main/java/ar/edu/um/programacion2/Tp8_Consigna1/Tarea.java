package ar.edu.um.programacion2.Tp8_Consigna1;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tarea")

public class Tarea {

	@Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

	
    @Column(name = "Inicio")
    protected String fecha;

    @Column(name = "Autor")
    protected String autor;
    
    @Column(name = "Descripcion")
    protected String desc;

    public Long getId() {
        return id;
    }
    public void setId(Long idmod) {
        this.id = idmod;
    }

    public void setInicio(String fecha) {
        this.fecha = fecha;
    }

    public String getInicio() {
        return fecha;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
   
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public Tarea() {

    }
    
    public Tarea(String fecha, String autor,String desc) {
    	this.fecha = fecha;
        this.autor = autor;
        this.desc = desc;
    }
    @Override
    public String toString() {
        StringBuilder datos = new StringBuilder();
        System.out.println ("-------------------------------");
        datos.append("Tarea Nº: "+this.id+"\n");
        datos.append("Inicio: ");
        datos.append(this.fecha);
        datos.append("\n");
        datos.append("Autor: ");
        datos.append(this.autor);
        datos.append("\n");
        datos.append("Descripcion: ");
        datos.append(this.desc);
        datos.append("\n");
        return datos.toString();
    }

}
