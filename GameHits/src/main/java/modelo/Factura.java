package modelo;

import java.time.LocalDate;

public class Factura {
    private String id;
    private LocalDate fecha;
    private String dniCliente;
    private String dniEmpleado;
    private int iva;
    private double total;

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
}
