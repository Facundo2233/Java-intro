
package ejercicio3;
 ///Escribir un programa que pida una frase y la muestre toda en may�sculas y despu�s toda en min�sculas.  
import java.util.Scanner;
      
        
        
        
public class Ejercicio3 {

 
    public static void main(String[] args) {
      
    String frase="";
    Scanner hp= new Scanner(System.in);
    /// hp nombre del scanner
    
    
    System.out.println("Ingrese la oracion");
    frase=hp.nextLine();


    System.out.println(frase.toUpperCase()) ;
    /// Mayu
    
    System.out.println(frase.toLowerCase());
    ///Min
 
    
    
    
    
    
    
    
    
        
        
       
    }
    
}
