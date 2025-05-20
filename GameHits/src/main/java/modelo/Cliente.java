package modelo;

import java.util.ArrayList;

public class Cliente {
    protected int gamePoints;
    private String nombre;
    private String dni;
    private String telefono;

    public Cliente() {
        dni = "";
        nombre = "";
        telefono = "";
        gamePoints = 0;
    }

    public Cliente(String dni) {
        this.dni = dni;
        nombre = "";
        telefono = "";
        gamePoints = 0;
    }

    public Cliente(String dni, String nombre, String telefono, int gamePoints) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.gamePoints = gamePoints;
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

    public int getGamePoints() {
        return gamePoints;
    }

    public void setGamePoints(int gamePoints) {
        this.gamePoints = gamePoints;
    }

    public boolean existeCliente(ArrayList<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            if (cliente.dni.equals(this.dni)) {
                return true;
            }
        }
        return false;
    }

    public void altaCliente(ArrayList<Cliente> clientes) throws Exception {
        if (existeCliente(clientes)) throw new Exception("MI BOMBO");
        try {
            clientes.add(this);
            return;
        } catch (Exception e) {
            throw new Exception("Error en alta juego");
        }
    }

    public void bajaCliente(ArrayList<Cliente> clientes) throws Exception {
        if (!existeCliente(clientes)) throw new Exception("MI BOMBO");

        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                clientes.remove(cliente);
                return;
            }


        }
    }
}