package ar.edu.um.programacion2_2018.TPN10_Consigna1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tarearest")
public class TareaControlador {

    @Autowired
    TareaRepositorio Tarea_Rep;
    //Listar las tareas
    @GetMapping("/")
    public List<Tarea> Listar() {
        List<Tarea> tareas = Tarea_Rep.findAll();
        return tareas;
    }
    //Buscar Tarea
    @GetMapping("/{id}")
    public Tarea BuscarUno(@PathVariable(name="id") Long id) {
        Tarea tarea_buscar = Tarea_Rep.findById(id).orElse(null);
        return tarea_buscar;
    }
    //Agregar tarea
    @PostMapping("/")
    public Tarea Agregar(@Valid @RequestBody Tarea persona) {
        Tarea tarea_nueva = Tarea_Rep.save(persona);
        return tarea_nueva;
    }
 // Eliminar Tarea
 	@DeleteMapping("/{id}")
 	public ResponseEntity<?> Eliminar(@PathVariable(value = "id") Long id){
 		Tarea tarea = Tarea_Rep.findById(id).orElse(null);

 		Tarea_Rep.delete(tarea);

         return ResponseEntity.ok().build();
 	}
 	
 	// Actualizar Tarea
 	@PutMapping("/{id}")
 	public Tarea Actualizar(@PathVariable(value = "id") Long id, 
 						    @Valid @RequestBody Tarea detallesTarea) {
 		
 		Tarea tarea = Tarea_Rep.findById(id).orElse(null);
 		
 		tarea.setDesc(detallesTarea.getDesc());
 		tarea.setAutor(detallesTarea.getAutor());
        tarea.setInicio(detallesTarea.getInicio());
 		
        Tarea tarea_actualizar = Tarea_Rep.save(tarea);
 		return tarea_actualizar;
 		
 	}

}
