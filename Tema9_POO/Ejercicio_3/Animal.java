/**
* Ejercicio 3
* Tema 9
*
* @author David León Galisteo
*/

public class Animal {
  private String raza;
  private String sexo;
  private String color;
  private float peso;
  private float altura;
  
  public Animal() {
  }
  
  public String getRaza() {
    return this.raza;
  }
  
  public String getSexo() {
    return this.sexo;
  }
  
  public String getColor() {
    return this.color;
  }
  
  public float getPeso() {
    return this.peso;
  }
  
  public float getAltura() {
    return this.altura;
  }
  
  public String setRaza(String r) {
    return this.raza = r;
  }
  
  public String setSexo(String s) {
    return this.sexo = s;
  }
  
  public String setColor(String c) {
    return this.color = c;
  }
  
  public float setPeso(float p) {
    return this.peso = p;
  }
  
  public float setAltura(float a) {
    return this.altura = a;
  }
  
  
  public void come() {
    System.out.println("El animal se alimenta de lo lindo.");
  }
  
  public void come(String comida) {
    System.out.println("A nuestro amigo le encanta comer " + comida);
  }
  
  public void asea() {
    System.out.println("El animal se asea en un charco de agua.");
  }
  
  public void duerme() {
    System.out.println("El animal duerme profundamente.");
  }
  
}
