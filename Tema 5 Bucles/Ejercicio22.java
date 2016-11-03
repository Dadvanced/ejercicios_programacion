/*
*
* @author David León Galisteo
* Ejercicio 22  - Tema 5
*
*/

public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.println("\nVamos a mostrar todos los números primos comprendidos");
    System.out.println("entre los números 2 y 100 (ambos incluídos)");
    System.out.println(" ___________________________________________\n");
    
    System.console().readLine();
    
    int numero = 2;
    int i = 1;
    boolean primo = true;
    
    while (numero <=100) {
      primo = true;   
      for (i = 2; i < numero; i++) {
        if (numero % i == 0) {
          primo = false;
        }
              
      }//ciera el for
      
       if (primo) {
        System.out.print(" " + numero + " ");
        }
        
      numero++;
    } //while
    
  }
}
