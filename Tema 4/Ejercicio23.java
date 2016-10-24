/*
*
* @author David León Galisteo
* Ejercicio 23  - Tema 4
*
*/
import java.util.Scanner;
public class Ejercicio23 {
  public static void main(String[] args) {
    
    System.out.println("\nVamos a calcular la base imponible, el IVA y el descuento de una cantiudad");
    System.out.println("introducida por usted.");
    System.out.println("________________________________________________ \n");
    
    System.out.print("Por favor, comienza por introducir el valor imponible: ");
    
    Scanner datos = new Scanner(System.in);
    
    Double valorImponible = Double.parseDouble(datos.nextLine());
    
    System.out.println("________________________________________________ \n");
    System.out.println("________________________________________________ \n");
    System.out.println("\nAhora introduce el tipo de IVA");
    System.out.print("general, reducido o superreducido: ");
    
    String iva = datos.nextLine();
    
    int valorIva = 0;
    
    if (iva.equals("general")) {
      valorIva = 21;
    } else if (iva.equals("reducido")) {
      valorIva = 10;
    } else if (iva.equals("superreducido")) {
      valorIva = 4;
    } else {
      System.out.println("\nEl tipo de IVA introducido es incorrecto");
    }
    
    Double ivaImponible = (valorImponible * valorIva) / 100;   
    
    System.out.println("________________________________________________ \n");
    System.out.println("________________________________________________ \n");
    System.out.println("\nY por último escriba el tipo de código promocional aplicado");
    System.out.println("nopro, media, meno5, 5proc: ");
    
    String promocion = datos.nextLine();
    
    Double precioPromocion = 0.00;
    
    if (promocion.equals("nopro")) {
      precioPromocion = (valorImponible + ivaImponible);
    } else if (promocion.equals("media")) {
      precioPromocion = (valorImponible + ivaImponible) / 2;
    } else if (promocion.equals("meno5")) {
      precioPromocion = (valorImponible + ivaImponible) - 5;
    } else if (promocion.equals("5proc")) {
      precioPromocion = (valorImponible + ivaImponible) * 0.5;
    } else {
      System.out.println("\nEl código promocional introducido es incorrecto");
    }    
    
    System.out.println("________________________________________________ \n");
    System.out.println("________________________________________________ \n");
    System.out.printf("\nBase imponible:                 %.2f \n ", valorImponible);
    System.out.printf("IVA:                           %.2f \n ", ivaImponible);
    System.out.println("Precio con IVA:                " + (valorImponible + ivaImponible)); 
    System.out.printf("Código promocional:(%s) -  %.2f \n",promocion, precioPromocion); 
    System.out.println("\n_____________________________________________ \n");
    System.out.println("\nTOTAL: " + ((valorImponible + ivaImponible) - precioPromocion)); 
  }
}   
    
    
    
