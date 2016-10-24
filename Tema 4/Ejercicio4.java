/*
*
* @author: David León Galisteo 
*
*/

public class Ejercicio4 {
  public static void main(String[] args) {

    System.out.println("¡Hola, empleado!");
    System.out.println("A continuación vamos a calcular la cantidad de € que ha ganado usted en base a las horas trabajadas durante la semana"); 
    System.out.println("Incluiremos las horas extras en el caso de haberlas realizado");
    System.out.println("Por favor, escriba la cantidad de horas trabajadas por día");

    int horas = Integer.parseInt(System.console().readLine());

    int salario; 
    
    if (horas >=41) {
		salario = 480 + ((horas - 40) * 16);
	} else {
		salario = horas * 12;
	}

    System.out.printf("La cantidad en € que ha ganado usted es de: %d \n", salario);

  }
}
