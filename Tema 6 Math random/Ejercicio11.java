/*
*
* @author David León Galisteo
* Ejercicio 11  - Tema 6
*
*/


public class Ejercicio11 {
  public static void main(String[] args) { 
    System.out.println("El programa va a mostrar 20 notas aleatorias.");
    System.out.println("Las notas serán: insuficiente, suficiente, bien, notable y sobresaliente.");
    System.out.println("Al final, aparecerá el número total de suspensos, suficientes... etc.");
    System.out.println("_______________________________________________");
    System.out.println("Presione INTRO para iniciar.");
    System.console().readLine();
  
    int contadorIns = 0; //insuficientes
    int contadorSuf = 0; //suficientes
    int contadorBien = 0; //bienes
    int contadorNot = 0; //notables
    int contadorSob = 0; //sobresalientes
    String calificacion = (" "); //muestra en texto el valor de la nota
    
    int nota = 0;
    
    for (int i = 1; i <= 20; i++) {
      nota = (int)(Math.random()*5) + 1;
            
      switch (nota) {
        case 1:
        contadorIns++;
        calificacion = ("insuficiente");
        break;
        
        case 2:
        contadorSuf++;
        calificacion = ("suficiente");
        break;
        
        case 3:
        contadorBien++;
        calificacion = ("bien");
        break;
        
        case 4:
        contadorNot++;
        calificacion = ("notable");
        break;
        
        case 5:
        contadorSob++;
        calificacion = ("sobresaliente");
        break;
        
        default:
      }
      
      System.out.print("\nTu nota es: " + calificacion);
    } //for
    System.out.println();
    System.out.println("\nEl número total de suspensos es de: " + contadorIns);
    System.out.println("El número total de suficientes es de: " + contadorSuf);
    System.out.println("El número total de bienes es de: " + contadorBien);
    System.out.println("El número total de notables es de: " + contadorNot);
    System.out.println("El número total de sobresalientes es de: " + contadorSob);
    
  }
}
