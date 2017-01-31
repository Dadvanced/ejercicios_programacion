/**
* Ejercicio 2
* Tema 9
*
* @author David León Galisteo
*/

public class Bicicleta extends Vehiculos {
  private int kilometrosRecorridos;
  
  public Bicicleta() {
    kilometrosRecorridos = 0;
  }
  
  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }
  
  public void andaBicicleta() {
    System.out.println("Andas con la bicicleta 10 kilómetros.");
    this.kilometrosRecorridos += 10;
    super.setKilometrosTotales(10);
  }
  
  public void caballito() {
    System.out.println("Haces el caballito con la bici sin caerte durante 1 kilómetro.");
    this.kilometrosRecorridos += 1;
    super.setKilometrosTotales(1);
  }
  
}
