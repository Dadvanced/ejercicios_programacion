/**
* Ejercicio 2
* Tema 9
*
* @author David León Galisteo
*/

public abstract class Vehiculos {
  
  private static int kilometrosTotales;
  

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }
  
  public static int setKilometrosTotales(int n) {
    return kilometrosTotales += n;
  }
  
  
}
