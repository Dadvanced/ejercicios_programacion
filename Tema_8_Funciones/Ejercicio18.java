/*
*
* @author David León Galisteo
* Tema 8: Funciones - Ejercicio 18
*
*/

import matematicas.FuncionesMatematicas;
import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Vamos a pasar un número decimal a binario.");
    System.out.println("____________________________________________\n");
    
    Scanner n = new Scanner(System.in);
    
    System.out.println("Por favor, introduzca un número decimal entero positivo: ");
    int decimal = Integer.parseInt(n.nextLine());
    
    System.out.println(FuncionesMatematicas.decToBinary(decimal));
  }
}
