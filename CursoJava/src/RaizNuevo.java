
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alberto
 */
class RaizNuevo {
    public static void main(String[] args)throws IOException{
        
        
        BufferedReader buff=new BufferedReader(new InputStreamReader(null));
        System.out.println("Escriba un numero: ");
        String str=buff.readLine();
        
        int numero=Integer.parseInt(str);
        
        System.out.println("La raiz cuadrada de "+numero+" es "+Math.sqrt(numero));    
    }
        
}
