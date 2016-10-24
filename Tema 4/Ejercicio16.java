/*
*
* @author David León Galisteo
* Ejercicio 16  - Tema 4
*
*/

public class Ejercicio16 {
  public static void main(String[] args) {
    
    System.out.println("Bienvenid@ al test de infidelidad.");
    System.out.println("___________________________________");
    System.out.println("Se le va a realizar una serie de preguntas y deberá respondere (V o F).");
    System.out.println("___________________________________");
    System.out.println("___________________________________");
    
    System.out.println("1.- ¿Su pareja parece estar más inquieta de lo normal sin ningún motivo aparente?.");
    System.out.print("¿Verdadero o Falso? ");
    String respuesta1 = System.console().readLine().toUpperCase();
    
    int puntuacion = 0;
    
    
    if (respuesta1.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta1.equals("F")) {
      puntuacion = puntuacion + 0;
    } else {
      System.out.println("La respuesta no es válida");
    }
    
     System.out.println("___________________________________");
     System.out.println("___________________________________");
    
    System.out.println("2.- ¿Ha aumentado sus gastos de vestuario?.");
    System.out.print("¿Verdadeor o Falso? ");
    String respuesta2 = System.console().readLine().toUpperCase();
    
    
    if (respuesta2.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta2.equals("F")) {
      puntuacion = puntuacion + 0;
    } else {
      System.out.println("La respuesta no es válida.");
    }
    
     System.out.println("___________________________________");
     System.out.println("___________________________________");
      
    System.out.println("3.- ¿Ha perdido el interés que mostraba anteriormente por usted?.");
    System.out.print("¿Verdadero o Falso? ");
    String respuesta3 = System.console().readLine().toUpperCase();
    
    
    if (respuesta3.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta3.equals("F")) {
      puntuacion = puntuacion + 0;
    } else {
      System.out.println("La respuesta no es válida");
    }
    
     System.out.println("___________________________________");
     System.out.println("___________________________________");
      
    System.out.println("4.- ¿Ahora se afeita y se asea con más frecuencia? (si es hombre) o, ¿ahora se ");
    System.out.println("arregla el pelo y se asea con más frecuencia? (si es mujer).");
    System.out.print("¿Verdadero o Falso? ");
    String respuesta4 = System.console().readLine().toUpperCase();
    
    
    if (respuesta4.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta4.equals("F")) {
      puntuacion = puntuacion + 0;
    } else {
      System.out.println("La respuesta no es válida");
    }
    
     System.out.println("___________________________________");
     System.out.println("___________________________________");
  
    System.out.println("5.- ¿No le deja que mire la agenda de su teléfono móvil?.");
    System.out.print("¿Verdadero o Falso? ");
    String respuesta5 = System.console().readLine().toUpperCase();
  
    if (respuesta5.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta5.equals("F")) {
      puntuacion = puntuacion + 0;
    } else {
      System.out.println("La respuesta no es válida.");
    }
   
    System.out.println("___________________________________");
    System.out.println("___________________________________");
     
    System.out.println("6.- ¿A veces tiene llamadas que dice no querer contestar cuando está usted delante?.");
    System.out.print("¿Verdadero o Falso? ");
    String respuesta6 = System.console().readLine().toUpperCase();
    
    
    if (respuesta6.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta6.equals("F")) {
      puntuacion = puntuacion + 0;
    } else {
      System.out.println("La respuesta no es correcta.");
    }
    
     System.out.println("___________________________________");
     System.out.println("___________________________________");
      
    System.out.println("7.- ¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?.");
    System.out.print("¿Verdadero o Falso? ");
    String respuesta7 = System.console().readLine().toUpperCase();
    
    
    if (respuesta7.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta7.equals("F")) {
      puntuacion = puntuacion + 0;
    } else {
      System.out.println("La respuesta no es correcta");
    }
    
     System.out.println("___________________________________");
     System.out.println("___________________________________");
      
    System.out.println("8.-¿Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?.");
    System.out.print("¿Verdadero o Falso?");
    String respuesta8 = System.console().readLine().toUpperCase();
    
    
    if (respuesta8.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta8.equals("F")) {
      puntuacion = puntuacion + 0;
    } else {
      System.out.println("La respuesta no es correcta.");
    }
     System.out.println("___________________________________");
     System.out.println("___________________________________");
     
       
    System.out.println("9.- ¿Ha notado que últimamente se perfuma más?.");
    System.out.print("¿Verdadero o Falso? ");
    String respuesta9 = System.console().readLine().toUpperCase();
    
    
    if (respuesta9.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta9.equals("F")) {
      puntuacion = puntuacion + 0;
    } else {
      System.out.println("La respuesta no es correcta.");
    }
   
    System.out.println("___________________________________");
    System.out.println("___________________________________");
     
    System.out.println("10.- ¿Se confunde y le dice que ha estado en sitios donde no ha ido con usted?.");
    System.out.print("¿Verdadero o Falso?");
    String respuesta10 = System.console().readLine().toUpperCase();
    
   
    if (respuesta10.equals("V")) {
      puntuacion = puntuacion + 3;
    } else if (respuesta10.equals("F")) {
      puntuacion = puntuacion + 0;
    } else {
      System.out.println("La respuesta no es correcta.");
    }
    
     System.out.println("___________________________________");
     System.out.println("___________________________________");
      
    
    
    if ((puntuacion >= 0) && (puntuacion <= 10)) {
      System.out.println("Ha sacado " + puntuacion + " puntos de infidelidad.");
      System.out.println("¡Enhorabuena!, su pareja parece ser totalmente fiel.");
    } else if ((puntuacion >= 11) && (puntuacion <= 22)) {
      System.out.println("Ha sacado " + puntuacion + " puntos de infidelidad.");
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque");
      System.out.println(" seguramente será algo sin importancia. No baje la guardia.");
    } else if ((puntuacion > 22) && (puntuacion <= 30)) {
      System.out.println("Ha sacado " + puntuacion + " puntos de infidelidad.");
      System.out.println("Su pareja tiene todos los ingredientes para estar viviendo un romance con");
      System.out.println(" otra persona. Le aconsejamos que indague un poco más y averigüe qué es");
      System.out.println(" lo que está pasando por su cabeza.");
    }
  }
}  

   

