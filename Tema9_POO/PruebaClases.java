/**
* Prueba clases
* @author: David León Galisteo 
*
**/

import java.util.Scanner;

public class PruebaClases {
  public static void main(String[] args) {
    System.out.println("Tenemos una yegua llamada Epona a la cual le gusta correr mucho.");
    
    Caballo epona = new Caballo(12, "marrón", "hembra", true, false, "Epona");
    
    epona.corre();
    
    System.out.println();
    
    epona.corre(20);
    
    System.out.println("El peso de Epona es: " + epona.getPeso() + " kilos.");
    System.out.println("Inserte el nuevo peso de " + epona.nombre + ": ");
    
    Scanner n = new Scanner(System.in);
    Double pesoNuevo = Double.parseDouble(n.nextLine());
    
    epona.setPeso(pesoNuevo);
    System.out.println("El nuevo peso de " + epona.nombre + " es: " + epona.getPeso());
  }
}
    
