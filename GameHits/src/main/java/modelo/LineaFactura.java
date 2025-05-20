package modelo;

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

    public boolean existeLinea(LineaFactura[] lineas) {

        for (int i = 0; i < lineas.length; i++) {
            if (lineas[i] != null) {
                if (lineas[i].getIdFactura().equals(idFactura)) {
                    if (lineas[i].getCodigoProducto() == codigoProducto) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean altaLinea(LineaFactura[] lineas) {
        if (existeLinea(lineas)) {
            return false;
        }

        for (int i = 0; i < lineas.length; i++) {
            if (lineas[i] == null) {
                lineas[i] = this;
                return true;
            }
        }

        return false;
    }

    public void calcularSubTotal(Producto[] productos) {
        for (Videojuego vj: videojuegos){
            if (vj.getId().equals(idJuego)){

            }
        }
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                if (productos[i].getCodigo() == codigoProducto) {
                    subtotal = cantidad * productos[i].getPrecioU();
                }
            }
        }
    }

    public String getNombre(Producto[] productos) {
        String nombre = "";
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                if (productos[i].getCodigo() == this.codigoProducto) {
                    nombre = productos[i].getNombre();
                }
            }
        }
        return nombre;
    }
}
