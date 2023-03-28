
package ejercicio4;
/// Pasar Centigrados a Fahrent

import java.util.Scanner;


public class Ejercicio4 {

 
    public static void main(String[] args) {
       ////  F = 32 + (9 * C / 5).
   
        Scanner lector= new Scanner(System.in);
        
        double F, C;
        /// Numero posibles con coma
        
        System.out.println("Ingrese la cantidad de grados Celsius : ");
        
        C= lector.nextDouble();
        
        F= 32 + (9 * C / 5);
        
        
       System.out.println(C+ " Grados Celsius equivalen a: " +F+
                " grados Fahrenheit ");






    }
    
}
