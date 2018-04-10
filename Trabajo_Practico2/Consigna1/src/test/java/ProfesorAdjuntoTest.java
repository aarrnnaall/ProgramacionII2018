
import ar.edu.um.programacion2_2018.tpn2_consigna1.Cargo;
import ar.edu.um.programacion2_2018.tpn2_consigna1.CargoMateria;
import ar.edu.um.programacion2_2018.tpn2_consigna1.Materia;
import ar.edu.um.programacion2_2018.tpn2_consigna1.ProfesorAdjunto;
import ar.edu.um.programacion2_2018.tpn2_consigna1.TrabajosPracticos;
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
public class ProfesorAdjuntoTest {
  @Test
    public void Test() {  
TrabajosPracticos cont1=new TrabajosPracticos(11,"ejercicio1",10);
Materia mat1=new Materia("012","Calculo");
double _basico=1234;
Cargo carg1=new Cargo("Director",_basico);

CargoMateria[] cargomateria=new CargoMateria[2];

cargomateria[0]= new CargoMateria(mat1,carg1);
cargomateria[1]= new CargoMateria(mat1,carg1);

ProfesorAdjunto profti1=new ProfesorAdjunto(cont1,1111,"Pepe","Hongito",cargomateria);
//this.profesor_id +"-"+ this.nombre+"-"+ this.apellido+"-"+ this.cargomateria+"-"+contenido;
String expresult=1111+"-Pepe-Hongito-"+"Sintactico-MuyDivertido-"+10+"-"+11+"-ejercicio1-"+10;
String result=cont1.toString();
assertEquals(expresult,result);
    }
  
    
}
