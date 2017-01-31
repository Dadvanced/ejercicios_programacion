/**
* Ejercicio 3
* Tema 9
*
* @author David León Galisteo
*/

public class Lagarto extends Animal {
  
  
  public Lagarto() {
    super();
  }
  
  public void hazAlgo() {
    System.out.println("Miras al lagarto fíjamente durante un rato...");
    System.out.println("Pero el lagarto no hace nada.");
  }
  
  public void camuflarse() {
    if (super.getRaza().equals("iguana")) {
      System.out.println("Tu lagarto (iguana) se camufla cual ninja y ya te cuesta verlo.");
    } else {
      System.out.println("Si quieres que tu lagarto se camufle, cómprale ropa militar.");
    }
  }
}
