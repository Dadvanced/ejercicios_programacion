/*
*
* @author David León Galisteo
* Tema 8: Funciones - Ejercicio 17
*
*/

import matematicas.FuncionesMatematicas;
import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Vamos a convertir un número binario a decimal.");
    System.out.println("_______________________________________________\n");
    
    Scanner n = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca un número binario (0 y 1): ");
    int binario = Integer.parseInt(n.nextLine());
    
    System.out.println(FuncionesMatematicas.binaryToDec(binario));
  }
}
    
