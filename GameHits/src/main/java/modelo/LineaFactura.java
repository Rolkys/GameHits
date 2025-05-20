package modelo;

public class LineaFactura {
    /*private String idFactura;
    private int codigoProducto;
    private int cantidad;
    private double subtotal;

    public LineaFactura() {
        idFactura = "";
        codigoProducto = 0;
        cantidad = 0;
        subtotal = 0.0;
    }

    public LineaFactura(String idFactura, int codigoProducto) {
        this.idFactura = idFactura;
        this.codigoProducto = codigoProducto;
        cantidad = 0;
        subtotal = 0.0;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
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
    */
}
