/*
*
* @author David León Galisteo
* Ejercicio 21  - Tema 4
*
*/

public class Ejercicio21 {
  public static void main(String[] args) { 
    System.out.println("\n Vamos a calcular la nota media de la asignatura programación.");
    System.out.println("Para ello deberás introducir tus notas de los 2 exámenes realizados");
    System.out.println("y, en el caso de haber hecho exámen de recuperación indicar si has acabado");
    System.out.println("como apto o no apto");
    System.out.println("________________________________________\n");
    System.out.println("________________________________________\n");
    System.out.print("Introduce la nota del primer exámen ");
    
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("________________________________________\n");
    System.out.print("\nIntroduce la nota del segundo exámen ");
    
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.println("________________________________________\n");
    System.out.println("________________________________________\n");
    
    double media = (nota1 + nota2) / 2;
    
    if (media >=5) {
      System.out.println("\n ¡Enhorabuena! Has aprobado y tu nota media es de " + media);
    } else {
      System.out.println("\n Lo siento, has suspendido y debes de hacer la recuperación.");
      System.out.println("Suponiendo que ya lo has hecho, ¿Qué calificación has obtenido?");
      System.out.println("(elegir una opción pulsando a o b");
      System.out.println("________________________________________\n");
      System.out.print("\n a: apto ");
      System.out.print("\n b: no apto ");
      
      String recuperacion = System.console().readLine().toLowerCase();
      
      switch (recuperacion) {
        case "a":
        System.out.println("\n ¡Enhorabuena! Has podido recuperar el exámen y tu nota media es 5");
        break;
        
        case "b":
        System.out.println("\n Lo siento, has suspendido tambien la recuperación y tu nota media sigue en " + media);
        break;
        
        default:
        
      }
    } //cierra el else
 
  }
}
    
