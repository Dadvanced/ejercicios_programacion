/*
*
* @author David León Galisteo
* Ejercicio 10  - Tema 6
*
*/


public class Ejercicio10 {
  public static void main(String[] args) { 
    System.out.println("El programa va a dibujar 10 líneas de tamaño aleatorio");
    System.out.println("y con carácteres aleatorios comprendidos entre:");
    System.out.println("*,-,=,.,|,@");
    System.out.println("________________________________________");
    System.out.println("Pulse INTRO para iniciar.");
    System.console().readLine();
    
    String caracter = (" ");
    int numCaracter = 0; //tomará el valor numérico de un carácter
            
    for (int i = 1; i <= 10; i++) { //controla las líneas a dibujar
      numCaracter = (int)(Math.random()*6) + 1;
      int longitud = (int)(Math.random()*40) + 1;
      
      switch (numCaracter) { //cambiará el carácter con el que se dibujará la línea
        case 1:
        caracter = ("*");
        break;
        
        case 2:
        caracter = ("-");
        break;
        
        case 3:
        caracter = ("=");
        break;
        
        case 4:
        caracter = (".");
        break;
        
        case 5:
        caracter = ("|");
        break;
        
        case 6:
        caracter = ("@");
        break;
        
        default:
      }
      
      for (int j = 1; j <= longitud; j++) {//pinta la línea
        System.out.print(caracter);
      }
      
      System.out.println();
    } //for
    
  }
} 
