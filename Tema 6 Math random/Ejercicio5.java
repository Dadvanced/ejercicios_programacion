/*
*
* @author David León Galisteo
* Ejercicio 5  - Tema 6
*
*/


public class Ejercicio5 {
  public static void main(String[] args) { 
    System.out.println("Vamos a mostrar 50 números aleatorios entre el 100 y el 199");
    System.out.println("(ambos incluídos)");
    System.out.println("___________________________________________");
    System.out.println("Presione INTRO para mostrar los números");
    System.console().readLine();
    
    int numero = 0;
    int numMax = 100;
    int numMin = 199;
    int sumaNumeros = 0; //guardará la suma total de los números
        
    for (int i = 1; i <= 50; i++) {
      numero = (int)(Math.random()*100) + 100;
      System.out.print(numero); //imprimimos el número aleatorio obtenido
      System.out.print(" "); //insertamos un espacio después del número
      
      if (numero < numMin) { //cambia el valor del número mínimo
        numMin = numero;
      }
      
      if (numero > numMax) { //cambia el valor del número máximo
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
