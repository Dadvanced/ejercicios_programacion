/*
*
* @author David León Galisteo
* Ejercicio 12  - Tema 6
*
*/


public class Ejercicio12 {
  public static void main(String[] args) 
  throws InterruptedException { 
    System.out.println("Vamos a rellenar la pantalla de carácteres aleatorios");
    System.out.println("simulando \"Matrix\".");
    System.out.println("___________________________________________");
    System.out.println("Pulse INTRO para que empiece la magia.");
    System.console().readLine();
    
    int linea = 0;
    
    System.out.print("\033[32m"); // pinta en verde
    
    for(int i = 0; i < 8000; i++) {
      System.out.print((char)(Math.random() * (126 - 32 + 1) + 32)); //se puede poner (*95) + 32
      
      if (linea++ == 60) {
        linea = 0;
        Thread.sleep(50);
        System.out.println();
      }
    }//for
    
  }
}

