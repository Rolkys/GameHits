package modelo;

public class Videojuego {
    private String id; //Se puede usar el titulo como PK pq no suele haber 2 juegos que se llamen igual XDD
    private String titulo;
    private String categoria;
    private double precio;
    private tipoJuego tipo;

    private enum tipoJuego {NUEVO, SEGMANO;}

    public Videojuego(String id) {
        this.id = id;
        titulo = "";
        categoria = "";
        precio = 0;
        tipo = null;
    }

    public Videojuego(String id, String titulo, String categoria, double precio, tipoJuego tipo) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public tipoJuego getTipo() {
        return tipo;
    }

    public void setTipo(tipoJuego tipo) {
        this.tipo = tipo;
    }
}
