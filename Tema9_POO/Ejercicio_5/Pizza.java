/**
* Ejercicio 5
* Tema 9
*
* @author David León Galisteo
*/

public class Pizza {
  private String size; //tamaño
  private String tipo;
  private String estado;
  private static int estadoPedida = 0; 
  private static int estadoServida = 0;
  public boolean servida = false;
  
  public String getEstado() {
    return this.estado;
  }
  
  public String setEstado(String estado) {
    return this.estado = estado;
  }
  
  public String getSize() {
    return this.size;
  }
  
  public String setSize(String size) {
    return this.size = size;
  }
  
  public String getTipo() {
    return this.tipo;
  }
  
  public String setTipo(String tipo) {
    return this.tipo = tipo;
  }
  
  public static int getEstadoPedida() {
    return Pizza.estadoPedida;
  }
  
  public static int getEstadoServida() {
    return Pizza.estadoServida;
  }
  
  ///////////////////////CONSTUCTOR////////////////////////////77
  
  public Pizza(String size, String tipo) {
    this.size = size;
    this.tipo = tipo;
    this.estado = "pedida";
    this.servida = false;
    Pizza.estadoPedida++;
  }
  
  ////////////////////////////MÉTODOS////////////////////////////////7
  
  public String toString() {
    String datosPizza = "\npizza " + this.tipo + " " + this.size + ", " + this.estado
    + "\n";
    
    return datosPizza;
  }
  
  public void sirve() {
    if (!servida) {
      Pizza.estadoPedida--;
      Pizza.estadoServida++;
      this.servida = true;
      this.estado = "servida";
    } else {
      System.out.println("Esa pizza ya está pedida.\n");
    }
  }
}
  
  
  
  
    
  
