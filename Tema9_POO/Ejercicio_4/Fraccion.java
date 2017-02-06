/**
* Ejercicio 4
* Tema 9
*
* @author David León Galisteo
*/

public class Fraccion {
  private int numerador;
  private int denominador;
  
  public Fraccion(int n, int d) {
    this.numerador = n;
    this.denominador = d;
  }
  
  public int getNumerador() {
    return this.numerador;
  }
  
  public int getDenominador() {
    return this.denominador;
  }
  
  public int setDenominador(int d) {
    return this.denominador = d;
  }
  
  public int setNumerador(int n) {
    return this.numerador = n;
  }
  
  
  
  public Fraccion multiplica(Fraccion f) {
    return new Fraccion((this.numerador * f.numerador), (this.denominador * f.denominador));
  }
  
  
  public Fraccion invierte() {
    return new Fraccion(this.denominador, this.numerador);
  }
  
  
  public Fraccion simplifica() {
    //int minimo = Math.min(this.numerador, this.denominador);
    
    int minimo = Math.min(this.numerador, this.denominador);
    int mcd = 1;
    
    for (int x = 2; x <= minimo; x++) {
      if ((this.numerador % x == 0) && (this.denominador % x == 0)) {
        mcd = x;        
      }
      
    }
    
    return new Fraccion(this.numerador / mcd, this.denominador / mcd);
  }
  
  
  public Fraccion divide(Fraccion f) {
    return new Fraccion(this.numerador * f.denominador, this.denominador * f.numerador);
  }
  
}

    
    
    
