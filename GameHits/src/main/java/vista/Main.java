package vista;

import java.util.Scanner;

public class Main {
    //Easter Egg opcion 69 = a borrar todos los puntos a los clientes
    private static int mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("----");
        System.out.println("1.- Alta de Cliente.");
        System.out.println("2.- Baja de Cliente.");
        System.out.println("3.- Alta de Videojuego.");
        System.out.println("4.- Baja de Videojuego.");
        System.out.println("5.- Alta Empleado");
        System.out.println("6.- Baja Empleado");
        System.out.println("7.- Nueva Factura.");
        System.out.println("8.- Listado de Clientes.");
        System.out.println("9.- Listado de Empleados");
        System.out.println("10.- Listado de Videojuegos.");
        System.out.println("11.- Listado de Facturas");
        System.out.println("0.- Salir.");
        System.out.println("");
        System.out.print("Opcion? ");
        int op = sc.nextInt();
        System.out.println("");
        return op;
    }

    public static void main(String[] args) {
        System.out.println("Has sido bareboneado");
        //algo
    }


}
