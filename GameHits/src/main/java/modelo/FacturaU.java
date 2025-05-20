package modelo;

import java.util.ArrayList;

public class FacturaU extends Factura {
    private String idJuego;
    private int cantidad;
    private double subtotal;

    public FacturaU() {
        super();
        idJuego = "";
        cantidad = 0;
        subtotal = 0;
    }

    public FacturaU(String idJuego) {
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
            clientetmp.setDni(super.getDniCliente());
            empleadotmp.setDni(super.getDniEmpleado());

            if (!clientetmp.existeCliente(clientes)) {
                throw new Exception("El cliente no existe");
            }

            if (existeFacturas(facturas)) {
                throw new Exception("La factura ya existe");
            }
            id = String.format("FA%03d", contFacturas++);

            subtotal = obtenerSubtotal(videojuegos);
            total = obtenerSubtotal(videojuegos) + (obtenerSubtotal(videojuegos) * iva / 100);

            facturas.add(this);
        } catch (Exception e) {
            throw new Exception("Error en el alta de facturas\n" + e.getMessage());
        }
    }
}
