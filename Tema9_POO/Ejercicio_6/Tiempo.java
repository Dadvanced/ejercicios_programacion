/**
* Ejercicio 6
* Tema 9
*
* @author David León Galisteo
*/

public class Tiempo {
  private int horas;
  private int minutos;
  private int segundos;
  
  /////////////////////////GETTER Y SETTER////////////////////////////////////77
  public int getHoras() {
    return this.horas;
  }
  
  public int setHoras(int horas) {
    return this.horas = horas;
  }
  
  public int getMinutos() {
    return this.minutos;
  }
  
  public int setMinutos(int minutos) {
    return this.minutos = minutos;
  }
  
  public int getSegundos() {
    return this.segundos;
  }
  
  public int setSegundos(int segundos) {
    return this.segundos = segundos;
  }
  
  
  ////////////////////////////////CONSTRUCTOR//////////////////////////////////7
  public Tiempo(int h, int m, int s) {
    this.horas = h;
    this.minutos = m;
    this.segundos = s;
  }
  
  ///////////////////////////MÉTODOS/////////////////////////////////////7
  
  public String toString() {
    String reloj = this.horas + "h " + this.minutos + "m " + this.segundos + "s\n";
    return reloj;
  }
  
  public Tiempo suma(Tiempo reloj2) {
    int sumaH = 0; //horas
    int sumaM = 0; //minutos
    int sumaS = 0; //segundos
    
    sumaS = this.segundos + reloj2.segundos;
    if (sumaS >= 60) {
      sumaM++;
      sumaS -= 60;
    }
    
    
    sumaM += this.minutos + reloj2.minutos;
    if (sumaM >= 60) {
      sumaH++;
      sumaM -= 60;
    }
    
    sumaH += this.horas + reloj2.horas;
    if (sumaH >= 24) {
      sumaH -= 24;
    }
    
    return new Tiempo(sumaH, sumaM, sumaS);
  }
}
