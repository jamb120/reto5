package view;

import controller.ControladorRequerimientosReto4;
import model.vo.LiderCiudad;
//import model.vo.SumaProveedor;
import model.vo.ProyectoCiudad;
import model.vo.SumaProveedor;

import java.sql.SQLException;
//import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {

    public static ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    public static String[][] requerimiento1() {
        String lista1[][] = new String[21][3];
        try{
        ArrayList<ProyectoCiudad> rankingProyectosCiudad = controlador.consultarProyectoCiudad();
        int i = 0;
        for(ProyectoCiudad a: rankingProyectosCiudad){
            
            lista1[i][0] = a.getConstructora();
            lista1[i][1] = a.getFechaInicio();
            lista1[i][2] = a.getClasificacion();
            i++;
        }
    }catch(SQLException e){
        System.out.println (e);
    }
    return lista1;
    }

    public static String[][] requerimiento3() {
            String lista2[][] = new String [1][1];
            try{
                ArrayList<SumaProveedor> rankingSumaProveedor = controlador.consultarSumaProveedor();
                int i = 0;
                for(SumaProveedor p:rankingSumaProveedor){
                    
                    lista2[i][i] = String.valueOf(p.getSumaProveedor());
                }
            }catch(SQLException e){
                System.out.println (e);
            }
            return lista2;
    }

    public static String[][] requerimiento4() {
        String lista3[][] = new String [6][1];
        try{
            
            ArrayList<LiderCiudad> rankingLiderCiudad = controlador.consultarLiderCiudad();
            int i = 0;
            for(LiderCiudad p:rankingLiderCiudad){
                
                lista3[i++][0] = p.getLiderCiudad();
            }
        }catch(SQLException e){
            System.out.println (e);
        }
        return lista3;
    }

}
