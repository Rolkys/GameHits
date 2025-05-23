/**
 * Proyecto gestion de una tienda de videojuegos</br>
 *
 * @author Raúl Marín García y José Valero Fernández
 * @version 2.0
 * @since 20/05/2025
 */
package vista;

import modelo.*;

import java.time.LocalDate;
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
        Auxiliar.preCargaDatos(empleados, clientes, videojuegos);
        int op = 0;
        do {
            op = mostrarMenu();
            switch (op) {
                case 1: { //Alta cliente
                    Cliente cliente = new Cliente();
                    System.out.print("Introduce el dni del cliente: ");
                    cliente.setDni(sc.next());
                    System.out.print("Introduce el nombre del cliente: ");
                    cliente.setNombre(sc.next());
                    System.out.print("Introduce el telefono del cliente: ");
                    cliente.setTelefono(sc.next());


                    try{
                        cliente.altaCliente(clientes);
                        System.out.println("Alta de cliente correcta");
                    }catch(Exception e){
                        System.out.println("Alta de cliente incorrecta" + e.getMessage());
                    }
                    break;
                }
                case 2: {//Baja Cliente
                    Cliente cliente = new Cliente();
                    System.out.print("Introduce el dni del empleado: ");
                    cliente.setDni(sc.next());

                    try{
                        cliente.bajaCliente(clientes);
                        System.out.println("Baja de cliente correcta");
                    }catch(Exception e){
                        System.out.println("Baja de cliente incorrecta" + e.getMessage());
                    }
                    break;
                }
                case 3: {//Alta Videojuego
                    Videojuego juego = new Videojuego();
                    try {
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
                        System.out.println("Alta correcta ID:" + juego.getId());
                    } catch (Exception e) {
                        System.out.println("Alta incorrecta");
                    }
                    break;
                }
                case 4: {//Baja Videojuego
                    Videojuego juego = new Videojuego();
                    System.out.print("Introduce el id del Videojuego: ");
                    juego.setId(sc.next());
                    try {
                        juego.bajaJuego(videojuegos);
                        System.out.println("Baja de videojuego correcta");
                    } catch (Exception e) {
                        System.out.println("Baja de videojuego incorrecta");
                    }
                    break;
                }
                case 5: {//Alta empleado
                    Empleado empleado = new Empleado();
                    System.out.print("Introduce el dni del empleado: ");
                    empleado.setDni(sc.next());
                    System.out.print("Introduce el nombre del empleado: ");
                    empleado.setNombre(sc.next());
                    System.out.print("Introduce el telefono del empleado: ");
                    empleado.setTelefono(sc.next());
                    System.out.print("Introduce el puesto del empleado: ");
                    empleado.setPuesto(sc.next());

                    try{
                        empleado.altaEmpleado(empleados);
                        System.out.println("Alta de empleado correcta");
                    }catch(Exception e){
                        System.out.println("Alta de empleado incorrecta" + e.getMessage());
                    }
                    break;
                }
                case 6: {//Baja empleado
                    Empleado empleado = new Empleado();
                    System.out.print("Introduce el dni del empleado: ");
                    empleado.setDni(sc.next());

                    try{
                        empleado.bajaEmpleado(empleados);
                        System.out.println("Baja de empleado correcta");
                    }catch(Exception e){
                        System.out.println("Baja de empleado incorrecta \n" + e.getMessage());
                    }
                    break;
                }
                case 7: {//Nueva factura
                    Factura factura;
                    System.out.print("Seleccione el tipo de factura: (1)Unica (2)Multiple: ");
                    int of = sc.nextInt();
                    System.out.print("Introduce el dni del Cliente: ");
                    String dniC = sc.next();
                    System.out.print("Introduce el dni del Empleado: ");
                    String dniE = sc.next();
                    System.out.print("Introduce el iva: ");
                    int iva = sc.nextInt();

                    int cont = 0;
                    char c = ' ';
                    if (of == 1) {
                        factura = new FacturaUnitaria();
                        factura.setFecha(LocalDate.now());
                        factura.setDniCliente(dniC);
                        factura.setDniEmpleado(dniE);
                        factura.setIva(iva);
                        System.out.print("Introduce el id de videojuego: ");
                        String id = sc.next();
                        System.out.print("Introduce la cantidad: ");
                        int cant = sc.nextInt();
                        ((FacturaUnitaria) factura).setCantidad(cant);
                        ((FacturaUnitaria) factura).setCodigoProducto(id);
                        try {
                            ((FacturaUnitaria) factura).altaFacturas(clientes, facturas, videojuegos, empleados);
                            System.out.println("Alta de factura correcta ID:"+factura.getId());
                        }catch(Exception e){
                            System.out.println("Alta de factura incorrecta"+e.getMessage());
                        }
                    } else if (of == 2) {
                        factura = new FacturaLinea();
                        factura.setFecha(LocalDate.now());
                        factura.setDniCliente(dniC);
                        factura.setDniEmpleado(dniE);
                        factura.setIva(iva);
                        do {
                            LineaFactura linea = new LineaFactura();
                            System.out.print("Introduce el id del videojuego: ");
                            String id = sc.next();
                            System.out.print("Introduce la cantidad de producto: ");
                            int cant = sc.nextInt();
                            linea.setCantidad(cant);
                            linea.setIdJuego(id);
                            linea.altaLinea(((FacturaLinea) factura).getLineas());
                            linea.calcularSubTotal(videojuegos);
                            factura.setTotal(linea.getSubtotal());
                            System.out.print("Quieres introducir otra linea de factura (s/n): ");
                            c = sc.next().charAt(0);
                        } while (c != 'n');

                        try {
                            ((FacturaLinea) factura).altaFacturas(clientes, facturas, videojuegos, empleados);
                            System.out.println("Alta de factura correcta ID:"+factura.getId());
                        }catch(Exception e){
                            System.out.println("Alta de factura incorrecta"+e.getMessage());
                        }
                    } else {
                        System.out.println("Opcion no valida");
                    }

                    break;
                }
                case 8: {//Listado de clientes
                    System.out.println("LISTADO DE CLIENTES");
                    System.out.println("--------------------");
                    for(Cliente cliente : clientes){
                        System.out.printf("DNI: %s NOMBRE: %s TELEFONO: %s GAMEPOINTS: %d\n",
                                cliente.getDni(),
                                cliente.getNombre(),
                                cliente.getTelefono(),
                                cliente.getGamePoints());
                    }
                    break;
                }
                case 9: {//Listado de empleados
                    System.out.println("LISTADO DE EMPLEADOS");
                    System.out.println("--------------------");
                    for(Empleado empleado : empleados){
                        System.out.printf("DNI: %s NOMBRE: %s TELEFONO: %s PUESTO: %s\n",
                                empleado.getDni(),
                                empleado.getNombre(),
                                empleado.getTelefono(),
                                empleado.getPuesto());
                    }
                    break;
                }
                case 10: {//Listado de Videojuegos
                    System.out.println("LISTADO DE VIDEOJUEGOS");
                    System.out.println("----------------------");
                    for (Videojuego videojuego : videojuegos) {
                        System.out.printf("ID: %s TITULO: %s CATEGORIA: %s PRECIO: %.2f TIPO: %s\n",
                                videojuego.getId(),
                                videojuego.getTitulo(),
                                videojuego.getCategoria(),
                                videojuego.getPrecio(),
                                videojuego.getTipo());
                    }
                    break;
                }
                case 11: {//Listado de Facturas
                    System.out.println("LISTADO DE FACTURAS");
                    System.out.println("-------------------");
                    for (Factura factura : facturas){
                        if (factura instanceof FacturaUnitaria){
                            System.out.printf("ID: %s FECHA: %s DNI CLIENTE: %s DNI EMPLEADO: %s IVA: %d TOTAL: %.2f CANTIDAD: %d VIDEOJUEGO: %s\n",
                                    factura.getId(),
                                    factura.getFecha(),
                                    factura.getDniCliente(),
                                    factura.getDniEmpleado(),
                                    factura.getIva(),
                                    factura.getTotal(),
                                    ((FacturaUnitaria) factura).getCantidad(),
                                    ((FacturaUnitaria) factura).obtenerJuego(videojuegos).getTitulo());
                        } else if (factura instanceof FacturaLinea) {
                            System.out.printf("ID: %s FECHA: %s DNI CLIENTE: %s DNI EMPLEADO: %s IVA: %d TOTAL: %.2f\n",
                                    factura.getId(),
                                    factura.getFecha(),
                                    factura.getDniCliente(),
                                    factura.getDniEmpleado(),
                                    factura.getIva(),
                                    factura.getTotal());
                            for (LineaFactura linea : ((FacturaLinea) factura).getLineas()){
                                Videojuego videojuego = linea.getJuego(videojuegos);
                                System.out.printf("\tID: %s TITULO: %s CATEGORIA: %s TIPO: %s CANTIDAD: %d SUBTOTAL: %.2f\n",
                                        videojuego.getId(),
                                        videojuego.getTitulo(),
                                        videojuego.getCategoria(),
                                        videojuego.getTipoString(),
                                        linea.getCantidad(),
                                        linea.getSubtotal());
                            }
                        }
                    }
                    break;
                }
                case 69:
                    for (Cliente c:clientes){
                        c.setGamePoints(0);
                    }
                    break;
                case 0:
                    System.out.println("Agustin apruebanos");
                    break;
            }
        } while (op != 0);

    }

}
