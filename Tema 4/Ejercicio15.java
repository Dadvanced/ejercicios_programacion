/*
/
/ @author David León Galisteo
/
/ Ejercicio 15
*/

public class Ejercicio15 {
  public static void main(String[] args) {
	  System.out.println("Vamos a dibujar una pirámide con algún número, símbolo (*, +, $, &, etc)");
	  System.out.println("Que usted introduzca.");
	  System.out.println("Además, deberá elegir en el siguiente menú hacia dónde quiere que mire el");
	  System.out.println("vértice de la pirámide");
	  System.out.printf("________________________________________ \n");
	  System.out.printf("________________________________________ \n");
	  
	  System.out.println("Primero introduzca el carácter con el que desea que se dibuje la pirámide");
	  System.out.printf("________________________________________ \n");
	
	  String relleno = System.console().readLine();
	  
      System.out.println("Elija hacia dónde quiere que apunte el vértice de la pirámide");
      System.out.println("1: Con el vértice hacia arriba");
      System.out.println("2: Con el vértice hacia abajo");
      System.out.println("3: Con el vértice hacia la izquierda");
      System.out.println("4: Con el vértice hacia la derecha");
     
      int verticePiramide = Integer.parseInt(System.console().readLine());

      switch (verticePiramide) {
			
		case 1:
			System.out.println("  " + relleno);
			System.out.println(" " + relleno + relleno + relleno);
			System.out.println(relleno + relleno + relleno + relleno + relleno);
			break;
		  case 2:
			System.out.println(relleno + relleno + relleno + relleno + relleno);
			System.out.println(" " + relleno + relleno + relleno);
			System.out.println("  " + relleno);
			break;
		  case 3:
			System.out.println("    " + relleno);
			System.out.println("  " + relleno + " " + relleno);
			System.out.println(relleno + " " + relleno + " " + relleno);
			System.out.println("  " + relleno + " " + relleno);
			System.out.println("    " + relleno);
			break;
		  case 4:
			System.out.println(relleno);
			System.out.println(relleno + " " + relleno);
			System.out.println(relleno + " " + relleno + " " + relleno);
			System.out.println(relleno + " " + relleno);
			System.out.println(relleno);
			break;
	default:
		System.out.println("Opción incorrecta");
		System.out.println("Reinicie el programa");
    }
  }
}
