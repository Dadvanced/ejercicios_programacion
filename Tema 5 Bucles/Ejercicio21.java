/*
*
* @author David León Galisteo
*
* Ejercicio 21 tema 5 - bucles
*
*/
import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("\nEn este programa va usted a introducir tantos");
    System.out.println("números como desee, al acabar, el programa le dirá");
    System.out.println("cuántos números ha introducido, la media de los impares");
    System.out.println("y el número par mayor introducido");
    System.out.println("\nA continuación empezará usted a introducir números,");
    System.out.println("cuando quiera dejar de introducir números, introduzca");
    System.out.println("un número negativo.");
    System.out.println("________________________________________________ \n");
    
    Scanner n = new Scanner(System.in);
    int contador = 0; //contará el número de veces que se introduce un número.
    int numero = 0;
    int parMayor = 0;
    double impares = 1;
    
    do {
      System.out.print("\nIntroduzca un número: ");
      numero = Integer.parseInt(n.nextLine());
      if (numero % 2 == 0) { //comprueba si el número es par.
        if (numero > parMayor) { //comprueba si el par introducido es mayor que el anterior.
          parMayor = numero; //sustituye el valor antiguo del par por el nuevo de más valor.
        } //cierra el "if" de justo arriba.
      } else {
        impares += numero;
      } //cierra el "else"
      contador++;
    } while (numero >0);
    
    System.out.println("___________________________________________\n");
    System.out.println("La cantidad de números introducidos es de: " + contador);
    System.out.println("La media de los impares es: " + (impares / contador));
    System.out.println("El número par más grande introducido es: " + parMayor);
    
    
  }
}
