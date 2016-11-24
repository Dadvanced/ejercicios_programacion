/*
*
* @author David León Galisteo
* Ejercicio 20  - Tema 6
*
*/
import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
    System.out.println("Vamos a pintar por pantalla una cuba de agua con");
    System.out.println("cierta cantidad de agua (al azar) y una capacidad");
    System.out.println("indicada por el usuario (el ancho de la cuba no varía).");
    System.out.println("____________________________________________");
    System.out.println("\nPulse INTRO para empezar.");
    
    Scanner n = new Scanner(System.in);
    
    n.nextLine();
    
    System.out.println("Vamos a empezar por introducir la altura de la cuba.");
    System.out.print("Altura: ");
    int capacidad = Integer.parseInt(n.nextLine());
    
    int ancho = 6; //ancho de la cuba
    int espacios = ancho -2;
    int altura = 0; //controla el "piso" por el que vamos
    int litros = (int)(Math.random()*capacidad);
    int sinLlenar = capacidad - litros; //controla las líneas vacías de l acuba
    
    for (int i = 1; i <= capacidad; i++) {
      System.out.print("\033[37m" + "■"); //pinta el primer asterísco
      
      for (int j = 1; j <= espacios; j++) {//inserta espacios
        if (altura < sinLlenar) {
          System.out.print(" ");
        } else {
          System.out.print("\033[34m" + "♒");
        }
      }//for
      
      
      System.out.print("\033[37m" + "■"); //inserta el último asterísco
      
      System.out.println();
      
      altura++;
    }
  
    
    for (int i = 1; i <= ancho; i++) { //pinta la base
      System.out.print("■");
    }
    
    System.out.println("\nLa cuba tiene una capacidad de " + capacidad + " litros y contiene " + litros + " de agua.");
    
  }
}
