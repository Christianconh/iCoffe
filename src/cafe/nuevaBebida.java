package cafe;

import java.util.regex.Pattern;

/**
 *
 * @author christian
 */
public class nuevaBebida {
    //String Cadena;
    
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
                System.out.println("tamaño:" + tamano);
                return true;
            }
            else
            {
                System.out.println("Solo valores 1 a 48");
            }
        } 
        catch (NumberFormatException ex) {
            System.out.println("Ingresar valor entero");
            return false;
        }
        return false;
    }
    
    public static boolean verificarCadena(String cadena)
    {
   
            String[] arrCaf = cadena.split(",", 5);
            String nombre = arrCaf[0];
            
            
            /*for(String a : arrCaf)
            {
                System.out.println(a);
            }*/
            if(arrCaf.length>1)
            {
                System.out.println("La cadena está dividida por comas");
                return true;
                
            }
            else
            {
                System.out.println("la cadena NO esta divida por comas");
                return false;
            }

    }
    
    public static boolean verificarPrimerlugar(String cadena)
    {
        String[] arrCaf = cadena.split(",", 5);
         if(nuevaBebida.nombreBebidaNum(arrCaf[0]) == false)
            {
                System.out.println("Primer valor no corresponde al nombre");
                return false;
            }
         else
         {
             System.out.println("Primer valor es el nombre");
             return true;
         }
    }
    
    public static boolean verificarTamanos(String cadena)
    {
        String[] arrCaf = cadena.split(",");
            
        if(arrCaf.length >=2 && arrCaf.length <=6)
        {
            System.out.println("Valores correctos");
            return true;
        }
        else
        {
            System.out.println("Solo se permiten de uno a cinco valores");
            return false;
        }
    }
    
    public static boolean verificarOrdenTam(String cadena)
    {
        int aux = Integer.MIN_VALUE;
        String[] arrCaf = cadena.split(",");
            
        if(arrCaf.length >=2 && arrCaf.length <=6)
        {
            for(int i=1; i<arrCaf.length; i++)
            {
                if(aux < Integer.parseInt(arrCaf[i]))
                        {
                            aux=Integer.parseInt(arrCaf[i]);
                        }
                else
                {
                    System.out.println("Los valores deben ser ingresados de menor a mayor");
                    return false;
                }
            }
                            
        }
        return true;
    }
}
