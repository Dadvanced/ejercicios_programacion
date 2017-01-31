/**
* Ejercicio 3
* Tema 9
*
* @author David León Galisteo
*/

public class Pinguino extends Ave {
  
  public Pinguino() {
    super();
  }
  
  public void desliza() {
    System.out.println("El pingüino se desliza por el hielo cual tobogán.");
  }
  
  public void nada() {
    System.out.println("El pingüino nada por las heladas aguas del polo sur.");
  }
  
  @Override
  public void vuela() {
    System.out.println("El pingüino no puede volar, pero puede hacer otras muchas cosas.");
  }
  
}
