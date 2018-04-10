
import ar.edu.um.programacion2_2018.tpn2_consigna1.Cargo;
import ar.edu.um.programacion2_2018.tpn2_consigna1.CargoMateria;
import ar.edu.um.programacion2_2018.tpn2_consigna1.Materia;
import ar.edu.um.programacion2_2018.tpn2_consigna1.Profesor;
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
public class ProfesorTest {
@Test
    public void Test() {  
int profesor_id=1234;
String nombre="Pepe";
String apellido="Hoguito";
  
Materia mat1=new Materia("012","Calculo");
double _basico=1234;
Cargo carg1=new Cargo("Director",_basico);

CargoMateria[] cargomateria=new CargoMateria[2];

cargomateria[0]= new CargoMateria(mat1,carg1);
cargomateria[1]= new CargoMateria(mat1,carg1);

//this.profesor_id +"-"+ this.nombre+"-"+ this.apellido+"-"+ this.cargomateria;
Profesor prof1=new Profesor(profesor_id,nombre,apellido,cargomateria);

String expresult="1234-Pepe-Honguito-1234-Director-012-Calculo";
String result=prof1.toString();
assertEquals(expresult,result);
    }
    
}
