package modelo;

public class Empleado  {
    protected String puesto;
    private String nombre;
    private String dni;
    private String telefono;

    public Empleado() {

        puesto = "";
    }

    public Empleado(String dni) {

        this.puesto = "";
    }


    public Empleado(String dni, String nombre, String telefono, String puesto) {

        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }



}
