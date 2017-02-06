/**
* Prueba clases
* @author: David León Galisteo 
*
**/

import java.util.Scanner;

public class PruebaClases {
  public static void main(String[] args) {

    Pizza p1 = new Pizza("mediana", "margarita");
    Pizza p2 = new Pizza("familiar", "funghi");
    p2.sirve();
    Pizza p3 = new Pizza("mediana", "cuatro quesos");
    
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    p2.sirve();
    
    System.out.println("pedidas: " + Pizza.getEstadoPedida());
    System.out.println("servidas: " + Pizza.getEstadoServida());
  }
}
    
