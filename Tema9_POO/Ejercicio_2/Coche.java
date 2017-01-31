/**
* Ejercicio 2
* Tema 9
*
* @author David León Galisteo
*/

public class Coche extends Vehiculos {
  private int kilometrosRecorridos;
  
  
  public Coche() {
    this.kilometrosRecorridos = 0;
  }
  
  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  public void andaCoche() {
    super.setKilometrosTotales(50);
    System.out.println("El coche anda algunos kilómetros despacito.");
    this.kilometrosRecorridos += 50;
  }
  
  public void quemaRueda() {
    System.out.println("El coche quema ruedas con lo que cree que recorre 1 kilómetro.");
    this.kilometrosRecorridos += 1;
    super.setKilometrosTotales(1);
  }
  
   
  
}
