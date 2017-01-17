/**
* Funciones matemáticas
* Tema 8
*
* @author David León Galisteo
*/

package matematicas;

public class FuncionesMatematicas {
  
  /**
* Comprueba si un número es capicúa o no.
*
* @param x es el número introducido por el usuario
* @return <code>true</code> si el número es capicúa 
* @return <code>false</code> si no es capicúa
*/

public static boolean esCapicua(int x) {
  int a = x; //guardamos el valor de "x" en "a" para su posterior uso en volteado
  
  int volteado = 0;
  
  while (a > 0) {
    volteado = volteado * 10 + a % 10;
    a /= 10;
  }
  
  return (x == volteado);
   
}

  /**
* Comprueba si un número es primo o no.
*
* @param x es el número introducido por el usuario
* @return <code>true</code> si el número introducido es primo 
* @return <code>false</code> si el número introducido no es primo
*/

public static boolean esPrimo(int x) {
  for (int i = 2; i < x; i++) {
    if ((x % i) == 0) {
      return false;
    } 
  }
return true;
}

/**
* Devuelve el siguiente primo al número introducido.
*
* @param x es el número introducido por el usuario
* @return <code>miPrimo</code> el siguiente primo al número introducido.
*/

public static int siguientePrimo(int x) {
 int miPrimo = x;
  
  do {
    miPrimo++;
  } while (!esPrimo(miPrimo));
  return miPrimo;
}

/**
* Dada la base y un exponente devuelve una potencia.
*
* @param x es la base introducida por el usuario
* @param y es el exponente introducido por teclado
* @return <code>potencia</code> el resultado de la potencia entre el número base y su exponente
*/

public static int potencia(int x, int y) {
  int potencia = 1;
  
  for (int i = 0; i <= y; i++) {
    potencia *= x;
  }
  return potencia;
}

/**
* Cuenta el número de dígitos de un número entero
*
* @param x es el número entero introducido por el usuario
* @return <code>digitos</code> número de dígitos 
*/

public static int digitos(int x) {
  if (x == 0) {
  return 1;
  } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
        }
    return n;
  }
}

/**
* Voltea un número introducido por teclado
*
* @param x es el número entero introducido por el usuario
* @return <code>volteado</code> número volteado 
*/
  
  public static int voltea(int x) {
    int volteado = 0;
  
  while (x > 0) {
    volteado = volteado * 10 + x % 10;
    x /= 10;
  }
  
  return volteado;
}

/*
* Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0
* y de izquierda a derecha.
* @param n es el número entero introducido por el usuario
  @param x es el número que indica la posición a buscar en el número n
* @return <code>digito</code> es el dígito indicado por la posicion. 
*/
 public static int digitoN(int n, int x) {
   int aux = voltea(n);
   
   if (x == 1) {
     return aux % 10;
   } else {
     for (int i = 1; i <= x; i++) {
       aux /= 10;
     } //for
     return aux % 10;
    } //else
    
  } //digitoN
  
  
/* *
* Da la posición de la primera ocurrencia de un dígito dentro de un número entero. 
* Si no se encuentra devuelve -1
* @param n es el número entero introducido por el usuario
* @param x es el número el cual se va a buscar la ocurrencia
* @return <code>posicion</code> posición del número x en n 
*/
   
  public static int posicionDeDigito(int n, int x) {
    
      int volteado = voltea(n);
      int posicion = 1;
      
      while (volteado >= 0) {
        if (volteado % 10 == x) {
          return posicion;
        } 
        
        posicion++;
        volteado /= 10;
      }
      
      return -1;
    } //función posicionDeDigito
    
    
    
    
/* Le quita a un número n digitos por detrás (por la derecha).
* 
* @param n es el número entero introducido por el usuario
* @param x es el número de dígitos que se le va a quitar el número
* @return <code>numeroCortado</code> devuelve el número cortado por la derecha según x 
*/
   
public static int quitaPorDetras(int n, int x) {
  int numeroCortado = n;
  
  while (x > 0) {
    numeroCortado /= 10;
  }
  
  return numeroCortado;
}

  
/* Le quita a un número n digitos por delante (por la izquierda).
* 
* @param n es el número entero introducido por el usuario
* @param x es el número de dígitos que se le va a quitar el número
* @return <code>numeroCortado</code> devuelve el número cortado por la izquierda según x 
*/  
  
 public static int quitaPorDelante(int n, int x) {
   int numeroCortado = voltea(n);
   
   while (x > 0) {
     numeroCortado /= 10;
   }
   
   return numeroCortado;
 }
 
 
 
 
/* Añade un dígito a un número por detrás.
* 
* @param n es el número entero introducido por el usuario
* @param x es el dígito a añadir a n
* @return <code>numeroNuevo</code> devuelve el número nuevo al que se le añade el dígito x 
*/  

public static int pegaPorDetras(int n, int x) {
  int numeroNuevo = n * 10 + x;
  return numeroNuevo;
}


/* Añade un dígito a un número por delante.
* 
* @param n es el número entero introducido por el usuario
* @param x es el dígito a añadir a n
* @return <code>numeroNuevo</code> devuelve el número nuevo al que se le añade el dígito x 
*/  
  
public static int pegaPorDelante(int n, int x) {
  int numeroNuevo = voltea(n) * 10 + x;
  voltea(numeroNuevo);
  return numeroNuevo;
}



/* Toma como parámetros las posiciones "inicial" y "final" dentro de un número y devuelve
* el trozo correspondiene.
* @param n es el número entero introducido por el usuario
* @param inicial es el número de dígitos que se tomará como posición inicial
* @param dFinal es el número de dígitos que se tomará como posición final
*
* @return <code>numeroTroceado</code> devuelve el trozo del número introducido  
*/ 
 
 public static int trozoDeNumero(int n, int inicial, int dFinal) {
   int numeroEntero = n;
   numeroEntero = quitaPorDelante(n, inicial);
   numeroEntero = quitaPorDetras(n, dFinal);
   
   return numeroEntero;
 }
 
/* Pega 2 números para juntar 1.
* 
* @param a es el primer número introducido por el usuario
* @param b es el segundo número introducido por el usuario
* @return <code>numeroNuevo</code> devuelve el número formado por a y b 
*/ 
   
 public static int juntaNumeros(int a, int b) {
   int digitos = digitos(b);
   
   for (int i = 0; i < digitos; i++) {
     a *= 10;
   }
   
   int numeroNuevo = a + b;
   return numeroNuevo;
 } 
}
