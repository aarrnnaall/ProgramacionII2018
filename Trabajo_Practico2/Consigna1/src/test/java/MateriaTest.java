
import ar.edu.um.programacion2_2018.tpn2_consigna1.Materia;
import static org.junit.Assert.assertEquals;
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
public class MateriaTest {
@Test
    public void Test() {  
Materia mat1=new Materia("012","Calculo");
String expresult="012-Calculo";
String result=mat1.toString();
assertEquals(expresult,result);
    }
    
}
