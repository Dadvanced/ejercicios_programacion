/**
 * Ejercicio 2 - Array de Objetos
 * @author David León Galisteo
 **/
public class EjerciciosJava {
    public static void main(String[] args) { 
        System.out.println("Bienvenidos a la base da datos de cantantes desconocidos.");
        System.out.println("A continuación se mostrará una lista de autores, con su género, título, código y duración.");
        System.out.println();
        
        Disco[] albunes = new Disco[4];
        
        for (int i = 0; i < albunes.length; i++) {
            albunes[i] = new Disco();
            albunes[i].setCodigo("24J42" + (i + 1));
            albunes[i].setAutor("Pablo" + (i + 1));
            albunes[i].setTitulo("volando0" + (i + 1));
            albunes[i].setGenero("genero0" + (i + 1));
            albunes[i].setDuracion(10 + i);
        }
        
        for (int i = 0; i < albunes.length; i++) {
            System.out.println(albunes[i].toString());
        }
    }
    
}
