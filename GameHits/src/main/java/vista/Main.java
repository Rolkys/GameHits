/**
 *
 *  Proyecto gestion de una tienda de videojuegos</br>
 *
 *
 * @author Raúl Marín García y José Valero Fernández
 * @version 1.5.1
 * @since 20/05/2025
 *
 */
package vista;

import modelo.Cliente;
import modelo.Empleado;
import modelo.Videojuego;
import modelo.Factura;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Easter Egg opcion 69 = a borrar todos los puntos a los clientes

    /**
     * Muestra un menu de opciones
     *
     * @return Opción seleccionado
     */
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

    /**
     * Metodo principal del proyecto
     *
     * @param args Argumentos desde consola opcionales
     */
    public static void main(String[] args) {
        System.out.println("Has sido bareboneado");
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Videojuego> videojuegos = new ArrayList<>();
        ArrayList<Factura> facturas = new ArrayList<>();
        Auxiliar.preCargaDatos(empleados,clientes,videojuegos);
        int op = 0;
        do {
            op = mostrarMenu();
            switch (op) {
                case 1: { //Alta cliente
                    break;
                }
                case 2: {//Baja Cliente
                    break;
                }
                case 3: {//Alta Videojuego
                    Videojuego juego = new Videojuego();
                    try{
                        System.out.print("Introduce el id del Videojuego: ");
                        juego.setId(sc.next());
                        System.out.print("Introduce el titulo del Videojuego: ");
                        juego.setTitulo(sc.next());
                        System.out.print("Introduce la categoria del Videojuego: ");
                        juego.setCategoria(sc.next());
                        System.out.print("Introduce el precio del videojuego: ");
                        juego.setPrecio(sc.nextDouble());
                        System.out.print("Introduce el tipo de videojuego nuevo(1)Segunda mano(2): ");
                        juego.setTipo(sc.nextInt());

                        juego.altaJuego(videojuegos);
                        System.out.println("Alta correcta ID:"+juego.getId());
                    }catch(Exception e){
                        System.out.println("Alta incorrecta");
                    }
                    break;
                }
                case 4: {//Baja Videojuego
                    Videojuego juego = new Videojuego();
                    System.out.print("Introduce el id del Videojuego: ");
                    juego.setId(sc.next());
                    try{
                        juego.bajaJuego(videojuegos);
                    }catch(Exception e){
                        System.out.println("Baja incorrecta");
                    }
                    break;
                }
                case 5: {//Alta empleado
                    break;
                }
                case 6: {//Baja empleado
                    break;
                }
                case 7: {//Nueva factura
                    break;
                }
                case 8: {//Listado de clientes
                    break;
                }
                case 9: {//Listado de empleados
                    break;
                }
                case 10: {//Listado de Videojuegos
                    for (Videojuego vj : videojuegos){
                        System.out.printf("ID: %s TITULO: %s CATEGORIA: %s PRECIO: %.2f TIPO: %s\n",
                                vj.getId(),
                                vj.getTitulo(),
                                vj.getCategoria(),
                                vj.getPrecio(),
                                vj.getTipo());
                    }
                    break;
                }
                case 11: {//Listado de Facturas
                    break;
                }
                case 0:
                    System.out.println("Agustin apruebanos");
                    break;
            }
        } while (op != 0);

    }

}
