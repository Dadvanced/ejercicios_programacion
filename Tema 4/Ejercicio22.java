/*
/
/ @author David León Galisteo
/
/ Ejercicio 22
*/
public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.println("\nVamos a calcular cuántos minutos quedan para el");
    System.out.println("fin de semana. Para ello introduce el día, horas y minutos");
    System.out.println("_____________________________________________\n");
    System.out.print("\n Introduce el día (ANTES del viernes): ");
    
    String dia = System.console().readLine().toLowerCase();
    
    if (dia.equals("viernes") || dia.equals("sabado") || dia.equals("domingo")) {
      System.out.println("El día introducido no es válido");
    }
    
    System.out.println("_____________________________________________\n");
    System.out.print("\nAhora introduce las horas: ");
    
    int horas = Integer.parseInt(System.console().readLine());
    
    if (horas >24) {
      System.out.println("La hora introducida no es correcta");
    }
    
    System.out.println("_____________________________________________\n");
    System.out.print("\nAhora los minutos: ");
    
    int minutos = Integer.parseInt(System.console().readLine());
    
    if (minutos >60) {
      System.out.println("Los minutos introducidos son incorrectos");
    }
        
    int minutosTotales = (horas * 60) + minutos;
    
    int startWeekend = 8100;
    
    int dayToMinutes = 0;
    
    switch (dia) {
      case "lunes":
        dayToMinutes = 1;
      break;
      
      case "martes":
        dayToMinutes = 2;
      break;
      
      case "miercoles":
        dayToMinutes = 3;
      break;
      
      case "jueves":
        dayToMinutes = 4;
      break;
      
      default:
              
    }
  System.out.println("_____________________________________________\n");
  System.out.println("\nLos minutos que faltan para el fin de semana son: " + (startWeekend - (minutosTotales + (dayToMinutes * 1440))));
  
  }
}
        
    
    
  
  
      
