package modelo;

public class Empleado extends Persona {
    protected String puesto;

    public Empleado() {
        super();
        puesto = "";
    }

    public Empleado(String dni) {
        super(dni);
        this.puesto = "";
    }

    public Empleado(String nombre, String dni, String telefono, String puesto) {
        super(nombre, dni, telefono);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
