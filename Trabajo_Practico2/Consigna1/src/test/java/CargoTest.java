
import ar.edu.um.programacion2_2018.tpn2_consigna1.Cargo;
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
public class CargoTest {
@Test
    public void Test() {  

double _basico=1234;
Cargo carg1=new Cargo("Director",_basico);
String expresult=1234+"-Director";
String result=carg1.toString();
assertEquals(expresult,result);
    
    }
    
}
