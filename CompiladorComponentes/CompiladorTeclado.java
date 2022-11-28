package Servlet.CompiladorComponentes;
/**
 *
 * @author MicheliLucio
 */
import static AccesoDatos.AccesoDatos.close;
import static AccesoDatos.AccesoDatos.getConnection;
import java.util.ArrayList;
import Modelo.Teclado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import AccesoDatos.AccesoDatos;
import java.sql.SQLException;


public class CompiladorTeclado {
    private static final String Sql_Select = "SELECT numeroSerie, nombrecomponente, marcafabricante, precio, impuesto, descripcion FROM componentes";
    private static final String Sql_Insert = "INSERT INTO componentes(numeroSerie, nombrecomponente, marcafabricante, precio, impuesto, descripcion) VALUES (?,?,?,?,?)";
    private static final String Sql_Update = "UPDATE componentes SET numeroSerie, nombrecomponente = ?, marcafabricante = ?, precio = ?, impuesto = ?, descripcion = ? WHERE numeroSerie = ?";
    private static final String Sql_Delete = "DELETE FROM componentes WHERE numeroSerie = ?";

    public ArrayList<Teclado> seleccionar() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Teclado Teclado = null;
        ArrayList<Teclado> Teclados = new ArrayList();
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
                Teclado = new Teclado(numeroSerie, nombrecomponente, marcafabricante, precio, impuesto, descripcion);
                Teclados.add(Teclado);
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
        return Teclados;
    }    
    
}