package modelo;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FacturaUnitariaTest {
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

        Factura factura= new FacturaUnitaria();
        factura.setFecha(LocalDate.now());
        factura.setDniCliente(c.getDni());
        factura.setDniEmpleado(emp.getDni());
        factura.setIva(21);
        ((FacturaUnitaria) factura).setCantidad(1);
        ((FacturaUnitaria) factura).setCodigoProducto("111");

        try {
            ((FacturaUnitaria)factura).altaFacturas(clientes, facturas, videojuegos, empleados);
        }catch(Exception e){
            fail();
        }
    }
}