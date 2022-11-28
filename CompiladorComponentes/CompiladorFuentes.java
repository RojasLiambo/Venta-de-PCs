package Servlet.CompiladorComponentes;

/**
 *
 * @author MicheliLucio
 */

import static AccesoDatos.AccesoDatos.close;
import static AccesoDatos.AccesoDatos.getConnection;
import java.util.ArrayList;
import Modelo.Fuente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import AccesoDatos.AccesoDatos;
import java.sql.SQLException;


public class CompiladorFuentes {
    private static final String Sql_Select = "SELECT numeroSerie, nombrecomponente, marcafabricante, precio, impuesto, descripcion FROM componentes";
    private static final String Sql_Insert = "INSERT INTO componentes(numeroSerie, nombrecomponente, marcafabricante, precio, impuesto, descripcion) VALUES (?,?,?,?,?)";
    private static final String Sql_Update = "UPDATE componentes SET numeroSerie, nombrecomponente = ?, marcafabricante = ?, precio = ?, impuesto = ?, descripcion = ? WHERE numeroSerie = ?";
    private static final String Sql_Delete = "DELETE FROM componentes WHERE numeroSerie = ?";

    public ArrayList<Fuente> seleccionar() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Fuente fuente = null;
        ArrayList<Fuente> fuentes = new ArrayList();
        con = AccesoDatos.getConnection();
        
        try {
            con = AccesoDatos.getConnection();
            stmt = con.prepareStatement(Sql_Select);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int numeroSerie = rs.getInt("numeroSerie");
                String nombrecomponente = rs.getString("nombrecomponente");
                String marcafabricante = rs.getString("marcafabricante");
                double precio = rs.getDouble("precio");
                double impuesto = rs.getDouble("impuesto");
                String descripcion = rs.getString("descripcion");
                fuente = new Fuente(numeroSerie, nombrecomponente, marcafabricante, precio, impuesto, descripcion);
                fuentes.add(fuente);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(rs);
                close(con);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return fuentes;
    }    
    
}