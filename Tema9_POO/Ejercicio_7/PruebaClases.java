/**
* Prueba clases
* @author: David León Galisteo 
*
**/

import java.util.Scanner;

public class PruebaClases {
  public static void main(String[] args) {
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    
    Scanner n = new Scanner(System.in);
    int option = 0; //la opción del menú
    int option2 = 0; //para el submenú de la compra de entradas
    int entradas = 0;
    boolean exit = false;
    
    while (!exit) {
      switch (option) {
        case 0:
          System.out.println("\n1. Mostrar número de entradas disponibles");
          System.out.println("2. Vender entradas");
          System.out.println("3. Salir");
          option = Integer.parseInt(n.nextLine());
          break;
          
        case 1:
          System.out.println();
          System.out.println("Las entradas disponibles para las siguientes salas, son: ");
          System.out.println("_________________________________________________________");
          System.out.println(principal.getEntradasPorVender() + " entradas para la sala principal");
          System.out.println(compraVenta.getEntradasPorVender() + " entradas para la sala compra/venta");
          System.out.println(vip.getEntradasPorVender() + " entradas para la sala vip");
          System.out.println();
          option = 0;
          break;
          
        case 2:
          System.out.println();
          System.out.println("¿Para qué sala desea comprar entradas?");
          System.out.println("1. Sala principal");
          System.out.println("2. Sala compra/venta");
          System.out.println("3. Sala VIP");
          
          option2 = Integer.parseInt(n.nextLine());
          
          System.out.println();
          System.out.println("Indique ahora el número de entradas que desee comprar:");
          System.out.println();
          
          entradas = Integer.parseInt(n.nextLine());
          
          switch (option2) {
            case 1:
              principal.vender(entradas);
              option = 0;
              break;
              
            case 2:
              compraVenta.vender(entradas);
              option = 0;
              break;
              
            case 3:
              vip.vender(entradas);
              option = 0;
              break;
              
            default: 
              System.out.println("Esa opción no es válida.");
              option = 0;
          }
          break; //case 2
        
        case 3:
          exit = true;
          break;
          
        default:
          System.out.println("Esa opción no es válida.");
          option = 0;
      }
    }//while
    
  }
}
