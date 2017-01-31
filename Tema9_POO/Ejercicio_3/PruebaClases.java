/**
* Prueba clases
* @author: David León Galisteo 
*
**/

import java.util.Scanner;

public class PruebaClases {
  public static void main(String[] args) {
        
    //////////////////VARIABLES////////////////////    
    Scanner n = new Scanner(System.in);
    int option = 0;
    int option2 = 0; //submenú
    String juego = ""; //para jugar con snoopy
    String alimento = ""; //para dar de comer a simba
    boolean exit = false; //indicará cuándo el usuario quiere salir del programa
    boolean exitSubmenu = false; //volveremos al menú inicial cambiando éste booleano
    ///////////////////////////////////////////////
    
    
    ////////////OBJETOS///////////////
    Perro snoopy = new Perro();
    snoopy.setTipo(tipoPerroAleatorio());
    
    Gato michu = new Gato();
    Ave orus = new Ave(); //halcón
    Canario piolin = new Canario();
    Pinguino pingu = new Pinguino();
    Lagarto izu = new Lagarto();
    Mamifero simba = new Mamifero();
    //////////////////////////////////
    
    System.out.println("┌───────────────────────────────────────────────────────────────────────┐");
    System.out.println("│        Bienvenid@ a la pajarería virtual \"El león binario\".           │");
    System.out.println("│                                                                       │");
    System.out.println("│ A continuación le mostraremos la lista de animales disponibles para   │");
    System.out.println("│ que usted pueda escoger uno e interactuar con él.                     │");
    System.out.println("│                                                                       │");
    System.out.println("│     Una vez se canse y desee salir, pulse el número \"8\".              │");
    System.out.println("└───────────────────────────────────────────────────────────────────────┘");
    System.out.println();
    System.out.println();
    
    
    
    while (!exit) {
      exitSubmenu = false;
      System.out.println("________________________________________________");
      System.out.println();
      listaAnimales();
      System.out.println();
    
      System.out.print("Escoge una opción: ");
      option = Integer.parseInt(n.nextLine());
      System.out.println();
      
      while (!exitSubmenu) {
        switch (option) {
          case 1:
            System.out.println();
            perro();
            System.out.print("Opcion: ");
            option2 = Integer.parseInt(n.nextLine());
            limpiaPantalla();
            
            switch (option2) {
              case 1:
                System.out.println("El tipo de perro es: " + snoopy.getTipo());
              break;
              
              case 2:
                snoopy.ladra();
              break;
              
              case 3:
                snoopy.rastrea();
              break;
              
              case 4:
                snoopy.jugar();
              break;
              
              case 5:
                System.out.println("¿Quieres tirarle la pelota o usar la cuerda? (escríbelo).");
                juego = n.nextLine();
                snoopy.jugar(juego);
              break;
              
              case 6:
                exitSubmenu = true;
                limpiaPantalla();
              break;
              
              default:
                System.out.println("Opción incorrecta.");
            } //switch submenú perro
          break;
          
          case 2:
            System.out.println();
            gato();
            option2 = Integer.parseInt(n.nextLine());
            limpiaPantalla();
            
              switch (option2) {
                case 1:
                  michu.maulla();
                break;
                
                case 2:
                  michu.ronronea();
                break;
                
                case 3:
                  michu.asea();
                break;
                
                case 4:
                  System.out.print("Michu "); 
                  michu.corre();
                break;
                
                case 5:
                  exitSubmenu = true;
                  limpiaPantalla();
              break;
                
                default:
                  System.out.println("Opción incorrecta.");
              } //switch submenú gato
          break;
          
          case 3:
            System.out.println();
            ave();
            option2 = Integer.parseInt(n.nextLine());
            limpiaPantalla();
            
            switch (option2) {
              case 1:
                orus.asea();
              break;
              
              case 2:
                orus.vuela();
              break;
              
              case 3:
                orus.incubaHuevo();
              break;
              
              case 4:
                orus.duerme();
              break;
              
              case 5:
                exitSubmenu = true;
                limpiaPantalla();
            break;
              
              default:
                System.out.println("Opción incorrecta.");
            }
          break; //switch submenú ave
          
          case 4:
            System.out.println();
            canario();
            option2 = Integer.parseInt(n.nextLine());
            limpiaPantalla();
            
            switch (option2) {
              case 1:
                piolin.pia();
              break;
              
              case 2:
                piolin.asea();
              break;
              
              case 3:
                piolin.come();
              break;
              
              case 4:
                exitSubmenu = true;
                limpiaPantalla();
            break;
              
              default:
                System.out.println("Opción incorrecta.");
            } //switch submennú canario
          break;
          
          case 5:
            System.out.println();
            pinguino();
            option2 = Integer.parseInt(n.nextLine());
            limpiaPantalla();
            
            switch (option2) {
              case 1:
                pingu.desliza();
              break;
              
              case 2:
                pingu.nada();
              break;
              
              case 3:
                pingu.vuela();
              break;
              
              case 4:
                exitSubmenu = true;
                limpiaPantalla();
            break;
              
              default:
                System.out.println("Opción incorrecta.");
            } //switch submenú pinguino
          break;
            
          case 6:
            System.out.println();
            lagarto();
            option2 = Integer.parseInt(n.nextLine());
            limpiaPantalla();
            
            switch (option2) {
              case 1:
                izu.hazAlgo();
              break;
              
              case 2:
                izu.camuflarse();
              break;
              
              case 3:
                izu.setRaza("iguana");
                izu.camuflarse();
              break;
              
              case 4:
                exitSubmenu = true;
                limpiaPantalla();
            break;
            
              default:
                System.out.println("Opción incorrecta.");
            } //switch submenú lagarto
          break;
          
          case 7:
            System.out.println();
            mamifero();
            option2 = Integer.parseInt(n.nextLine());
            limpiaPantalla();
            
            switch (option2) {
              case 1:
                simba.setDieta("carne");
                System.out.println("La dieta de Simba es: " + simba.getDieta());
              break;
              
              case 2:
                simba.asea();
              break;
              
              case 3:
                System.out.println("Escriba el alimento que desee dar de comer a Simba:");
                alimento = n.nextLine().toLowerCase();
                simba.come(alimento);
              break;
              
              case 4:
                exitSubmenu = true;
                limpiaPantalla();
            break;
              
              default:
                System.out.println("Opción incorrecta.");
            } //switch submenú mamifero
          break;
          
          case 8:
            exit = true;
          break;
          
          default:
            System.out.println("Opción incorrecta.");
        }
      }
    }          
        
      
  }
    
  
  
