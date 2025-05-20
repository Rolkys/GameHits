package modelo;

import java.util.ArrayList;

public class Cliente  {
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
        this.nombre = "";
        this.telefono = "";
        this.gamePoints = 0;
    }

    public Cliente(String dni, String nombre, String telefono, int gamePoints) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.gamePoints = gamePoints;
    }

    public int getGamePoints() {
        return gamePoints;
    }

    public void setGamePoints(int gamePoints) {
        this.gamePoints = gamePoints;
    }

    public boolean existeCliente(ArrayList<Cliente> clientes) {
        for (Cliente c : clientes) {
            if (c.dni.equals(this.dni)){
                return true;
            }
        }
        return false;
    }
    public void altaCliente(ArrayList<Cliente> clientes) throws Exception {
        if (existeCliente(clientes)) throw new Exception("MI BOMBO");
        try{
            clientes.add(this);
            return;
        }catch (Exception e){
            throw new Exception("Error en alta juego");
        }
    }

    public void bajaCliente(ArrayList<Cliente> clientes)throws Exception{
        if (!existeCliente(clientes)) throw new Exception("MI BOMBO");

        clientes.remove(dni);
        return;
    }


}
