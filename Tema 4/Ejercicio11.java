/*
/
/ @author David León Galisteo
/
/ Ejercicio 11
*/

public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.println("Vamos a calcular los segundos que quedan para medianoche");
    System.out.println("Por favor introduce la hora y los minutos");
    System.out.println("Formato 24H");
    System.out.printf("__________________________________________ \n");
    System.out.print("Horas:");
    
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Minutos");
    
    int minutos = Integer.parseInt(System.console().readLine());
    
    int horasAsegundos = (horas * 60) * 60;
    
    int minutosAsegundos = minutos * 60;
           
    int hastaMedianoche = 86400 - (horasAsegundos + minutosAsegundos);
    
    System.out.println("Los segundos que quedan: " + hastaMedianoche);
    
  }
}
