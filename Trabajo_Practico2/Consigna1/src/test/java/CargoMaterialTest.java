

import ar.edu.um.programacion2_2018.tpn2_consigna1.Cargo;
import ar.edu.um.programacion2_2018.tpn2_consigna1.CargoMateria;
import ar.edu.um.programacion2_2018.tpn2_consigna1.Materia;
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
public class CargoMaterialTest {
@Test
    public void Test() {  
Materia mat1=new Materia("012","Calculo");
double _basico=1234;
Cargo carg1=new Cargo("Director",_basico);
CargoMateria matcar1 = new CargoMateria(mat1,carg1);
String expresult="1234-Director-012-Calculo";
String result=carg1.toString()+"-"+mat1.toString();
assertEquals(expresult,result);    
    }
    
}
