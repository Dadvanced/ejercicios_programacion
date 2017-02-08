/**
* Ejercicio 1 Arrays Objetos
* Tema 9
*
* @author David León Galisteo
*/

public class Gato {
  private String raza;
  private String sexo;
  private String color;
  private float peso;
  private float altura;
  
  
  public Gato() {
    this.raza = "";
    this.sexo = "";
    this.color = "";
    this.peso = 0;
    this.altura = 0;
  }
  
  
  public Gato(String r, String s, String c, float p, float a) {
    this.raza = r;
    this.sexo = s;
    this.color = c;
    this.peso = p;
    this.altura = a;
  }
  
  /////////////////////////////GETTER Y SETTER////////////////////////////
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
}
