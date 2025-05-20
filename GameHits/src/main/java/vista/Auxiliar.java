package vista;

import modelo.Cliente;
import modelo.Empleado;
import modelo.Videojuego;

import java.util.ArrayList;

public class Auxiliar {


    public static void preCargaDatos(ArrayList<Empleado> empleados,ArrayList<Cliente>clientes,ArrayList<Videojuego>videojuegos){
        //2 empleados uno con dni "0" que seria el admin

        empleados.add(new Empleado("0","pepe", "111223344","Admin" ));
        empleados.add(new Empleado("1","manolo", "222334455","empleado" ));


        //2 clientes "Luciano" y "Vanesa"

        clientes.add(new Cliente("11","Luciano","111111111",2));
        clientes.add(new Cliente("22","Vanesa","222222222",5));
        //2 juegos "Persona 5" y "The last of Us"


        videojuegos.add(new Videojuego("111","Persona 5","mazmorras",59.99, Videojuego.tipoJuego.NUEVO));
        videojuegos.add(new Videojuego("222","The Last of Us","supervivencia",59.99, Videojuego.tipoJuego.SEGMANO));
    }
}
