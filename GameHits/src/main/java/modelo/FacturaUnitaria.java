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

public class FacturaUnitaria extends Factura {
    private String idJuego;
    private int cantidad;
    private double subtotal;

    public FacturaUnitaria() {
        super();
        idJuego = "";
        cantidad = 0;
        subtotal = 0;
    }

    public FacturaUnitaria(String idJuego) {
        super();
        this.idJuego = idJuego;
        this.cantidad = 0;
        this.subtotal = 0.0;
    }

    public String getCodigoProducto() {
        return idJuego;
    }

    public void setCodigoProducto(String idJuego) {
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

    public boolean existeJuego(ArrayList<Videojuego> videojuegos) {
        for (Videojuego vj : videojuegos) {
            if (vj.getId().equals(this.idJuego)){
                return true;
            }
        }
        return false;
    }

    /**
     * Saca el videojuego de las lista de videojuegos
     *
     * @param videojuegos Coleccion de videojuego
     * @return Id juego
     */
    public Videojuego obtenerJuego(ArrayList<Videojuego> videojuegos){
        for (Videojuego vj: videojuegos){
            if (vj.getId().equals(idJuego)){
                return vj;
            }
        }
        return null;
    }

    public double obtenerSubtotal(ArrayList<Videojuego> videojuegos) {
        for (Videojuego vj : videojuegos) {
            if (vj.getId().equals(idJuego)) {
                return vj.getPrecio() * cantidad;
            }
        }
        return 0.0;
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

            subtotal = obtenerSubtotal(videojuegos);
            total = obtenerSubtotal(videojuegos) + (obtenerSubtotal(videojuegos) * iva / 100);
            for (Cliente c:clientes){
                if (c.getDni().equals(dniCliente)){
                    c.darPuntos( (int)total / 10);
                }
            }
            facturas.add(this);
        } catch (Exception e) {
            throw new Exception("Error en el alta de facturas\n" + e.getMessage());
        }
    }
}
