/*
*
* @author David León Galisteo
* Ejercicio 20  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
    System.out.println("\nVamos a dibujar una pirámide hueca.");
    System.out.println("Usted deberá introducir la altura y el carácter");
    System.out.println("con el que desee que se dibuje la pirámide");
    System.out.println("_________________________________________ \n");
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca la altura de la pirámide, por favor.");
    System.out.print("Altura: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());
    
    System.out.println("\nAhora introduzca el carácter con el que desee que");
    System.out.println("se dibuje la pirámide.");
    System.out.print("Carácter: ");
    
    String c = s.nextLine();
    
    int altura = 1;
    int i = 0;
    int espaciosPorDelante = alturaIntroducida -1;
    int espaciosInternos = 0;
    
    while (altura < alturaIntroducida) {
    
    //inserta espacios por delante
    for (i = 1; i <= espaciosPorDelante; i++) {
      System.out.print(" ");
    }
    
    //pinta la línea
    System.out.print(c);
    for (i = 1; i < espaciosInternos; i++) {
      System.out.print(" ");
    }
    
    if (altura > 1) {
      System.out.print(c);
    }
    
    System.out.println();
    altura++;
    espaciosPorDelante--;
    espaciosInternos +=2;
    
  } //while
  
  //base de la pirámide
  for (i = 1; i < altura*2; i++) {
    System.out.print(c);
  }
  
 }
}
