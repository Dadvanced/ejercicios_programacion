/*
*
* @author David León Galisteo
* Ejercicio 2 Tema 11
*
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Vamos a mostrar la información guardada en el archivo \"primos.dat\".");
    System.out.println("\n_______________________________________________________________");
    
    try {
      BufferedReader primos = new BufferedReader(new FileReader("primos.dat"));
      
      String linea = "";
      
      while (linea != null) {
        System.out.println(linea);
        linea = primos.readLine();
      }
      
      primos.close();
      
    } catch (FileNotFoundException e) {     //qué hacer si no se encuentra el archivo
      System.out.println("No se encuentra el archivo primos.dat");
    } catch (IOException e) {     //qué hacer ssi hay un error de lectura de fichero
      System.out.println("No se puede leer el fichero primos.dat");
    }
  }
}
