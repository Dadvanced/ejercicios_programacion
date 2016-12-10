/*[100]
*
* @author David León Galisteo
* Ejercicio 8  - Tema 7
*
*/
import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    System.out.println("Vamos a dibujar un diagrama de barras dada la temperatura media que ha");
    System.out.println("hecho en los meses de un determinado año.");
    System.out.println("(Recuerde introducir las temperaturas como números enteros).");
    System.out.println("_______________________________________________________________________");
    
    Scanner n = new Scanner(System.in);
    int[] tempMes = new int[12];
    
    String[] mes = new String[12];
    mes[0] = "Enero";
    mes[1] = "Febrero";
    mes[2] = "Marzo";
    mes[3] = "Abril";
    mes[4] = "Mayo";
    mes[5] = "Junio";
    mes[6] = "Julio";
    mes[7] = "Agosto";
    mes[8] = "Septiembre";
    mes[9] = "Octubre";
    mes[10] = "Noviembre";
    mes[11] = "Diciembre";
    
    for (int i = 0; i < 12; i++) {
      System.out.print("\nIntroduzca la temperatura media que hizo en el mes " + mes[i] + ": ");
      tempMes[i] = Integer.parseInt(n.nextLine());
    }
    
    System.out.println();
    
    for (int i = 0; i < 12; i++) { //una itineración por mes
        for (int j = 1; j <= tempMes[i]; j++) { //dibuja asteriscos para cada mes
          System.out.print("*");
        }
        
        System.out.println(); //salto de línea para un nuevo mes
      } //for
      
    }
  }
      
