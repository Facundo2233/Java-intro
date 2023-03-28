
package ejercicio5;
///Escribir un programa que lea un número entero por teclado
/// y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 

import java.util.Scanner;


public class Ejercicio5 {

   
    public static void main(String[] args) {
        
    Scanner lector= new Scanner(System.in);
   /// Carga de Scanner
    int numero;
    int numero_doble;
    int numero_triple;
    int raiz;
    /// Variables de tipo entero
    
    System.out.println(" Ingrese un numero: "); 
    numero=lector.nextInt();
    /// Lectura de numero
    
    numero_doble= numero*2;
    numero_triple=numero*3;
    raiz= (int) Math.sqrt(numero);
    /// Uso de sqrt(Raiz cuadrada)
    /// Operaciones de tipo resultado

    System.out.println("El doble es: " + numero_doble);
    System.out.println("El triple es: " + numero_triple);
    System.out.println("Su raiz es: " + raiz);
///En consola


    }
    
}


