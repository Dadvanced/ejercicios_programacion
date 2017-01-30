/**
* Ejercicio 1
* Tema 9
*
* @author David León Galisteo
*/

public class Caballo {
  private double peso;
  private String color;
  private String sexo;
  private boolean herradura;
  private boolean crinCortado;
  public String nombre;
  
  public Caballo(
    double peso, String color, String sexo, boolean herradura, boolean crinCortado, String nombre) 
  {
    this.peso = peso;
    this.color = color;
    this.sexo = sexo;
    this.herradura = herradura;
    this.crinCortado = crinCortado;
    this.nombre = nombre;
  }
    
    void corre() {
      System.out.println("El caballo corre libre.");
    }
    
    void corre(int distancia) {
      System.out.println("El caballo corre " + distancia + " kilometros");
    }
    
    Double getPeso() {
      return this.peso;
    }
    
    void setPeso(Double peso) {
      this.peso = peso;
    }
    
    
  }
    
    
  
