package modelo;

public class Cliente extends Persona {
    protected int gamePoints;

    public Cliente() {
        super();
        gamePoints = 0;
    }

    public Cliente(String dni) {
        super(dni);
        this.puntos = 0;
    }

    public Cliente(String nombre, String dni, String telefono, int gamePoints) {
        super(nombre, dni, telefono);
        this.gamePoints = gamePoints;
    }

    public int getGamePoints() {
        return gamePoints;
    }

    public void setGamePoints(int gamePoints) {
        this.gamePoints = gamePoints;
    }
}
