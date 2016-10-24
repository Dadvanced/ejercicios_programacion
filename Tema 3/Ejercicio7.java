/*
*
* @author: David León Galisteo 
*
*/

public class Ejercicio7 {
  public static void main(String[] args) {

    System.out.println("¡Hola! Vamos a calcular el total de una factura a partir de la base imponible");
    System.out.println("Por favor, escribe la base imponible de la factura");

    double baseImponible = Double.parseDouble(System.console().readLine());

    double iva = baseImponible * 0.21;

    double facturaTotal = iva + baseImponible;

    System.out.printf("El IVA de su factura es: %.2f \n", iva);
    System.out.printf("La factura total a pagar es de: %.2f %s \n", facturaTotal, "euros"); 
      

  }
}
