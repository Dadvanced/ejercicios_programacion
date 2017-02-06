/**
* Prueba clases
* @author: David León Galisteo 
*
**/

import java.util.Scanner;

public class PruebaClases {
  public static void main(String[] args) {
    System.out.println("Tenemos una fracción con el siguiente numerador / denominador:");
    
    Fraccion prueba1 = new Fraccion(3, 6);
        
    System.out.println(prueba1.getNumerador() + " / " + prueba1.getDenominador());
    
    System.out.println();
    System.out.println("Vamos a multiplicar la fracción anterior por ésta otra:");
    Fraccion prueba2 = new Fraccion(4, 5);
    
    System.out.println(prueba2.getNumerador() + " / " + prueba2.getDenominador());
    
    System.out.println();
    System.out.print("El resultado es: ");
    Fraccion prueba3 = prueba1.multiplica(prueba2);
    System.out.println(prueba3.getNumerador() + " / " + prueba3.getDenominador());
        
    System.out.println();
    System.out.print("El valor invertido del resultado de multiplicar es: ");
    Fraccion prueba4 = prueba3.invierte();
    System.out.println(prueba4.getNumerador() + " / " + prueba4.getDenominador());
    
    System.out.println();
    System.out.print("Si simplificamos la anterior fracción, obtenemos lo siguiente: ");
    Fraccion prueba5 = prueba4.simplifica();
    System.out.println(prueba5.getNumerador() + " / " + prueba5.getDenominador());
    
    System.out.println();
    System.out.println("La división entre las 2 primeras fracciones es: ");
    Fraccion prueba6 = prueba1.divide(prueba2);
    System.out.println(prueba6.getNumerador() + " / " + prueba6.getDenominador());
  }
}
    
