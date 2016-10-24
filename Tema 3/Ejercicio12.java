/*
*
* @author: David León Galisteo 
*
*/

public class Ejercicio12 {
  public static void main(String[] args) {

   System.out.println("¡Hola!");
   System.out.println("Vamos a calcular la nota que neceistas sacar en el segundo exámen de programación para alcanzar la nota media deseada");

   System.out.println("¿Cuál ha sido tu nota en el primer exámen?");

   double primerExamen = Double.parseDouble(System.console().readLine());

   System.out.println("¿Qué nota deseas sacar como media en la asignatura?");

   double notaDeseada = Double.parseDouble(System.console().readLine());

   double notaRequerida = (notaDeseada - primerExamen * 0.4) / 0.6;  

   System.out.printf("La nota que necesitas sacar en el segundo exámen es: %.1f \n", notaRequerida);

  }
}
