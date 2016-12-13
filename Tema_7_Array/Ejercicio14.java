/*
*
* @author David León Galisteo
* Ejercicio 14  - Tema 7
*
*/
import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("En éste programa va usted a escribir 8 palabras aleatorias, teniendo en");
    System.out.println("cuenta introducir algún que otro color.");
    System.out.println("Luego, ordenaremos los colores colocándolos a la izquierda del array.");
    System.out.println("_______________________________________________________________________");
    
    Scanner s = new Scanner(System.in);
    
    String[] colores = {
      "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"
    };
        
    String[] palabras = new String[8];
    
    System.out.println("Por favor, introduzca 8 palabras aleatorias separadas por un INTRO: ");
    for (int i = 0; i < 8; i++) {
      palabras[i] = s.nextLine();
      System.out.println("Has introducido " + (i + 1) + " palabra/s.");
    }
    
    System.out.println();
    System.out.println();    
    
    System.out.printf("\n                            ARRAY ORIGINAL                             ");
    System.out.println("\n________________________________________________________________________");
    
    for (int i = 0; i < 8; i++) {
      System.out.println("palabras[" + i + "]: " + palabras[i]);
    }
    
    String[] palabras2 = new String[8];
    
    int arrayInicio = 0;
    int arrayFinal = 7;
    boolean colorAsignado = false;
    
    //ordenamos la nueva array asignando valores    
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 9; j++) { //el valor de la j representa un color del array colores
        if (palabras[i].equals (colores[j])) {
          colorAsignado = true;
        } 
        
      } //for de "j"
      
      if (colorAsignado) {
        palabras2[arrayInicio] = palabras[i];
        arrayInicio++;
      } else {
        palabras2[arrayFinal] = palabras[i];
        arrayFinal--;
      }
      
      colorAsignado = false;
    } //for de "i"
    
    //mostramos la nueva array ordenada
     System.out.printf("\n                            ARRAY ORDENADA                             ");
    System.out.println("\n________________________________________________________________________");
    for (int i = 0; i < 8; i++) {
      System.out.println("palabras2[" + i + "]: " + palabras2[i]);
    
    } //for
  }
}
