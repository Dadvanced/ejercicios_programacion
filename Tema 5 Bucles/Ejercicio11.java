/*
/ @author David León Galisteo
/ Ejercicio 11 - Tema 5_Bucles
/
*/

import java.util.Scanner;
        public class Ejercicio11 {
            public static void main(String[] args) {
                System.out.println("\nSe va a mostrar por pantalla el cuadrado y el cubo");
                System.out.println("de los 5 números al siguiente introducido por usted.");
                System.out.println("__________________________________________ \n");
                System.out.print("Introduzca un número entero: ");
                
                Scanner s = new Scanner(System.in);
                
                int numero = Integer.parseInt(s.nextLine());
                int cuenta;
                
                for (int i = 1; i <=5; i++) {
                cuenta = numero + i;
                System.out.println("\n _____________________________________ \n");
                System.out.println(cuenta + " " + " " + (cuenta * cuenta) + " " + " " + (cuenta * cuenta * cuenta));
                
            }
                
            }
        }
