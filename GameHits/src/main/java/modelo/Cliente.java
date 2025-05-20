package modelo;

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
}
