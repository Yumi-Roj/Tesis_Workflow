/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YUMI
 */
public class clsDAOCrearProceso extends clsCrearProceso{
    pkgControlador.clsConecta objConecta;
    Connection conexion;
    Statement consulta;
    ResultSet rs = null;
    Statement st = null; 
    Connection conn = null; 
    String sql = null;

    public clsDAOCrearProceso() {
        objConecta = new pkgControlador.clsConecta();
    }
    public void insertarNuevoProcesoActividad(){         
        String SQL = "INSERT INTO procesos(nombre_procesos, tipo) VALUES ('"+super.getNomProceso()+"','"+super.getTipoTramite()+"')";
        objConecta.insertar(SQL);
        SQL = "INSERT INTO Actividad_por_Proceso(descripcion, area_responsable, tiempo, posicion) VALUES ('"+super.getNomActividad()+"','"+super.getArea()+"','"+super.getTiempo()+"','"+super.getPosicion()+"')";
        objConecta.insertar(SQL);
    }
    public DefaultComboBoxModel ListarTipoProceso(){
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        String SQL = "SELECT nombre_area FROM area";
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        try{
            int numeroColumna = rs.getMetaData().getColumnCount();
                for(int j = 1;j <= numeroColumna;j++){
                    modeloCombo.addElement(rs.getMetaData().getColumnName(j));
                }
            while (rs.next()){
                Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna;i++){
                        objetos[i-1] = rs.getObject(i);
                    }
                    modeloCombo.addElement(objetos);
//                modelo.addColumn(rs.getString(1) + "" + rs.getString(2)+ "" + rs.getString(3)+ "" + rs.getString(4));
            }
        }catch (SQLException ex){
            System.out.println("Error en SQL");
        }
        return modeloCombo;
//        objConecta.listaTipo(SQL);
//        modeloCombo.addElement("Seleccione un Estado");
//        java.sql.ResultSet rs = null;
//        rs = objConecta.listaTipo(SQL);
//        return modeloCombo;
    }
    public void llenar_combo() throws SQLException{
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        st = conn.createStatement();
        rs = st.executeQuery ("SELECT nombre_area FROM area");
        while (rs.next()){
        modeloCombo.addElement(rs.getObject("nombre"));
        }
    }
    

    public DefaultTableModel ListarProceso(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        String SQL = "SELECT descripcion, area_responsable, tiempo, posicion FROM actividad_por_proceso";
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        try{
            int numeroColumna = rs.getMetaData().getColumnCount();
                for(int j = 1;j <= numeroColumna;j++){
                    modelo.addColumn(rs.getMetaData().getColumnName(j));
                }
            while (rs.next()){
                Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna;i++){
                        objetos[i-1] = rs.getObject(i);
                    }
                    modelo.addRow(objetos);
//                modelo.addColumn(rs.getString(1) + "" + rs.getString(2)+ "" + rs.getString(3)+ "" + rs.getString(4));
            }
        }catch (SQLException ex){
            System.out.println("Error en SQL");
        }
        return modelo;
    }
    
    public DefaultTableModel ListarRestriciones(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        String SQL = "SELECT codigo_restriccion, descripcion FROM restricciones_por_actividad";
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        try{
            int numeroColumna = rs.getMetaData().getColumnCount();
                for(int j = 1;j <= numeroColumna;j++){
                    modelo.addColumn(rs.getMetaData().getColumnName(j));
                }
            while (rs.next()){
                Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna;i++){
                        objetos[i-1] = rs.getObject(i);
                    }
                    modelo.addRow(objetos);
//                modelo.addColumn(rs.getString(1) + "" + rs.getString(2)+ "" + rs.getString(3)+ "" + rs.getString(4));
            }
        }catch (SQLException ex){
            System.out.println("Error en SQL");
        }
        return modelo;
    }
    
    public ResultSet consultar(String sql){
        ResultSet resultado = null;
        
        try {
            resultado = consulta.executeQuery(sql);

        } catch (SQLException e) {
                System.out.println("Mensaje:"+e.getMessage());
                System.out.println("Estado:"+e.getSQLState());
                System.out.println("Codigo del error:"+e.getErrorCode());
                System.out.println("Codigo del error:"+e.getErrorCode());
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
        return resultado;
    }
    
    public void totalPersonas(DefaultTableModel tableModel){
        ResultSet resultado = null;
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        String sql = "SELECT descripcion, area_responsable, tiempo, posicion FROM actividad_por_proceso";
        try {
            resultado = consultar(sql);
            if(resultado != null){
                int numeroColumna = resultado.getMetaData().getColumnCount();
                for(int j = 1;j <= numeroColumna;j++){
                    tableModel.addColumn(resultado.getMetaData().getColumnName(j));
                }
                while(resultado.next()){
                    Object []objetos = new Object[numeroColumna];
                    for(int i = 1;i <= numeroColumna;i++){
                        objetos[i-1] = resultado.getObject(i);
                    }
                    tableModel.addRow(objetos);
                }
            }
        }catch(SQLException e){
        }

        finally
     {
         try
         {
             consulta.close();
             conexion.close();
             if(resultado != null){
                resultado.close();
             }
         }
         catch (Exception e)
         {
             e.printStackTrace();
         }
     }
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
