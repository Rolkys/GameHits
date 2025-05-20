package modelo;

import java.lang.reflect.Array;
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

    public void calcularSubTotal(ArrayList<Videojuego> videojuegos) {
        for (Videojuego vj : videojuegos) {
            if (vj.getId().equals(idJuego)) {
                subtotal = cantidad* vj.getPrecio();
            }
        }
    }

    public String getNombre(ArrayList<Videojuego> videojuegos) {
        String nombre = "";
        for (Videojuego vj: videojuegos){
            if (vj.getId().equals(idJuego)){
                nombre=vj.getTitulo();
            }
        }
        return nombre;
    }
}
