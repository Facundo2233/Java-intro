
package ejercicio5;
///Escribir un programa que lea un número entero por teclado
/// y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 

import java.util.Scanner;


public class Ejercicio5 {

   
    public static void main(String[] args) {
        
    Scanner lector= new Scanner(System.in);
   
    int numero;
    int numero_doble;
    int numero_triple;
    int raiz;
    System.out.println(" Ingrese un numero: "); 
    numero=lector.nextInt();
    
    numero_doble= numero*2;
    numero_triple=numero*3;
    raiz= (int) Math.sqrt(numero);

    System.out.println("El doble es: " + numero_doble);
    System.out.println("El triple es: " + numero_triple);
    System.out.println("Su raiz es: " + raiz);



    }
    
}


