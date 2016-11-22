/*
*
* @author David León Galisteo
* Ejercicio 16  - Tema 6
*
*/


public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("¡Sea bienvenido a la máquina tragaperras \"León de jade\".");
    System.out.println("_____________________________________________");
        
    int monedas = 1; //número de tiradas del jugador
    int figuras = 0;
    int a = 0; //guarda los valores de las tiradas para posteriormente comprobar si ha salido otro igual
    int b = 0;
    int c = 0;
    int i = 0;
    String stringFiguras = (" ");
        
    do {
      System.out.println("\nPulse INTRO para jugar");
      System.out.println("Monedas: " + monedas);
      System.console().readLine();
      monedas--;
      
      for (i = 1; i <= 3; i++) { //saca los 3 "iconos"
        figuras = (int)(Math.random()*5) + 1;
        
        switch (figuras) {
          case 1:
          stringFiguras = ("corazón");
          break;
          
          case 2:
          stringFiguras = ("diamante");
          break;
          
          case 3:
          stringFiguras = ("herradura");
          break;
          
          case 4:
          stringFiguras = ("campana");
          break;
          
          case 5:
          stringFiguras = ("limón");
          break;
          
          default:
        } //switch figuras 
        
        System.out.print(stringFiguras + " "); //imprime por pantalla la figura
        
        switch (i) { //modificamos el valor de las variables para posteriormente compararlas entre ellas
        case 1:
        a = figuras;
        break;
        
        case 2:
        b = figuras;
        break;
        
        case 3:
        c = figuras;
        break;
        
        default:
      } //switch "i"
    }//for    cierra el for de las 3 figuras
      
      
          
      /////////////////comprueba si has ganado o perdido.
      if (a == b && a == c && b == c) {
        System.out.println("\n¡Enhorabuena! Ha ganado 10 monedas.");
        monedas +=10;
        i = 1;
      } else if (b == c) {
        System.out.println("\n¡Bien! Ha recuperado su moneda.");
        monedas++;
        i = 1;
      } else if (c == b) {
        System.out.println("\n¡Bien! Ha recuperado su moneda.");
        monedas++;
        i = 1;
      } else if (a == b || a == c) {
        System.out.println("\n¡Bien! Ha recuperado su moneda.");
        monedas++;
        i = 1;
      } else {
        
      }
      
      
    } while (monedas > 0);
    
    System.out.println("\n¡Lo sentimos! Se ha quedado sin monedas.");
    
  }
}
