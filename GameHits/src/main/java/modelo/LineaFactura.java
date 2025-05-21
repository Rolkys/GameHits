/**
 *
 *  Proyecto gestion de una tienda de videojuegos</br>
 *
 *
 * @author Raúl Marín García y José Valero Fernández
 * @version 2.0
 * @since 20/05/2025
 *
 */

package modelo;


import java.util.ArrayList;

public class LineaFactura {
    private String idFactura;
    private String idJuego;
    private int cantidad;
    private double subtotal;

    public LineaFactura() {
        idFactura = "";
        idJuego = "";
        cantidad = 0;
        subtotal = 0.0;
    }

    public LineaFactura(String idFactura, String idJuego) {
        this.idFactura = idFactura;
        this.idJuego = idJuego;
        cantidad = 0;
        subtotal = 0.0;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public String getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(String idJuego) {
        this.idJuego = idJuego;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public boolean existeLinea(ArrayList<LineaFactura> lineas) {
        for (LineaFactura linea : lineas) {
            if (linea.getIdFactura().equals(idFactura)) {
                if (linea.getIdJuego().equals(idJuego)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean altaLinea(ArrayList<LineaFactura> lineas) {
        if (existeLinea(lineas)) {
            return false;
        }
        lineas.add(this);

        return true;
    }

    /**
     * calcula el total del producto que tiene la linea
     * @param videojuegos Coleccion de videojuego
     */
    public void calcularSubTotal(ArrayList<Videojuego> videojuegos) {
        for (Videojuego vj : videojuegos) {
            if (vj.getId().equals(idJuego)) {
                subtotal = cantidad* vj.getPrecio();
            }
        }
    }

    /**
     * Obtiene el nombre del videojuego pedido
     * @param videojuegos Coleccion de videojuego
     * @return Nombre del videojuego
     */

    public String getNombre(ArrayList<Videojuego> videojuegos) {
        String nombre = "";
        for (Videojuego videojuego: videojuegos){
            if (videojuego.getId().equals(idJuego)){
                nombre=videojuego.getTitulo();
            }
        }
        return nombre;
    }
    public Videojuego getJuego(ArrayList<Videojuego> videojuegos) {
        for (Videojuego videojuego: videojuegos){
            if (videojuego.getId().equals(idJuego)){
                return videojuego;
            }
        }
        return null;
    }
}
