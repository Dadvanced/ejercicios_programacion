/*
*
* @author David León Galisteo
* Ejercicio 18  - Tema 6
*
*/


public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Vavamos a sacar 3 colores aleatorios no repetidos para");
    System.out.println("los dormitorios de Sinestesio y Casilda.");
    System.out.println("_____________________________________________");
    System.out.println("Pulse INTRO para sacar 3 colores.");
    System.console().readLine();
        
    int colores = 0;
    int colorCorrecto = 3; //hasta que no saque 3 colores correctos el programa no parará
    int a = 0; //guarda los valores de los colores para posteriormente comprobar si se repiten o no
    int b = 0;
    int c = 9; //le asignamos un valor diferente a sus antecesores para evitar conflictos en el último "if"
    int i = 0;
    String stringColores = (" ");
    
        
    do {
           
      for (i = 1; i <= 3; i++) { //saca los 3 colores
        colores = (int)(Math.random()*6) + 1;
        
        switch (colores) {
          case 1:
          stringColores = ("rojo");
          break;
          
          case 2:
          stringColores = ("azul");
          break;
          
          case 3:
          stringColores = ("verde");
          break;
          
          case 4:
          stringColores = ("amarillo");
          break;
          
          case 5:
          stringColores = ("violeta");
          break;
          
          case 6:
          stringColores = ("naranja");
          break;
          
          default:
        } //switch colores
        
        if ( i == 1 && colorCorrecto == 3) { //pinta el primer color
          System.out.print(stringColores + " ");
          colorCorrecto--;
        }
        
        
        
                
        switch (i) { //modificamos el valor de las variables para posteriormente compararlas entre ellas
        case 1:
        a = colores;
        break;
        
        case 2:
        b = colores;
        break;
        
        case 3:
        c = colores;
        break;
                        
        default:
      } //switch "i"
    }//for    cierra el for de los 3 colores
      
      
          
      /////////////////comprueba que no se repita ningún color
      if (a != b && a != c && b != c) {
        System.out.print(stringColores + " ");
        colorCorrecto--;
      }      
      
    } while (colorCorrecto > 0);
    
        
  }
}
