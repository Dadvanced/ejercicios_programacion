/**
* Ejercicio 3
* Tema 9
*
* @author David León Galisteo
*/

public class Ave extends Animal {
  private boolean esMigratoria;
  private boolean esVoladora;
  
  public Ave() {
    super();
  }
  
  public boolean getEsMigratoria() {
    return this.esMigratoria;
  }
  
  public boolean getEsVoladora() {
    return this.esVoladora;
  }
    
  public boolean setEsMigratoria(boolean m) {
    return this.esMigratoria = m;
  }
  
  public boolean setEsVoladora(boolean v) {
    return this.esVoladora = v;
  }
  
  @Override
  public void asea() {
    System.out.println("Se asea las plumas con su pico.");
  }
  
  public void vuela() {
    System.out.println("Extiende sus alas y vuela hacia el azul infinito.");
  }
  
  public void incubaHuevo() {
    System.out.println("La mamá ave está incubando un huevo.");
    System.out.println("¡Pronto saldrá un nuevo pajarito!");
  }
  
}
