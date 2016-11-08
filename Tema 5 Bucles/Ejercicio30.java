/*
*
* @author David León Galisteo
* Ejercicio 30  - Tema 5
*
*/
import java.util.Scanner;

public class Ejercicio30 {
  public static void main(String[] args) {
    System.out.println("\nVamos a calcular las horas transcurridas entre");
    System.out.println("dos horas de dos días de la semana introducidas por teclado.");
    System.out.println("(No se tendrán en cuenta los minutos ni los segundos");
    System.out.println("______________________________________________ \n");
    
    Scanner s = new Scanner(System.in);
    boolean esDiaCorrecto;
    int horasDiarias = 0;
    String dia = " ";
    
    do  {
      System.out.print("\nIntroduce el día de la semana (con letras): ");
      dia = s.nextLine().toLowerCase();
      esDiaCorrecto = true;
      
    switch (dia) { //comprueba si el día introducido es correcto
          
      case "lunes":
      horasDiarias = 24;
      break;
      
      case "martes":
      horasDiarias = 48;
      break;
      
      case "miercoles":
      horasDiarias = 72;
      break;
      
      case "jueves":
      horasDiarias = 96;
      break;
      
      case "viernes":
      horasDiarias = 120;
      break;
      
      case "sabado":
      horasDiarias = 144;
      break;
      
      case "domingo":
      horasDiarias = 168;
      break;
      
      default:
      esDiaCorrecto = false;
    } //switch
    
    } while (!esDiaCorrecto);
    
    
    boolean esHoraCorrecta;
    int hora = 0;
    
    do {
      System.out.println("\nIntroduce la hora del día: ");
      hora = Integer.parseInt(s.nextLine());
      esHoraCorrecta = true;
      
      if ((hora < 0) || (hora > 23)) { //comprueba si la hora introducida es correcta
        esHoraCorrecta = false;
      }
      
    } while (!esHoraCorrecta);
    
    
    //            Ahora vamos cno el segundo día
    
    System.out.println("___________________________________________- \n");
    System.out.println("Ahora introduce el segundo día y hora, por favor");
    
    boolean esDiaCorrecto2;
    int horasDiarias2 = 0;
    String dia2 = " ";
    do  {
      System.out.print("\nIntroduce el día de la semana (con letras): ");
      dia2 = s.nextLine().toLowerCase();
      esDiaCorrecto2 = true;
      
    switch (dia2) { //comprueba si el día introducido es correcto
          
      case "lunes":
      horasDiarias2 = 24;
      break;
      
      case "martes":
      horasDiarias2 = 48;
      break;
      
      case "miercoles":
      horasDiarias2 = 72;
      break;
      
      case "jueves":
      horasDiarias2 = 96;
      break;
      
      case "viernes":
      horasDiarias2 = 120;
      break;
      
      case "sabado":
      horasDiarias2 = 144;
      break;
      
      case "domingo":
      horasDiarias2 = 168;
      break;
      
      default:
      esDiaCorrecto2 = false;
    } //switch
    
    } while (!esDiaCorrecto2);
    
    
    boolean esHoraCorrecta2;
    int hora2 = 0;
    
    do {
      System.out.println("\nIntroduce la hora del día: ");
      hora2 = Integer.parseInt(s.nextLine());
      esHoraCorrecta2 = true;
      
      if ((hora2 < 0) || (hora2 > 23)) { //comprueba si la hora introducida es correcta
        esHoraCorrecta2 = false;
      }
      
    } while (!esHoraCorrecta2);
    
    int horasDia1 = horasDiarias + hora;
    int horasDia2 = horasDiarias2 + hora2;
    
    if (horasDia2 < horasDia1) {
      System.out.println("\nEl día y la hora introducido no son válidos");
      System.out.println("Por favor, reinicie el programa y asegúrese de");
      System.out.println("que el segundo día introducido sea menor que el primero");
    } else {
      System.out.println("_________________________________________-\n");
      System.out.println("\nLas horas que hay entre el " + dia + " " + hora + " horas y el " + dia2 + " " + hora2 + " horas");
      System.out.println("son: " + (horasDia2 - horasDia1));
  } // else
  
}
}
