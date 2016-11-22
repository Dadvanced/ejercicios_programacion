/*
*
* @author David León Galisteo
* Ejercicio 4  - Tema 6
*
*/
import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) { 
    System.out.println("Piensa un número entre 0 y el 100, el programa tratará");
    System.out.println("de averiguar el número que has pensado en 5 intentos.");
    System.out.println("deberás indicarle al programa si el número que él ha pensado");
    System.out.println("es mayor o menor que el tuyo.");
    System.out.println("______________________________________________");
    System.out.println("Número de intentos: 5");
    System.out.println("\nPiense el número y luego Pulse INTRO para continuar.");
    System.console().readLine();
    
    int intentos = 5;
    Scanner n = new Scanner(System.in);
    int numero = 0; //la variable que usará el programa para intentar adivinar el número
    boolean acertado = false;
    String respuesta = (" "); //ésta variable almacena la respuesta del usuario
    int rangoMinimo = 0;
    int rangoMaximo = 100;
    
    
    
    do {
                
      System.out.print("¿Has pensado éste número?: ");
      numero = (int)(Math.random() * (rangoMaximo - rangoMinimo) + rangoMinimo);
      System.out.print(numero);
            
      System.out.println(); //salto de línea
      
      System.out.print("Responde con \"s\" o \"n\": ");
      respuesta = n.nextLine();
      
      if (respuesta.equals("s")) { //pregunta si ha acertado el número
        System.out.println("¡¡¡Ole!!!");
        acertado = true;
      } else {
        System.out.println("En ese caso...");
        System.out.print("¿Es el número que has pensado mayor? s/n: ");
        respuesta = n.nextLine();
      }
      
            
            
      if (respuesta.equals("s") && !acertado) {
        rangoMinimo = numero + 1;
        intentos--;
        System.out.println("\nIntentos: " + intentos);
      } else if (respuesta.equals("n") && !acertado) {
        rangoMaximo = numero + 1;
        intentos--;
        System.out.println("\nIntentos: " + intentos);
      }
      
         
      
      respuesta = (" ");
      System.out.println("______________________________________");
      System.out.println("\nPulse INTRO para continuar.");
      System.console().readLine();
    } while (intentos > 1 && !acertado);
    
    //////////////////////última oportunidad
    
    if (!acertado) {
      numero = (int)(Math.random() * (rangoMaximo - rangoMinimo) + rangoMinimo);
      System.out.print("\n¿Has pensado éste número?: ");
      System.out.print(numero);
    
    System.out.println(); //salto de línea
      
      System.out.print("Responde con \"s\" o \"n\": ");
      respuesta = n.nextLine();
      
      if (respuesta.equals("s")) { //pregunta si ha acertado el número
        System.out.println("¡¡¡Ole!!!");
        acertado = true;
      } else {
        intentos--;
      }
      
    }
    
    if (intentos == 0 && !acertado) {
      System.out.println("\nNo encontré tu número, has ganado :(");
    }        
        
  }
}
