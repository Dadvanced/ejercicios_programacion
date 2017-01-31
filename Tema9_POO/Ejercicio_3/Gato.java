/**
* Ejercicio 3
* Tema 9
*
* @author David León Galisteo
*/

public class Gato extends Mamifero {
  
  public Gato() {
    super();
  }
  
  public void maulla() {
    System.out.println("Miaaauuuu");
  }
  
  public void ronronea() {
    System.out.println("mmmrrrrrr");
  }
  
  @Override
  public void asea() {
    System.out.println("El gato se lame para limpiarse.");
  }
  
}
