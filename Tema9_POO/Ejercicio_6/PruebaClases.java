/**
* Prueba clases
* @author: David León Galisteo 
*
**/

import java.util.Scanner;

public class PruebaClases {
  public static void main(String[] args) {

    Tiempo reloj = new Tiempo(2, 34, 25);
    Tiempo reloj2 = new Tiempo(13, 25, 43);
    Tiempo reloj3 = new Tiempo(17, 25, 45);
    
    System.out.print("La hora actual es: ");
    System.out.println(reloj);
    
    System.out.println();
    System.out.print("La hora en Helsinki es: ");
    System.out.println(reloj2);
    
    System.out.println();
    System.out.print("La suma de la hora actual y la de Helsinki es: ");
    Tiempo relojSuma = reloj.suma(reloj2);
    System.out.println(relojSuma);
    
    System.out.println();
    System.out.print("La hora actual en Moscú es: ");
    System.out.println(reloj3);
    
    System.out.println();
    System.out.print("La suma de la hora de Helsinki y la de Moscú es: ");
    Tiempo relojSuma2 = reloj2.suma(reloj3);
    System.out.println(relojSuma2);
    
    
  }
}
    
