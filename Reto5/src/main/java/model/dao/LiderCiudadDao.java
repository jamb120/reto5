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
import model.vo.LiderCiudad;

public class LiderCiudadDao {

    public ArrayList<LiderCiudad> rankingLiderCiudad() throws SQLException {
    
        ArrayList<LiderCiudad> respuesta = new ArrayList<>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT nombre||' '||primer_apellido||' '|| segundo_apellido as 'Nombre Líder' from Lider WHERE ciudad_residencia = 'Dubai' ";
            
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();
        
            while(resultSet.next()){
                LiderCiudad liderCiudad = new LiderCiudad();
                liderCiudad.setLiderCiudad(resultSet.getString("Nombre Líder"));
                respuesta.add(liderCiudad);
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
