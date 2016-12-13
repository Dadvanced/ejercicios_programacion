/*
*
* @author David León Galisteo
* Ejercicio 15  - Tema 7
*
*/
import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.println("Bienvenidos al restaurante \"Come y calla\".");
    
    int[] ocupacion = new int[10];
    Scanner n = new Scanner(System.in);
    int clientes = 0;
    boolean salir = false; //sale del programa al ser true
    boolean mesaAsignada = false; //si se asigna una mesa romperá el bucle for
    boolean clientesCorrectos = false; //lo utilizaremos para controlar cuándo entra a un bucle
    
    for (int i = 0; i < 10; i++) {
      ocupacion[i] = (int)(Math.random()*5);
    }
    
    ///////////////////////genera el valor aleatorio de las mesas del restaurante//////////////////
    System.out.println("\n┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Mesa nº ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", (i + 1));
    }
    System.out.println("│\n├─────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│Ocupación");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4s ", ocupacion[i]);
    }
    System.out.println("│\n└─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    ///////////////////////////////////////////////////////////////////////////////////////////////
    
    
    while (!salir) { //vienen los clientes
      System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa): ");
      clientes = Integer.parseInt(n.nextLine());
      
      switch (clientes) { //comprueba que los clientes sean 1 o 4 y el usuario no salga dle programa
        case -1:
        salir = true;
        break;
        
        case 1:
        case 2:
        case 3:
        case 4:
        clientesCorrectos = true;
        break;
        
        default:  
        System.out.println("Lo sentimos, no admitimos grupos de " + clientes + ", haga grupos de"); 
        System.out.println("4 personas como máximo e intente de nuevo.");
        System.out.println();
        break;
        
      }//wsitch
          
      while (!salir && clientesCorrectos) {
         /////////asigna los nuevos clientes a una mesa///////
         for (int i = 0; i <= 9 && !mesaAsignada; i++) {
          for (int j = 0; j <= 9 && !mesaAsignada; j++) { //comprueba primero que haya mesas libres
            if (ocupacion[j] == 0) {
              ocupacion[j] += clientes;
              System.out.println("Por favor, siéntese en la mesa número " + (j + 1) + ".");
              mesaAsignada = true;
            }
          }
            
          if (!mesaAsignada && (ocupacion[i] + clientes <= 4)) {
            ocupacion[i] += clientes;
            System.out.println("Tendrán que compartir mesa.");
            System.out.println("Por favor, siéntese en la mesa número " + (i + 1) + ".");
            mesaAsignada = true;
          } 
          
          if (!mesaAsignada && i == 9) { 
            //si no quedan espacios libres en las mesas, se sale del programa
            System.out.println("Lo siento, en estos momentos no queda sitio.");
            salir = true;
          }
            
        }//for
        
          //////////////mesa con nuevos clientes///////////////////////
          System.out.println("\n┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
          System.out.print("│ Mesa nº ");
          for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", (i + 1));
          }
          System.out.println("│\n├─────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
          System.out.print("│Ocupación");
          for (int i = 0; i < 10; i++) {
            System.out.printf("│%4s ", ocupacion[i]);
          }
          System.out.println("│\n└─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
          /////////////////////////////////////////////////////////////////////////////////
          mesaAsignada = false;
          clientesCorrectos = false;          
        }//while   
                
      }//while  line 39    
           
  }
}
