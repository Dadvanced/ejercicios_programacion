/*
/
/ @author David León Galisteo
/
/ Ejercicio 12
*/

public class Ejercicio12 {
  public static void main(String[] args) {
    
    System.out.println("Vas a realizar un cuestionario de 10 preguntas");
    System.out.println("Sobre las asignaturas que se imparten en el curso.");
    System.out.println("¿Estás preparad@?");
    System.out.printf("_________________________________________ \n");
    System.out.printf("_________________________________________ \n");
    
    int puntuacion = 0;
    System.out.println("1ª pregunta: BB.DD");
    System.out.println("¿Qué es la información?");
    System.out.printf("_________________________________________ \n");
    System.out.println("a) es el dato con semántica");
    System.out.println("b) es un conjunto de datos");
    System.out.println("c) es un fichero que guarda varios datos");
    String preguntaUno = System.console().readLine().toLowerCase();
    if (preguntaUno.equals("a")) {
		puntuacion ++;
		System.out.println("Respusta correcta");
	} else {
		System.out.println("Respuesta incorrecta");
	}
    
    System.out.printf("_________________________________________ \n");
    System.out.printf("_________________________________________ \n");
    
    System.out.println("2ª pregunta: PRO");
    System.out.println("¿Cuál de las siguientes líneas es la correcta?");
    System.out.printf("_________________________________________ \n");
    System.out.println("a) System.console.readLine().toLowercase();");
    System.out.println("b) System.console().readline.(toLowerCase());");
    System.out.println("c) System.console().readLine().toLowerCase();");
    String preguntaDos = System.console().readLine().toLowerCase();
    if (preguntaDos.equals("c")) {
		puntuacion ++;
		System.out.println("Respuesta correcta");
	} else {
		System.out.println("Respuesta incorrecta");
	}
    
    System.out.printf("_________________________________________ \n");
    System.out.printf("_________________________________________ \n");
    
    System.out.println("3ª pregunta: Sistemas informáticos");
    System.out.println("¿Cuál de las siguientes afirmaciones es correcta?");
    System.out.printf("_________________________________________ \n");
    System.out.println("a) Los primeros ordenadores se usaban principalmente con fines científicos");
    System.out.println("b) Los primeros ordenadores se usaban principalmente con fines bélicos");
    System.out.println("c) Los primeros ordenadores se usaban principalmente con fines financieros");
    String preguntaTres = System.console().readLine().toLowerCase();
       if (preguntaTres.equals("b")) {
		puntuacion ++;
		System.out.println("Respuesta correcta");
	} else {
		System.out.println("Respuesta incorrecta");
	}
    
    System.out.printf("_________________________________________ \n");
    System.out.printf("_________________________________________ \n");
    
    System.out.println("4ª pregunta: Lenguaje de marcas");
    System.out.println("¿Cuál de las siguientes afirmaciones es correcta?");
    System.out.printf("_________________________________________ \n");
    System.out.println("a) HTML es un lenguaje de marcas");
    System.out.println("b) CSS es un lenguaje de marcas");
    System.out.println("c) Ambas (a y b) son correctas");
    String preguntaCuatro = System.console().readLine().toLowerCase();
       if (preguntaCuatro.equals("a")) {
		puntuacion ++;
		System.out.println("Respuesta correcta");
	} else {
		System.out.println("Respuesta incorrecta");
	}
    
    System.out.printf("_________________________________________ \n");
    System.out.printf("_________________________________________ \n");
    
    System.out.println("5ª pregunta: Entornos de desarrollo");
    System.out.println("¿Cuál de las siguientes afirmaciones es correcta?");
    System.out.printf("_________________________________________ \n");
    System.out.println("a) Lenguaje máquina es un lenguaje de bajo nivel");
    System.out.println("b) *C* es un lenguaje de bajo nivel");
    System.out.println("c) Ambas son correctas");
    String preguntaCinco = System.console().readLine().toLowerCase();
       if (preguntaCinco.equals("a")) {
		puntuacion ++;
		System.out.println("Respuesta correcta");
	} else {
		System.out.println("Respuesta incorrecta");
	}
    
    System.out.printf("_________________________________________ \n");
    System.out.printf("_________________________________________ \n");
    
    System.out.println("6ª pregunta: Historia");
    System.out.println("¿En qué año se descubrió América?");
    System.out.printf("_________________________________________ \n");
    System.out.println("a) En 1472");
    System.out.println("b) En 1512");
    System.out.println("c) En 1492");
    String preguntaSeis = System.console().readLine().toLowerCase();
       if (preguntaSeis.equals("c")) {
		puntuacion ++;
		System.out.println("Respuesta correcta");
	} else {
		System.out.println("Respuesta incorrecta");
	}
    
    System.out.printf("_________________________________________ \n");
    System.out.printf("_________________________________________ \n");
    
    System.out.println("7ª pregunta: Programación (Linux)");
    System.out.println("¿Qué puede hacer el comando *mv*");
    System.out.printf("_________________________________________ \n");
    System.out.println("a) Mover un archivo de un lugar a otro");
    System.out.println("b) Duplicar un archivo y ponerle otro nombre");
    System.out.println("c) Ambas son correctas");
    String preguntaSiete = System.console().readLine().toLowerCase();
       if (preguntaSiete.equals("a")) {
		puntuacion ++;
		System.out.println("Respuesta correcta");
	} else {
		System.out.println("Respuesta incorrecta");
	}
    
    System.out.printf("_________________________________________ \n");
    System.out.printf("_________________________________________ \n");
    
    System.out.println("8ª pregunta: Linux");
    System.out.println("¿Qué atajo usamos para minimizar todas las ventanas de golpe?");
    System.out.printf("_________________________________________ \n");
    System.out.println("a) control + súper + L");
    System.out.println("b) control + súper + m");
    System.out.println("c) control + súper + d");
    String preguntaOcho = System.console().readLine().toLowerCase();
       if (preguntaOcho.equals("c")) {
		puntuacion ++;
		System.out.println("Respuesta correcta");
	} else {
		System.out.println("Respuesta incorrecta");
	}
    
    System.out.printf("_________________________________________ \n");
    System.out.printf("_________________________________________ \n");
    
    System.out.println("9ª pregunta: Los Simpsons");
    System.out.println("Si hay 27 temporadas, ¿cuántas especiales de Halloween hay?");
    System.out.printf("_________________________________________ \n");
    System.out.println("a) 27");
    System.out.println("b) 26");
    System.out.println("c) 25");
    String preguntaNueve = System.console().readLine().toLowerCase();
       if (preguntaNueve.equals("b")) {
		puntuacion ++;
		System.out.println("Respuesta correcta");
	} else {
		System.out.println("Respuesta incorrecta");
	}
    
    System.out.printf("_________________________________________ \n");
    System.out.printf("_________________________________________ \n");
    
    System.out.println("10ª pregunta: Cruz y Raya");
    System.out.println("¿Cuál es la segunda letra del abecedario?");
    System.out.printf("_________________________________________ \n");
    System.out.println("a) b");
    System.out.println("b) a");
    System.out.println("c) Ambas son correctas (o no)");
    String preguntaDiez = System.console().readLine().toLowerCase();
       
		puntuacion ++;
		System.out.println("Respuesta correcta");
	
	System.out.println("Tu puntuación ha sido de: " + puntuacion);
	if (puntuacion >=5) {
		System.out.println("¡Enhorabuena!");
	} else {
		System.out.println("Necesitas esforzarte más");
	}
    
	}
}
