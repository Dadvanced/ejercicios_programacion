/*
*
* @author David León Galisteo
* Ejercicio 21  - Tema 6
*
*/


public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("Vamos a lanzar cinco monedas al aire y comprobaremos");
    System.out.println("si cae en posición de \"cara\" o \"cruz\".");
    System.out.println("las monedas son de curso legal que van desde 1 céntimo");
    System.out.println("hasta los 2 €.");
    System.out.println("_____________________________________________");
    System.out.println("Pulse INTRO para empezar.");
    System.console().readLine();
    
    int dinero = 0;
    int cara = 0;
    String sCara = (""); //salida tipo texto de la cara de la moneda
    
    for (int i = 1; i <= 5; i++) {
      dinero = (int)(Math.random()*8) + 1;
      
      switch (dinero) { //tira la moneda
        case 1:
        System.out.print("1 céntimo - ");
        break;
        
        case 2:
        System.out.print("2 céntimos - ");
        break;
        
        case 3:
        System.out.print("5 céntimos - ");
        break;
        
        case 4:
        System.out.print("10 céntimos - ");
        break;
        
        case 5:
        System.out.print("20 céntimos - ");
        break;
        
        case 6:
        System.out.print("50 céntimos - ");
        break;
        
        case 7:
        System.out.print("1 euro - ");
        break;
        
        case 8:
        System.out.print("2 euros - ");
        break;
        
        default:
      }
      
      cara = (int)(Math.random()*2) + 1;
      
      switch (cara) {
        case 1:
        System.out.print("cara");
        break;
        
        case 2:
        System.out.print("cruz");
        break;
        
        default:
      }
      
      System.out.println();
      
    }//fir
    
  }
} 
