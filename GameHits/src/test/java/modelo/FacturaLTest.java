package modelo;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FacturaLTest {
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Empleado> empleados = new ArrayList<>();
    ArrayList<Videojuego> videojuegos = new ArrayList<>();
    ArrayList<Factura> facturas = new ArrayList<>();
    @Test
    void altaFacturas() {
        Cliente c = new Cliente("123","Pepe","123456789",1);
        clientes.add(c);
        Empleado emp = new Empleado("321","Manolo","987654321","Cajero");
        empleados.add(emp);
        videojuegos.add(new Videojuego("111", "Persona 5", "mazmorras", 59.99, Videojuego.tipoJuego.NUEVO));

        Factura factura= new FacturaL();
        factura.setFecha(LocalDate.now());
        factura.setDniCliente(c.getDni());
        factura.setDniEmpleado(emp.getDni());
        factura.setIva(21);
        ArrayList<LineaFactura> lineas = ((FacturaL)factura).getLineas();
        LineaFactura linea = new LineaFactura();
        linea.setIdJuego("111");
        linea.setCantidad(2);
        linea.altaLinea(((FacturaL) factura).getLineas());
        linea.calcularSubTotal(videojuegos);
        factura.setTotal(linea.getSubtotal());
        try{
            ((FacturaL) factura).altaFacturas(clientes, facturas, videojuegos, empleados);
        }catch(Exception e){
            fail();
        }
    }
}