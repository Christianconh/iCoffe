/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;

/**
 *
 * @author christian
 */
public class Cafe {

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "cafe, 1, 2";
        String[] arrCaf = cadena.split(",");
        for(String a : arrCaf)
            System.out.println(a);
        
        if(arrCaf == null)
        {
            System.out.println("vacio");
        }
        else
        {
            System.out.println("cafe agregado");
        }
        
    }
    
}
