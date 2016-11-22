/*
*
* @author David León Galisteo
* Ejercicio 15  - Tema 6
*
*/
import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.println("Vamos a realizar un generador de notas al azar");
    System.out.println("de forma que se genere una melodía.");
    System.out.println("_________________________________________");
    System.out.println("Pulse INTRO para comenzar el programa.");
    System.console().readLine();
    
    int numeroNotas = 0;
    int notas = 0;
    int contador = 1; //llevará la cuenta del número de notas para insertar un "|" entre compáses
    String stringNotas = (" ");
    String ultimaNota = (" ");
            
    numeroNotas = (int)(Math.random()*7) + 1;
    
    switch (numeroNotas) {
      case 1:
      numeroNotas = 4;
      break;
      
      case 2:
      numeroNotas = 8;
      break;
      
      case 3:
      numeroNotas = 12;
      break;
      
      case 4:
      numeroNotas = 16;
      break;
      
      case 5:
      numeroNotas = 20;
      break;
      
      case 6:
      numeroNotas = 24;
      break;
      
      case 7:
      numeroNotas = 28;
      break;
      
      default:
    } //while numeroNotas
    
    ///////////////////empieza la melodía
    
    for (int i = 1; i < numeroNotas; i++) { 
      notas = (int)(Math.random()*7) + 1;
                 
      switch (notas) {
        case 1:
        stringNotas = ("do");
        break;
        
        case 2:
        stringNotas = ("re");
        break;
        
        case 3:
        stringNotas = ("mi");
        break;
        
        case 4:
        stringNotas = ("fa");
        break;
        
        case 5:
        stringNotas = ("sol");
        break;
        
        case 6:
        stringNotas = ("la");
        break;
        
        case 7:
        stringNotas = ("si");
        break;
        
        default:
        
      } //switch  
      
      if (i == 1) { //guardamos en una variable el valor de la última nota coincidiendo con la primera
        ultimaNota = stringNotas;
      }
      
      
      System.out.print(stringNotas + " ");
      
      if (contador % 4 == 0) { //inserta la separación entre compáses
        System.out.print(" | ");
      }
      
      contador++;
    } //for   cierra el bucle de la melodía
    
    System.out.print(ultimaNota + " ||");
    
  }
}
