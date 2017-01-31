/**
* Prueba clases
* @author: David León Galisteo 
*
**/

import java.util.Scanner;

public class PruebaClases {
  public static void main(String[] args) {
    
    Scanner n = new Scanner(System.in);
    Coche ford = new Coche();
    Bicicleta triumph = new Bicicleta();
    
    boolean exit = false;
    boolean opcionCorrecta = false;
    int option = 0;
    
    while (!exit) {
      while (!opcionCorrecta) {
        System.out.println("VEHÍCULOS");
        System.out.println("\n=========");
        System.out.println();
          
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. salir");
        System.out.println("Elige una opción (1.8)");
        System.out.println();
          
        option = Integer.parseInt(n.nextLine());
          
        if (option > 8) {
          System.out.println("Esa opción no existe, eliga entre el 1 y el 8.");
          System.out.println();
        } else {
          opcionCorrecta = true;
        }
      } //while opcionCorrecta
      
      switch (option) {
        case 1:
        triumph.andaBicicleta();
        System.out.println();
        System.out.println();
        opcionCorrecta = false;
        break;
        
        case 2:
        triumph.caballito();
        System.out.println();
        System.out.println();
        opcionCorrecta = false;
        break;
        
        case 3:
        ford.andaCoche();
        System.out.println();
        System.out.println();
        opcionCorrecta = false;
        break;
        
        case 4:
        ford.quemaRueda();
        System.out.println();
        System.out.println();
        opcionCorrecta = false;
        break;
        
        case 5:
        System.out.println("\n" + triumph.getKilometrosRecorridos() + " kilómetros");
        System.out.println();
        System.out.println();
        opcionCorrecta = false;
        break;
        
        case 6:
        System.out.println("\n" + ford.getKilometrosRecorridos() + " kilómetros");
        System.out.println();
        System.out.println();
        opcionCorrecta = false;
        break;
        
        case 7:
        System.out.println("\nLos kilómetros totales son: " + Vehiculos.getKilometrosTotales() + " kilometros");
        System.out.println();
        System.out.println();
        opcionCorrecta = false;
        break;
        
        default:
        exit = true;
      } //switch
      
    }
    
  }
}  
