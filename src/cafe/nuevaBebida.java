/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;

import java.util.regex.Pattern;

/**
 *
 * @author christian
 */
public class nuevaBebida {
    public static boolean nombreBebidaNum(String nombre)
    {
        int nomInv;
        boolean letra;
        try{
            nomInv = Integer.parseInt(nombre);
            System.out.println("El nombre contiene números. No permitido");
            
            return false;
        }
        catch (NumberFormatException ex) {
            if(letra = Pattern.matches("^[a-zA-Z]*$", nombre))
            {
                System.out.println("Nombre alfabetico");
                return true;
            }
            else
            {
                System.out.println("Nombre alfanumerico. No permitido");
                return false;
            }
        }     
    }
    
    public static boolean nombreBebida(String nombre)
    {
        
        //System.out.println("Ingresa nombre de la bebidad: "+nombre);
       // Scanner entradaEscaner = new Scanner (System.in);
        //nombre = entradaEscaner.nextLine();
        
        if(nombre.length()>=2 && nombre.length()<=15)
        {
            System.out.println("nuevo cafe: "+nombre);
            return true;
        }
        else
        {
            System.out.println("Longitud no permitida");
        }
        
        return false;
    }
    
    public static boolean tamBeb(String tam)
    {
        int tamano;
        try{
            tamano = Integer.parseInt(tam);
            if(tamano >=1 && tamano<=48)
            {
                
            }
        } 
        catch (Exception ex) {
            
        }
        
        return false;
    }
    
}
