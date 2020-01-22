/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cafe.nuevaBebida;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author christian
 */
public class testNombre {
    
    @Test
    public void testNombreNumero()
    {
        //Item name is alphabetic
        assertEquals(true, nuevaBebida.nombreBebidaNum("alfabetica"));
        //Item name isn't alphabetic
        assertEquals(false, nuevaBebida.nombreBebidaNum("12345"));
        //Item name is alphanumeric
        assertEquals(false, nuevaBebida.nombreBebidaNum("alpha123"));
        
        
    }
    
   @Test
    public void testNombreLongitud() {
        
        //Item name is 2 to 15 characters in lenght
        assertEquals(true, nuevaBebida.nombreBebida("coffeyork"));
        //Item name is 2 characteres in lenght
        assertEquals(true, nuevaBebida.nombreBebida("co"));        
        //Item name is 15 characters in lenght
        assertEquals(true, nuevaBebida.nombreBebida("coffeyorkintheg"));
        //Item name is 1 characters in lenght
        assertEquals(false, nuevaBebida.nombreBebida("c"));
        //Item name is greater than 15 characters in lenght
        assertEquals(false, nuevaBebida.nombreBebida("coffeyorkinthegap"));
        
    }
    
    @Test
    public void testTamano()
    {
        //Size value is less than 1
        assertEquals(false, nuevaBebida.tamBeb("0")); 
        //Size value is in the range 1 to 48
        assertEquals(true, nuevaBebida.tamBeb("15"));
        //Size value is greater than 48
        assertEquals(false, nuevaBebida.tamBeb("49"));
        //Size value is a whole number 
        assertEquals(true, nuevaBebida.tamBeb("1"));
        //Size value is a decimal 
        assertEquals(false, nuevaBebida.tamBeb("1.5"));
        //Size value includes nonnumeric characters
        assertEquals(false, nuevaBebida.tamBeb("aw"));
        
        
        
    }
    
    @Test
    public void testVerificarSepCad()
    {
        //A comma separate each entry in the list
        assertEquals(true, nuevaBebida.verificarCadena("cafe,1,2"));
        //A comma doesn't separate two o more entries in the list
        assertEquals(false, nuevaBebida.verificarCadena("cafe-12-2"));
    }
    
    
    @Test
    public void testVerificarPrimerLugar()
    {
        //Item name is first
        assertEquals(true, nuevaBebida.verificarPrimerlugar("cafe,1,2"));
        //Item name isn't first
        assertEquals(false, nuevaBebida.verificarPrimerlugar("23,1"));
    }
    
    @Test
    public void testVerficarvalores()
    {
        //One to five values entered
        assertEquals(true, nuevaBebida.verificarTamanos("cafe,1,2,3,4,5"));
        //More than five sizes entered
        assertEquals(false, nuevaBebida.verificarTamanos("cafe,1,2,3,4,5,6"));
    }
    
    @Test
    public void testVerifOrdenTam()
    {
        //Size values entered in ascending order
        assertEquals(true, nuevaBebida.verificarOrdenTam("cafe,1,2,3,4,5"));
        //Size vales entered in nonascending order
        assertEquals(false, nuevaBebida.verificarOrdenTam("cafe,2,3,1,5,8"));
    }
}
