package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {
    protected String id;
    private LocalDate fecha;
    private String dniCliente;
    private String dniEmpleado;
    protected int iva;
    protected double total;

    public static int contFacturas = 1;
    public static int numFacturas = 0;

    public Factura() {
        id = "";
        fecha = LocalDate.now();
        dniCliente = "";
        dniEmpleado = "";
        iva = 0;
        total = 0;
    }

    public Factura(String id) {
        this.id = id;
        fecha = LocalDate.now();
        dniCliente = "";
        dniEmpleado = "";
        iva = 0;
        total = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getDniEmpleado() {
        return dniEmpleado;
    }

    public void setDniEmpleado(String dniEmpleado) {
        this.dniEmpleado = dniEmpleado;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double calcularTotalU(Factura factura){
        return ((FacturaU)factura).getSubtotal();
    }

    public double calcularTotal(ArrayList<LineaFactura> lineas){
        double suma = 0.0;
        for (LineaFactura linea:lineas){
            suma = suma + linea.getSubtotal();
        }
        return suma +(suma*iva/100);
    }

    public Cliente getCliente(ArrayList<Cliente> clientes){
        int op = -1;
        for (Cliente cliente:clientes){
            if (cliente.getDni().equals(dniCliente)){
                op=clientes.indexOf(cliente);
            }
        }
        return clientes.get(op);
    }
    public Empleado getEmpleado(ArrayList<Empleado> empleados){
        int op = -1;
        for (Empleado empleado:empleados){
            if (empleado.getDni().equals(dniEmpleado)){
                op=empleados.indexOf(empleado);
            }
        }
        return empleados.get(op);
    }
    public boolean existeFacturas(ArrayList<Factura> facturas) {
        for (Factura factura : facturas) {
            if (factura.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    /*public void bajaFacturas(Set<Factura> facturas) throws Exception {
        if (!existeFacturas(facturas)) {
            throw new Exception("La factura ya existe");
        }

        for (Factura factura : facturas) {
            if (factura.getId().equals(id)) {
                facturas.remove(factura);
            }
        }
    }*/
}
