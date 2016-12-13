/*
*
* @author David León Galisteo
* Ejercicio 17  - Tema 7
*
*/
import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Se va a mostrar 10 números aleatorios comprendidos entre el 0 y el 00.");
    System.out.println("Usted deberá introducir un número que se encuentre en el array.");
    System.out.println("Tras introducir el número correcto, el array rotará hasta que SU número");
    System.out.println("se encuentre en la posición 0.");
    System.out.println("________________________________________________________________________");
    
    int[] array = new int[10];
    boolean numeroCorrecto = false;
    int numero = 0;
    int indice = 0;
    Scanner n = new Scanner(System.in);
    
    System.out.println("\n┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
          System.out.print("│ Indice  ");
          for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", i);
          }
          System.out.println("│\n├─────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
          System.out.print("│ Valor   ");
          for (int i = 0; i < 10; i++) {
            array[i] = (int)(Math.random()*101);
            System.out.printf("│%4s ", array[i]);
          }
          System.out.println("│\n└─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        
    System.out.println();
    System.out.println();
    
    do {
      System.out.println("Introduzca un número que esté en el array mostrado anteriormente: ");
      numero = Integer.parseInt(n.nextLine());
      
      for (int i = 0; i < 10; i++) {
        if (array[i] == numero) {
          numeroCorrecto = true;
          indice = i; //con ésta variable sabremos desde qué posición vamos a desplazar el array
        }
      }
    } while (!numeroCorrecto);
    
    int indiceFinal = 9;
    int indiceInicial = 0;
    int indiceAux = indice; //usaremos éste auxiliar debido a que modificaremos el valor de índice
    int[] array2 = new int[10];
    
    do {
      if (indice < indiceFinal) {
        array2[indice + 1] = array[indice];
        indice++;
      }
      
      
      if (indice == 9) {
        array2[indiceInicial + 1] = array[indiceInicial];
        indiceInicial++;
      }
       
    } while (indiceInicial <= indiceAux && array2[0] != numero);
  
    array[0] = numero;
  
    System.out.println("\n┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Indice  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
      }
    System.out.println("│\n├─────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor   ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4s ",array2[i]);
      }
    System.out.println("│\n└─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
}
