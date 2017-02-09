
import java.util.Scanner;

/**
 * Ejercicio 5 Array de objetos
 *
 * @author David León Galisteo
 */
public class PruebaClases {

  public static void main(String[] args) {
    System.out.println("Bienvenido al programa del supermercado de tu barrio.");

    Articulo[] productos = new Articulo[10];

    for (int i = 0; i < productos.length; i++) {
      productos[i] = new Articulo();
      productos[i].setCodigo(0);
      productos[i].setDescripcion("vacío");
      productos[i].setPrecioCompra(0);
      productos[i].setPrecioVenta(0);
      productos[i].setStock(0);
    }

    ///////////////////////AÑADIMOS PRODUCTOS AL ARRAY PARA VISUALIZACIÓN DE PRUEBA///////////
    productos[0].setCodigo(23);
    productos[0].setDescripcion("Leche Puleva");
    productos[0].setPrecioCompra(0.40f);
    productos[0].setPrecioVenta(0.80f);
    productos[0].setStock(25);

    productos[1].setCodigo(24);
    productos[1].setDescripcion("Coca Cola 2L");
    productos[1].setPrecioCompra(0.50f);
    productos[1].setPrecioVenta(1.20f);
    productos[1].setStock(30);

    productos[2].setCodigo(25);
    productos[2].setDescripcion("Helado Calipo");
    productos[2].setPrecioCompra(0.20f);
    productos[2].setPrecioVenta(0.60f);
    productos[2].setStock(15);
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /////////////////////MENÚ////////////////////////////
    Scanner n = new Scanner(System.in);
    int option = 0;
    boolean exit = false;

    while (!exit) {
      switch (option) {
        case 0:
          pintaMenu();   //////MENÚ GESTISIMAL
          option = Integer.parseInt(n.nextLine());
          break;

        case 1:
          imprimeArticulos(productos); ///////////PRINT DE LOS ARTÍCULOS
          option = 0;
          break;

        case 2:
          addNewProduct(productos);
          option = 0;
          break;

        case 3:
          bajaProducto(productos);
          option = 0;
          break;

        case 4:
          modificaProducto(productos);
          option = 0;
          break;

        case 5:
          addStock(productos);
          option = 0;
          break;

        case 6:
          quitaStock(productos);
          option = 0;
          break;

        case 7:
          exit = true;
      }//SWITCH
    }//WHILE

  }

  //////////////////////////////////////FUNCIONES///////////////////////////////////////////////////
  public static void pintaMenu() {
    System.out.println("\n1. Listado");
    System.out.println("2. Alta");
    System.out.println("3. Baja");
    System.out.println("4. Modificación");
    System.out.println("5. Entrada de mercancia");
    System.out.println("6. Salida de mercancia");
    System.out.println("7. Salir");
  }

  public static void imprimeArticulos(Articulo[] productos) {
    for (Articulo p : productos) {
      System.out.println(p);
    }
  }

  public static void addNewProduct(Articulo[] productos) {
    Scanner n = new Scanner(System.in);
    int codigo = 0;
    String descripcion = "";
    float precioCompra = 0;
    float precioVenta = 0;
    int stock = 0;

    boolean productAdded = false; //CONTROLA SI SE AÑADE UN NUEVO PRODUCTO
    int i = 0; //VARIABLE QUE USAREMOS COMO ITINERANTE

    while (!productAdded) {
      if (productos[i].getCodigo() == 0) {
        System.out.println("\nIntroduzca el código del nuevo producto: ");
        codigo = Integer.parseInt(n.nextLine());

        System.out.println("\nIntroduzca la descripción del nuevo producto:");
        descripcion = n.nextLine();

        System.out.println("\nIntroduzca el precio-compra del nuevo producto:");
        precioCompra = Float.parseFloat(n.nextLine());

        System.out.println("\nIntroduzca el precio-venta del nuevo producto:");
        precioVenta = Float.parseFloat(n.nextLine());

        System.out.println("\nIntroduzca el stock del nuevo producto");
        stock = Integer.parseInt(n.nextLine());

        productos[i] = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
        System.out.println("\nEl producto se ha añadido correctamente.");

        productAdded = true;
      } else if (i == productos.length) {
        System.out.println("\nNo hay huecos libres para más productos.");
      } else {
        i++;
      }
    }//WHILE
  }//ADDNEWPRODUCT

