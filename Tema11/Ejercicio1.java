/*
*
* @author David León Galisteo
* Ejercicio 1 Tema 11
*
*/

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import Funciones.FuncionesMatematicas;

public class Ejercicio1 {
  public static void main(String[] args) {
    System.out.println("Se va a guardar en un fichero con nombre \"primos.dat\" los números primos");
    System.out.println("que hay entre el 1 y el 500.");
    System.out.println("__________________________________________________________________________");
    
    try {
      BufferedWriter primo = new BufferedWriter(new FileWriter("primos.dat"));
      
      for (int i = 2; i <= 500; i++) {
        if (FuncionesMatematicas.esPrimo(i)) {
          primo.write(i +"\n");
        }
      }
      
      primo.close();
      
      } catch (IOException ioe) {
        System.out.println("No se ha podido escribir en el fichero.");
        }
      }
    }
        
