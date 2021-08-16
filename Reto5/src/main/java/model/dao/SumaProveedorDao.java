package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.SumaProveedor;

public class SumaProveedorDao {

    public ArrayList<SumaProveedor> rankingSumaProveedor() throws SQLException {

        ArrayList<SumaProveedor> respuesta = new ArrayList<>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "select SUM(cantidad)'Cantidad' from Compra WHERE proveedor = 'JUMBO' ";
            
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
        
            while(resultSet.next()){
                SumaProveedor sumaProveedor = new SumaProveedor();
                sumaProveedor.setSumaProveedor(resultSet.getInt("Cantidad"));
                respuesta.add(sumaProveedor);
            }

            resultSet.close();
            statement.close();

        }catch(SQLException e){
            System.err.println("Error consultando Proyecto Ciudad!!" + e);
            
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }
        
            return respuesta;
    }

    }