  //////////////////////////////FUNCIONES////////////////////////////////////////////
  
  public static void limpiaPantalla() {
    for (int i = 1; i <= 50; i++) {
      System.out.println();
    }
  }
  
  public static void listaAnimales() {
    System.out.println("[1]: Snoopy (perro)");
    System.out.println("[2]: Michu (gato)");
    System.out.println("[3]: Orus (Ave)");
    System.out.println("[4]: Piolín (Canario)");
    System.out.println("[5]: Pingu (Pingüino");
    System.out.println("[6]: Izu (Lagarto)");
    System.out.println("[7]: Simba (Mamifero");
    System.out.println();
    System.out.println("[8]: Salir del programa");
  }
  
  public static void perro() {
    System.out.println("Para nuestro perro Snoopy tenemos las siguientes opciones:");
    System.out.println("__________________________________________________________");
    System.out.println("[1]: Ver tipo de perro (policía, guía, salvamento...");
    System.out.println("[2]: Hacer ladrar al perro.");
    System.out.println("[3]: Que olfatee el suelo.");
    System.out.println("[4]: Jugar con él.");
    System.out.println("[5]: Jugar con él usando una pelota o una cuerda (escribe pelota o cuerda).");
    System.out.println("[6]: Volver al menú.");
  }
  
  
  public static void gato() {
    System.out.println("Para nuestro gato Michu tenemos las siguientes opciones:");
    System.out.println("__________________________________________________________");
    System.out.println("[1]: Hacer que maúlle.");
    System.out.println("[2]: Hacer que ronronee.");
    System.out.println("[3]: Que se asee.");
    System.out.println("[4]: Ver cómo corre.");
    System.out.println("[5]: Volver al menú.");
  }
  
  public static void ave() {
    System.out.println("Para nuestro Ave Orus tenemos las siguientes opciones:");
    System.out.println("__________________________________________________________");
    System.out.println("[1]: Mirar cómo se asea.");
    System.out.println("[2]: Mirar cómo vuela.");
    System.out.println("[3]: Comprobar si está incubando un huevo.");
    System.out.println("[4]: Ver si está durmiendo.");
    System.out.println("[5]: Volver al menú.");
  }
  
  public static void canario() {
    System.out.println("Para nuestro canario Piolín tenemos las siguientes opciones:");
    System.out.println("__________________________________________________________");
    System.out.println("[1]: Oir cómo pía.");
    System.out.println("[2]: Ponerle un cuenquecito de agua.");
    System.out.println("[3]: Echarle pienso.");
    System.out.println("[4]: Volver al menú.");
  }
  
  public static void pinguino() {
    System.out.println("Para nuestro pingüino Pingu tenemos las siguientes opciones:");
    System.out.println("__________________________________________________________");
    System.out.println("[1]: Ver cómo juega en el hielo.");
    System.out.println("[2]: Mirar dónde pescan.");
    System.out.println("[3]: Tiene alas, ¿podrá volar?");
    System.out.println("[4]: Volver al menú.");
  }
  
  public static void lagarto() {
    System.out.println("Para nuestro lagarto Izu tenemos las siguientes opciones:");
    System.out.println("__________________________________________________________");
    System.out.println("[1]: Mirar a ver qué hace.");
    System.out.println("[2]: Ver si puede camuflarse.");
    System.out.println("[3]: Cambiar al lagarto por una iguana y ver si se camufla.");
    System.out.println("[4]: Volver al menú.");
  }
  
  public static void mamifero() {
    System.out.println("Para nuestro mamífero Simba tenemos las siguientes opciones:");
    System.out.println("__________________________________________________________");
    System.out.println("[1]: Conocer su dieta.");
    System.out.println("[2]: Ver si se asea.");
    System.out.println("[3]: Darle de comer.");
    System.out.println("[4]: Volver al menú.");
  }
  
  public static String tipoPerroAleatorio() {
    int tipo = (int)(Math.random()*7) + 1;
    String sTipo = "";
    
    switch (tipo) {
      case 1:
        sTipo = "Carreras";
      break;
      
      case 2:
        sTipo = "Caza";
      break;
      
      case 3:
        sTipo = "Agua";
      break;
      
      case 4:
        sTipo = "Salvamento";
      break;
      
      case 5:
        sTipo = "Policía";
      break;
      
      case 6:
        sTipo = "Guía";
      break;
      
      case 7:
        sTipo = "Estándar";
      break;
      
      default:
    }
    
    return sTipo;
  }
      
}
