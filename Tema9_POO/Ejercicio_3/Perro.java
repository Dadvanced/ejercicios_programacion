/**
* Ejercicio 3
* Tema 9
*
* @author David León Galisteo
*/

public class Perro extends Mamifero {
  private String tipo; //de carreras, de caza, de agua, de salvamento, policía, guía, estándar.
  
  public Perro() {
    super();
  }
  
  public String getTipo() {
    return this.tipo;
  }
  
  public String setTipo(String t) {
    return this.tipo = t;
  }
  
  public void ladra() {
    System.out.println("¡Guau!");
  }
  
  public void rastrea() {
    System.out.println("¡snif! El perro olisquea el suelo.");
  }
  
  public void jugar() {
    System.out.println("Juegas con el perro.");
  }
  
  public void jugar(String juego) {
    if (juego.equals("pelota")) {
      System.out.println("Lanzas una pequeña pelota a tu perro.");
    } else if (juego.equals("cuerda")) {
      System.out.println("Juegas al tira y afloja con tu perro.");
    } else {
      System.out.println("Ese juego no le interesa.");
    }
  }
  
  
}
