
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
public class TrabajosPracticosTest {
@Test
    public void Test() {  
//TrabajosPracticos(int numero, String ejecicio, int horalaboral)
TrabajosPracticos cont1=new TrabajosPracticos(11,"ejercicio1",10);
//this.numero +"-"+ this.ejecicio+"-"+ this.horalaboral;
String expresult=11+"-ejercicio1-"+10;
String result=cont1.toString();
assertEquals(expresult,result);
    }
    
}
