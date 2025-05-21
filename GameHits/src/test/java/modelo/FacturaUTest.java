package modelo;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FacturaUTest {
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Empleado> empleados = new ArrayList<>();
    ArrayList<Videojuego> videojuegos = new ArrayList<>();
    ArrayList<Factura> facturas = new ArrayList<>();
    @Test
    void altaFacturas(){
        Cliente c = new Cliente("123","Pepe","123456789",1);
        clientes.add(c);
        Empleado emp = new Empleado("321","Manolo","987654321","Cajero");
        empleados.add(emp);
        videojuegos.add(new Videojuego("111", "Persona 5", "mazmorras", 59.99, Videojuego.tipoJuego.NUEVO));

        Factura factura= new FacturaU();
        factura.setFecha(LocalDate.now());
        factura.setDniCliente(c.getDni());
        factura.setDniEmpleado(emp.getDni());
        factura.setIva(21);
        ((FacturaU) factura).setCantidad(1);
        ((FacturaU) factura).setCodigoProducto("111");

        try {
            ((FacturaU)factura).altaFacturas(clientes, facturas, videojuegos, empleados);
        }catch(Exception e){
            fail();
        }
    }
}