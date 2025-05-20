package modelo;

import java.util.ArrayList;

public class Cliente extends Persona {
    protected int gamePoints;

    public Cliente() {
        super();
        gamePoints = 0;
    }

    public Cliente(String dni) {
        super(dni);
        this.gamePoints = 0;
    }

    public Cliente(String dni, String nombre, String telefono, int gamePoints) {
        super(dni, nombre, telefono);
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
            if (c.getDni().equals(this.dni)){
                return true;
            }
        }
        return false;
    }
}
