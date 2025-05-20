package modelo;

public class FacturaU extends Factura {
    /*private int codigoProducto;
    private int cantidad;
    private double subtotal;

    public FacturaU() {
        super();
        codigoProducto = 0;
        cantidad = 0;
        subtotal = 0;
    }

    public FacturaU(int codigoProducto) {
        super();
        this.codigoProducto = codigoProducto;
        this.cantidad = 0;
        this.subtotal = 0.0;
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

    public boolean existeProducto(List<Producto> productos) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigoProducto) {
                return true;
            }
        }
        return false;
    }

    public Producto obtenerProducto(List<Producto> productos) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigoProducto) {
                return producto;
            }
        }
        return null;
    }

    public double obtenerSubtotal(List<Producto> productos) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigoProducto) {
                return producto.getPrecioUnidad() * cantidad;
            }
        }
        return 0.0;
    }

    public void altaFacturas(Map<String, Cliente> clientes, Set<Factura> facturas, List<Producto> productos) throws Exception {
        try {
            Cliente clientetmp = new Cliente();
            clientetmp.setDni(dni);
            boolean existeCliente = clientetmp.existeCliente(clientes);

            if (!existeCliente) {
                throw new Exception("El cliente no existe");
            }

            if (existeFacturas(facturas)) {
                throw new Exception("La factura ya existe");
            }
            id = String.format("FA%03d", contFacturas++);

            subtotal = obtenerSubtotal(productos);
            total = obtenerSubtotal(productos) + (obtenerSubtotal(productos) * IVA / 100);

            facturas.add(this);
        } catch (Exception e) {
            throw new Exception("Error en el alta de facturas\n" + e.getMessage());
        }
    }*/
}
