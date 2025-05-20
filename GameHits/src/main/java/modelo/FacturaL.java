package modelo;

public class FacturaL extends Factura {
    /*private List<LineaFactura> lineas;

    public FacturaL() {
        super();
        lineas = new ArrayList<>();
    }

    public FacturaL(List<LineaFactura> lineas) {
        super();
        this.lineas = lineas;
    }

    public List<LineaFactura> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaFactura> lineas) {
        this.lineas = lineas;
    }

    public void setLineaFactura(LineaFactura linea) {
        lineas.add(linea);
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

            for (LineaFactura linea : lineas) {
                linea.setIdFactura(id);
            }

            total = super.calcularTotal(lineas);
            facturas.add(this);
        } catch (Exception e) {
            throw new Exception("Error en el alta de facturas\n" + e.getMessage());
        }
    }
    */
}
