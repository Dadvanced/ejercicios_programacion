/*
*
* @author David León Galisteo
* Ejercicio 19  - Tema 6
*
*/


public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("Vamos a mostrar 50 número aleatorios enteros comprendidos");
    System.out.println("entre el -100 y el 200 ambos incluídos y separados por");
    System.out.println("espacios. Tambien se mostrará el máximo de los pares");
    System.out.println("el mínimo de los impares y la media de todos los números generados.");
    System.out.println("______________________________________________");
    System.out.println("\nPulse INTRO para empezar");
    System.console().readLine();
    
    int numero = 0;
    int numMax = -100;
    int numMin = 200;
    int sumaNumeros = 0; //guardará la suma total de los números
        
    for (int i = 1; i <= 50; i++) {
      numero = (int)(Math.random()*301) + (-100);
      System.out.print(numero); //imprimimos el número aleatorio obtenido
      System.out.print(" "); //insertamos un espacio después del número
      
      if ((numero % 2 == 1 ) && numero < numMin) { //cambia el valor del número mínimo
        numMin = numero;
      }
      
      if ((numero % 2 == 0) && numero > numMax) { //cambia el valor del número máximo
        numMax = numero;
      }
      
      sumaNumeros += numero;
      
    }//for
    
    int media = sumaNumeros / 50;
    
    System.out.println(); //inserta un salto de línea
    System.out.println("\nEl número máximo obtenido es: " + numMax);
    System.out.println("El número mínimo obtenido es: " + numMin);
    System.out.println("La media de todos esos números es: " + media);
    
  }
}

