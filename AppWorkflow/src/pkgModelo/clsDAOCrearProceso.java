/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YUMI
 */
public class clsDAOCrearProceso extends clsCrearProceso{
    pkgControlador.clsConecta objConecta;

    public clsDAOCrearProceso() {
        objConecta = new pkgControlador.clsConecta();
    }
    public void insertarNuevoProcesoActividad(){         
        String SQL = "INSERT INTO procesos(nombre_procesos, tipo) VALUES ('"+super.getNomProceso()+"','"+super.getTipoTramite()+"')";
        objConecta.insertar(SQL);
        SQL = "INSERT INTO Actividad_por_Proceso(descripcion, area_responsable, tiempo, posicion) VALUES ('"+super.getNomActividad()+"','"+super.getArea()+"','"+super.getTiempo()+"','"+super.getPosicion()+"')";
        objConecta.insertar(SQL);
    }
//    public ResultSet ListarProceso() throws SQLException{
//        String sql = "SELECT descripcion, area_responsable, tiempo, posicion FROM actividad_por_proceso;";
//        res = stm.executeQuery(sql);
//        return res;
//    }
    
    public DefaultTableModel ListarProceso(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        String SQL = "SELECT descripcion, area_responsable, tiempo, posicion FROM actividad_por_proceso;";
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        try{
            while (rs.next()){
                
                modelo.addColumn(rs.getString(1) + "" + rs.getString(2)+ "" + rs.getString(3)+ "" + rs.getString(4));
            }
        }catch (SQLException ex){
            System.out.println("Error en SQL");
        }
        return modelo;
    }
//    public javax.swing.table.DefaultTableModel ListarProceso(){
//        javax.swing.table.DefaultTableModel tem;
//        tem = new javax.swing.table.DefaultTableModel();
//        try{
//            java.sql.ResultSet hoja_resultado = null;
//            String SQL = "SELECT descripcion, area_responsable, tiempo, posicion FROM actividad_por_proceso;";
//            hoja_resultado = objConecta.consulta(SQL);
//            
//            while (hoja_resultado.next()){
////                tem.addElement(hoja_resultado.getString(SQL));
//            }
//        }catch (SQLException ex){
//            System.out.println("Error en SQL");
//        }
//        return tem;
//    }
}
