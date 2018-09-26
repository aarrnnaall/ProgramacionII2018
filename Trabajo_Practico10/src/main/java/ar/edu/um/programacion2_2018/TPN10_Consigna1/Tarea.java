package ar.edu.um.programacion2_2018.TPN10_Consigna1;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "tarea")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    @Column(name = "autor")
    protected String autor;
    @Column(name = "descripcion")
    protected String desc;
    
    @Column(name = "inicio")
    protected Date inicio;

    public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Tarea() {}

    public Tarea(String autor, String desc) {
        this.autor = autor;
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
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
}
