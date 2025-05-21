/**
 * Proyecto gestion de una tienda de videojuegos</br>
 *
 * @author Raúl Marín García y José Valero Fernández
 * @version 2.0
 * @since 20/05/2025
 */

package Logica;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConexionBD {

    /* Atributos **************************************************************/
    private static Connection conn;

    /* Constructores **********************************************************/
    public ConexionBD() {
        conn = null;
    }

    /* Métodos getters & setters **********************************************/
    public static Connection getConn() {
        return conn;
    }

    /* Métodos ****************************************************************/


    /**
     *Crea la tabla clientes si no existe
     *
     * @throws Exception Error porque no se pueden crear las tablas
     */
    private static void crearTablas() throws Exception {
        String sql;
        try (Statement st = conn.createStatement()) {
            sql = "CREATE TABLE IF NOT EXISTS clientes ("
                    + "DNI VARCHAR(9) NOT NULL,"
                    + "nombre VARCHAR(50) NOT NULL,"
                    + "telefono DECIMAL(6,2) NOT NULL,"
                    + "gamePoints INTEGER NOT NULL)";
            st.executeUpdate(sql);
        } catch (SQLException e) {
            throw new Exception("Error crearTablas()!!", e);
        }
    }

    /**
     *
     * Conecta con la base de datos
     *
     * @throws Exception Error en las propiedad o al abrir la conexion
     */

    public static void abrirConexion() throws Exception {
        try (FileInputStream fis = new FileInputStream("dbproperties.txt")) {
            Properties props = new Properties();
            props.load(fis);
            conn = DriverManager.getConnection(
                    props.getProperty("mysql.url"),
                    props.getProperty("mysql.username"),
                    props.getProperty("mysql.password"));
            crearTablas();
        } catch (IOException e) {
            throw new Exception("Error abrirConexion()!! Propiedades!!", e);
        } catch (SQLException e) {
            throw new Exception("Error abrirConexion()!!", e);
        }
    }

    /**
     * Cierra la conexion con la base de datos
     *
     * @throws Exception Error al cerrar la base de datos
     */
    public static void cerrarConexion() throws Exception {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new Exception("Error cerrarConexion()!!", e);
        }
    }

}
