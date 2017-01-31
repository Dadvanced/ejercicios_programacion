/**
* Ejercicio 3
* Tema 9
*
* @author David León Galisteo
*/

public class Mamifero extends Animal {
  private String dieta; //carnívoro, herbíboro, omnívoro
  
  public Mamifero() {
    super();
  }
  
  public String getDieta() {
    return this.dieta;
  }
  
  public String setDieta(String d) {
    return this.dieta = d;
  }
  
  public void corre() {
    System.out.println("Corre como el viento.");
  }
  
}
