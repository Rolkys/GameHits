package modelo;

public class Empleado  {
    protected String puesto;
    private String nombre;
    private String dni;
    private String telefono;

    public Empleado() {
        dni = "";
        nombre = "";
        telefono ="";
        puesto = "";
    }

    public Empleado(String dni) {
        this.dni = dni;
        nombre = "";
        telefono ="";
        puesto = "";
    }


    public Empleado(String dni, String nombre, String telefono, String puesto) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }



}
