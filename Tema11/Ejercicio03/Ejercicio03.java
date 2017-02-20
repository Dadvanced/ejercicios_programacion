/**
* @author David León Galisteo
* Ejercicio 03 Tema 11
*
**/


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Se va a mostrar una serie de 2 palabras provenientes de 2 archivos distintos");
    System.out.println("\n_________________________________________________________________________");
    
    try {
      BufferedReader nombres = new BufferedReader(new FileReader("nombres.txt"));
      BufferedReader adjetivos = new BufferedReader(new FileReader("adjetivos.txt"));
      BufferedWriter mezcla = new BufferedWriter(new FileWriter("mezcla.txt"));
      
      String linea1 = "";
      String linea2 = "";
      
      while ( (linea1 != null) && (linea2 != null) ) {
        linea1 = nombres.readLine();    //lee los datos de los archivos nombres y adjetivos
        linea2 = adjetivos.readLine();  
        
        //si hay datos en AMBOS archivos, entonces escribe la nueva información en el nuevo archivo.
        if ((linea1 != null) && (linea2 != null)) mezcla.write(linea1 + " "); 
        if ((linea1 != null) && (linea2 != null)) mezcla.write(linea2 + "\n");        
      }
      
      
      
      nombres.close();
      adjetivos.close();
      mezcla.close();
      
    } catch (IOException ioe) {
      System.out.println("Se ha producido un error de lectura/escritura");
      System.err.println(ioe.getMessage());
    }
  }
}
