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
    
    for (Gato g : gatitos) { //Mostramos la información de cada objeto "gato"
      System.out.println("Gatito:");
      System.out.println("Raza: " + g.getRaza());
      System.out.println("Sexo: " + g.getSexo());
      System.out.println("Color: " + g.getColor());
      System.out.println("Peso: " + g.getPeso());
      System.out.println("Altura: " + g.getAltura());
      
      System.out.println();
      System.out.println();
    }
  }
}
