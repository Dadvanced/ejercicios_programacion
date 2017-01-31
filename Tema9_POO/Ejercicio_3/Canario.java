/**
* Ejercicio 3
* Tema 9
*
* @author David León Galisteo
*/

public class Canario extends Ave {
  
  public Canario() {
    super();
  }
  
  public void pia() {
    System.out.println("¡pio!");
  }
  
  @Override
  public void asea() {
    System.out.println("El canario mete rápidamente la cabeza en agua.");
  }
  
}
