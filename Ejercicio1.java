
package ejercicio1;
/// Escribir un programa que pida dos numeros enteros por teclado y calcule
///la suma de los otros dos.El programa debera despues mostrar el resultado de la suma.

import java.util.Scanner;
/// Carga de libreria, carga de paquete, carga de funcion






public class Ejercicio1 {

  
    public static void main(String[] args) {
    
      Scanner ejer = new Scanner(System.in);
      /// Carga de funcion Scanner 
      
      
      int n1;
      int n2;
      int resultado;
      /// Carga de variables 
      
      System.out.println("Ingrese el primer numero");
      /// imprimir cadena de texto
      
      n1= ejer.nextInt();
      /// Scanear valores, 
      
      System.out.println("Ingrese el segundo numero");
      
      n2= ejer.nextInt();
      /// Scanear valores, 
      resultado = n1+n2;
      /// Suma
        
      System.out.println("El resultado es: " + resultado);
      
      
      
      
        
        
        
        
        
        
    }
    
}
