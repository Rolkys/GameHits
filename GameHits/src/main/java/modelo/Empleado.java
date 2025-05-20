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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
