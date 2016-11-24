/*
*
* @author David León Galisteo
* Ejercicio 18  - Tema 6
*
*/


public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Vavamos a sacar 3 colores aleatorios no repetidos para");
    System.out.println("los dormitorios de Sinestesio y Casilda.");
    System.out.println("_____________________________________________");
    System.out.println("Pulse INTRO para sacar 3 colores.");
    System.console().readLine();
        
    
    int a = 0; //guarda los valores de los colores para posteriormente comprobar si se repiten o no
    int b = 0;
    int c = 9; 
    
    String color1 = (" ");
    String color2 = (" ");
    String color3 = (" ");
    
    do {
      a = (int)(Math.random()*6) + 1;
      switch (a) { //se le asigna a "a" un color
        case 1:
          color1 = ("rojo");
          break;
          
          case 2:
          color1 = ("azul");
          break;
          
          case 3:
          color1 = ("verde");
          break;
          
          case 4:
          color1 = ("amarillo");
          break;
          
          case 5:
          color1 = ("violeta");
          break;
          
          case 6:
          color1 = ("naranja");
          break;
          
          default:
        } //switch colores
        
      b = (int)(Math.random()*6) + 1;
      switch (b) { //se le asigna a "a" un color
        case 1:
          color2 = ("rojo");
          break;
          
          case 2:
          color2 = ("azul");
          break;
          
          case 3:
          color2 = ("verde");
          break;
          
          case 4:
          color2 = ("amarillo");
          break;
          
          case 5:
          color2 = ("violeta");
          break;
          
          case 6:
          color2 = ("naranja");
          break;
          
          default:
        } //switch colores
        
      c = (int)(Math.random()*6) + 1;
      switch (c) { //se le asigna a "a" un color
        case 1:
          color3 = ("rojo");
          break;
          
          case 2:
          color3 = ("azul");
          break;
          
          case 3:
          color3 = ("verde");
          break;
          
          case 4:
          color3 = ("amarillo");
          break;
          
          case 5:
          color3 = ("violeta");
          break;
          
          case 6:
          color3 = ("naranja");
          break;
          
          default:
        } //switch colores
    } while ((a == b) || (a == c) || (b == c));
     
    System.out.println("\n" + color1 + (" ") + color2 + (" ") + color3);     
            
  }
}
