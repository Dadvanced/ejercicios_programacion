/**
* Ejercicio 1
*
* @author David León
*/

public class Ejercicio6 {
  public static void main(String[] args) {
    double precioSinIva = 37.89;
    int Iva = 21;
    double calcularIva = precioSinIva * 21 / 100;
    double precioTotal = calcularIva + precioSinIva;

    System.out.println("mi factura sin iva es: " + precioSinIva);
    System.out.println("el iva de la factura es: " + calcularIva);
    System.out.println("la factura total a pagar es: " + precioTotal);
  }
}
