package modelo;

public class Persona {
    protected String nombre;
    protected String dni;
    protected String telefono;

    public Persona(){
        dni="";
        nombre="";
        telefono="";
    }

    public Persona(String dni) {
        this.dni = dni;
        nombre="";
        telefono="";
    }

    public Persona(String nombre, String dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