  public static void bajaProducto(Articulo[] productos) {
    Scanner n = new Scanner(System.in);
    int cod = 0;
    boolean esBaja = false;

    System.out.print("\nInserte el código del producto que desee borrar: ");
    cod = Integer.parseInt(n.nextLine());

    for (Articulo p : productos) {
      if (cod == p.getCodigo()) { //si el código existe, inicializa los datos
        p.setCodigo(0);
        p.setDescripcion("vacío");
        p.setPrecioCompra(0);
        p.setPrecioVenta(0);
        p.setStock(0);

        System.out.println("\nEl producto ha sido dado de baja correctamente.");
        esBaja = true;
      }
    }
    
    if (!esBaja) {
      System.out.println("\nEse código de artículo no existe, por lo tanto no se puede borrar.");
    }

  }

  public static void modificaProducto(Articulo[] productos) {
    Scanner n = new Scanner(System.in);
    int codigo = 0;

    boolean modificado = false;
    String descripcion = "";
    float precioCompra = 0;
    float precioVenta = 0;
    int stock = 0;
    int cod = 0;

    System.out.println("\nEscriba el código del producto que desee modificar:");
    cod = Integer.parseInt(n.nextLine());

    for (Articulo p : productos) {
      if (cod == p.getCodigo()) {
        System.out.println("\nIntroduzca el código del nuevo producto: ");
        codigo = Integer.parseInt(n.nextLine());

        System.out.println("\nIntroduzca la descripción del nuevo producto:");
        descripcion = n.nextLine();

        System.out.println("\nIntroduzca el precio-compra del nuevo producto:");
        precioCompra = Float.parseFloat(n.nextLine());

        System.out.println("\nIntroduzca el precio-venta del nuevo producto:");
        precioVenta = Float.parseFloat(n.nextLine());

        System.out.println("\nIntroduzca el stock del nuevo producto");
        stock = Integer.parseInt(n.nextLine());

        p.setCodigo(codigo);
        p.setDescripcion(descripcion);
        p.setPrecioCompra(precioCompra);
        p.setPrecioVenta(precioVenta);
        p.setStock(stock);

        modificado = true;
        System.out.println("\nLos nuevos datos se han modificado correctamente.");
      }//IF
    }//FOR

    if (!modificado) {
      System.out.println("\nEse producto no existe.");
    }
  }//MODIFICA PRODUCTO

  public static void addStock(Articulo[] productos) {
    Scanner n = new Scanner(System.in);
    int cod = 0;
    int newStock = 0;
    boolean modificado = false;

    System.out.print("\n¿A qué producto desea añadir nuevo stock?: ");
    cod = Integer.parseInt(n.nextLine());

    for (Articulo p : productos) {
      if (cod == p.getCodigo()) {
        System.out.print("\n¿Cuánto stock ha entrado?: ");
        newStock = Integer.parseInt(n.nextLine());
        p.setStock(p.getStock() + newStock);

        System.out.println("\nEl nuevo stock se ha añadido correctamente.");
      }
    }

    if (!modificado) {
      System.out.println("\nNo se ha podido modificar el stock de ese producto.");
    }

  }

  public static void quitaStock(Articulo[] productos) {
    Scanner n = new Scanner(System.in);
    int cod = 0;
    int newStock = 0;
    boolean modificado = false;

    System.out.print("\n¿A qué producto desea eliminar stock?: ");
    cod = Integer.parseInt(n.nextLine());

    for (Articulo p : productos) {
      if (cod == p.getCodigo()) {
        System.out.print("\n¿Cuánto stock ha salido?: ");
        newStock = Integer.parseInt(n.nextLine());
        
        if (newStock > p.getStock) {
          System.out.println("\nNo se pueden sacar más productos de los que hay en stock");
        } else {
          p.setStock(p.getStock() - newStock);
          System.out.println("\nEl nuevo stock se ha añadido correctamente.");
          modificado = true;
        }
      }
    }

    if (!modificado) {
      System.out.println("\nNo se ha podido modificar el stock de ese producto.");
    }

  }

}
