/**
 *
 * @author David León Galisteo
 */
public class Articulo {
    private int codigo;
    private String descripcion;
    private float precioCompra;
    private float precioVenta;
    private int stock;
    
    //////////////////////////////////////////////////////CONSTRUCTOR////////////////////////////////////////
    public Articulo() {
        
    }
    
    public Articulo(int c, String d, float pC, float pV, int s) {
        this.codigo = c;
        this.descripcion = d;
        this.precioCompra = pC;
        this.precioVenta = pV;
        this.stock = s;
    }
    
    /////////////////////////////////////////GETTER Y SETTER/////////////////////////////////////////////
    public int getCodigo() {
        return this.codigo;
    }
    
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public float getPrecioCompra() {
        return this.precioCompra;
    }
    
    public float getPrecioVenta() {
        return this.precioVenta;
    }
    
    public int getStock() {
        return this.stock;
    }
    
    public int setCodigo(int c) {
        return this.codigo = c;
    }
    
    public String setDescripcion(String d) {
        return this.descripcion = d;
    }
    
    public float setPrecioCompra(float pC) {
        return this.precioCompra = pC;
    }
    
    public float setPrecioVenta(float pV) {
        return this.precioVenta = pV;
    }
    
    public int setStock(int s) {
        return this.stock = s;
    }
    
    /////////////////////////////////////////////////MÉTODOS//////////////////////////////////////
    @Override
    public String toString() {
        String datos = "\nCódigo: " + this.getCodigo() +
                "\nDescripción: " + this.getDescripcion() +
                "\nPrecio Compra: " + this.getPrecioCompra() +
                "\nPrecio Venta: " + this.getPrecioVenta() +
                "\nEn stock: " + this.getStock();
        return datos;
    }
}
