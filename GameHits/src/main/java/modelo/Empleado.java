/**
 * Proyecto gestion de una tienda de videojuegos</br>
 *
 * @author Raúl Marín García y José Valero Fernández
 * @version 2.0
 * @since 20/05/2025
 */

package modelo;

import java.util.ArrayList;

public class Empleado {
    protected String puesto;
    private String nombre;
    private String dni;
    private String telefono;

    public Empleado() {
        dni = "";
        nombre = "";
        telefono = "";
        puesto = "";
    }

    public Empleado(String dni) {
        this.dni = dni;
        nombre = "";
        telefono = "";
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

    public boolean existeEmpleado(ArrayList<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            if (empleado.dni.equals(this.dni)) {
                return true;
            }
        }
        return false;
    }

    public void altaEmpleado(ArrayList<Empleado> empleados) throws Exception {
        if (existeEmpleado(empleados)) throw new Exception("MI BOMBO");
        try {
            empleados.add(this);
            return;
        } catch (Exception e) {
            throw new Exception("Error en alta juego");
        }
    }

    public void bajaEmpleado(ArrayList<Empleado> empleados) throws Exception {
        if (!existeEmpleado(empleados)) throw new Exception("MI BOMBO");

        if(dni.equals("0")) throw new Exception("No se puede borrar el administrador!!!");

        for (Empleado empleado : empleados) {
            if (empleado.getDni().equals(dni)) {
                empleados.remove(empleado);
                return;
            }


        }
    }
}
