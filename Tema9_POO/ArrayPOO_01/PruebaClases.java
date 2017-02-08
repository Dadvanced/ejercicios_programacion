/**
* Prueba clases
* @author: David León Galisteo 
*
**/

public class PruebaClases {
  public static void main(String[] args) {
    Gato[] gatitos = new Gato[4];
    
    for (int i = 0; i < gatitos.length; i++) { /////Añadimos información a los objetos "gato"
      gatitos[i] = new Gato();
      gatitos[i].setRaza("raza ejemplo " + i);
      gatitos[i].setSexo("sexo ejemplo " + i);
      gatitos[i].setColor("color ejemplo " + i);
      gatitos[i].setPeso(10 + i);
      gatitos[i].setAltura(20 + i);
    }
    
    System.out.println();
    System.out.println("____________________________________________");
    
    for (int i = 0; i < gatitos.length; i++) { //Mostramos la información de cada objeto "gato"
      System.out.println("Gatito " + (i + 1));
      System.out.println("Raza: " + gatitos[i].getRaza());
      System.out.println("Sexo: " + gatitos[i].getSexo());
      System.out.println("Color: " + gatitos[i].getColor());
      System.out.println("Peso: " + gatitos[i].getPeso());
      System.out.println("Altura: " + gatitos[i].getAltura());
      
      System.out.println();
      System.out.println();
    }
  }
}
