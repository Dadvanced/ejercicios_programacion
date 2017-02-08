
/**
 *
 * @author dadvanced
 */
public class Disco {

    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;

    /////////////////////////////////////////////CONSTRUCTORES///////////////////////////////////////////////////////////
    public Disco() {
    }

    public Disco(String c, String a, String t, String g, int d) {
        this.codigo = c;
        this.autor = a;
        this.titulo = t;
        this.genero = g;
        this.duracion = d;
    }

    ////////////////////////////////////////////////GETTER Y SETTER//////////////////////////////////////////////////////////
    public String getCodigo() {
        return this.codigo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public String setCodigo(String c) {
        return this.codigo = c;
    }

    public String setAutor(String a) {
        return this.autor = a;
    }

    public String setTitulo(String t) {
        return this.titulo = t;
    }

    public String setGenero(String g) {
        return this.genero = g;
    }

    public int setDuracion(int d) {
        return this.duracion = d;
    }

    @Override
    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena += "\n------------------------------------------";
        return cadena;
    }

}
