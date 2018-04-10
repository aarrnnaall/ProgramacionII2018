
import ar.edu.um.programacion2_2018.tpn2_consigna1.ContenidoTeorico;
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
public class ContenidoTeoricoTest {
@Test
    public void Test() {  
//ContenidoTeorico(String Tema, String descripcion, int horasPresenciales)
ContenidoTeorico cont1=new ContenidoTeorico("Sintactico","MuyDivertido",10);
//this.Tema +"-"+ this.descripcion+"-"+ this.horasPresenciales;
String expresult="Sintactico-MuyDivertido-"+10;
String result=cont1.toString();
assertEquals(expresult,result);
    }
     
}
