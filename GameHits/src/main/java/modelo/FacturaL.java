/**
 *
 *  Proyecto gestion de una tienda de videojuegos</br>
 *
 *
 * @author Raúl Marín García y José Valero Fernández
 * @version 1.5.1
 * @since 20/05/2025
 *
 */

package modelo;

import java.util.ArrayList;

public class FacturaL extends Factura {
    private ArrayList<LineaFactura> lineas;

    public FacturaL() {
        super();
        lineas = new ArrayList<>();
    }

    public FacturaL(ArrayList<LineaFactura> lineas) {
        super();
        this.lineas = lineas;
    }

    public ArrayList<LineaFactura> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaFactura> lineas) {
        this.lineas = lineas;
    }

    public void setLineaFactura(LineaFactura linea) {
        lineas.add(linea);
    }

    public void altaFacturas(ArrayList<Cliente> clientes, ArrayList<Factura> facturas, ArrayList<Videojuego> videojuegos,ArrayList<Empleado> empleados) throws Exception {
        try {
            Cliente clientetmp = new Cliente();
            Empleado empleadotmp = new Empleado();
            clientetmp.setDni(getDniCliente());
            empleadotmp.setDni(getDniEmpleado());

            if (!clientetmp.existeCliente(clientes)) {
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

}
