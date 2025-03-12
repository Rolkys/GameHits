package modelo;

public class Cliente extends Persona {
    protected int puntos;

    public Cliente() {
        super();
        puntos = 0;
    }

    public Cliente(String dni) {
        super(dni);
        this.puntos = 0;
    }

    public Cliente(String nombre, String dni, String telefono, int puntos) {
        super(nombre, dni, telefono);
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
