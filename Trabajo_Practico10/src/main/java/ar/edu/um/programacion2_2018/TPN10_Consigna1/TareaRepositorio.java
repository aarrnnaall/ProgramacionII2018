package ar.edu.um.programacion2_2018.TPN10_Consigna1;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepositorio extends JpaRepository<Tarea, Long> {
    public List<Tarea> findByAutorAndDescAndInicio(String autor, String desc,Date inicio);

}
