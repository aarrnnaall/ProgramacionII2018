
import ar.edu.um.programacion2_2018.tpn2_consigna1.Cargo;
import ar.edu.um.programacion2_2018.tpn2_consigna1.CargoMateria;
import ar.edu.um.programacion2_2018.tpn2_consigna1.ContenidoTeorico;
import ar.edu.um.programacion2_2018.tpn2_consigna1.Materia;
import ar.edu.um.programacion2_2018.tpn2_consigna1.ProfesorTitular;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arnal
 */
public class ProfesorTitularTest {
  @Test
    public void Test() {  
ContenidoTeorico cont1=new ContenidoTeorico("Sintactico","MuyDivertido",10);
Materia mat1=new Materia("012","Calculo");
double _basico=1234;
Cargo carg1=new Cargo("Director",_basico);

CargoMateria[] cargomateria=new CargoMateria[2];

cargomateria[0]= new CargoMateria(mat1,carg1);
cargomateria[1]= new CargoMateria(mat1,carg1);

//ProfesorTitular(ContenidoTeorico contenido, int profesor_id, String nombre, String apellido, CargoMateria[] cargomateria)

ProfesorTitular profti1=new ProfesorTitular(cont1,1111,"Pepe","Hongito",cargomateria);
//this.profesor_id +"-"+ this.nombre+"-"+ this.apellido+"-"+ this.cargomateria+"-"+contenido;
String expresult=1111+"-Pepe-Hongito-"+"Sintactico-MuyDivertido-"+10+"-1234-Director-012-Calculo";
String result=cont1.toString();
assertEquals(expresult,result);
    }
  
}
