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
        //Size value is less than 1
        assertEquals(false, nuevaBebida.nombreBebida("")); 
    }
}
