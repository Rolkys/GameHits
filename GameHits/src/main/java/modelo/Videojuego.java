/**
 *
 *  Proyecto gestion de una tienda de videojuegos</br>
 *
 *
 * @author Raúl Marín García y José Valero Fernández
 * @version 1.5.2
 * @since 20/05/2025
 *
 */

package modelo;

import java.util.ArrayList;

public class Videojuego {
    private String id; //Se puede usar el titulo como PK pq no suele haber 2 juegos que se llamen igual XDD
    private String titulo;
    private String categoria;
    private double precio;
    private tipoJuego tipo;

    public enum tipoJuego {NUEVO, SEGMANO;}

    public Videojuego() {
        id = "";
        titulo = "";
        categoria = "";
        precio = 0;
        tipo = null;
    }

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

    public String getTipoString() {
        return tipo.toString();
    }

    public void setTipo(tipoJuego tipo) {
        this.tipo = tipo;
    }

    public void setTipo(int op) throws Exception {
        if (op == 1) {
            tipo = tipoJuego.NUEVO;
        } else if (op == 2) {
            tipo = tipoJuego.SEGMANO;
        } else {
            throw new Exception("Error en setTipo");
        }
    }

    /*METODOS*/
    public boolean existeJuego(ArrayList<Videojuego> videojuegos) {
        for (Videojuego videojuego : videojuegos) {
            if (videojuego.getId().equals(this.id)) {
                return true;
            }
        }
        return false;
    }

    public void altaJuego(ArrayList<Videojuego> videojuegos) throws Exception {
        if (existeJuego(videojuegos)) throw new Exception("MI BOMBO");
        try {
            videojuegos.add(this);
            return;
        } catch (Exception e) {
            throw new Exception("Error en alta juego");
        }
    }

    public void bajaJuego(ArrayList<Videojuego> videojuegos) throws Exception {
        if (!existeJuego(videojuegos)) throw new Exception("MI BOMBO");

        for (Videojuego videojuego : videojuegos) {
            if (videojuego.getId().equals(id)) {
                videojuegos.remove(videojuego);

                return;
            }

        }
    }
}
