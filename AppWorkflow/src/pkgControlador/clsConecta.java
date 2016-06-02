/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgControlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YUMI
 */
public class clsConecta {

    public static Connection con;
    public static ResultSet res;
    public static Statement stm;
    private static String driver;
    private static String user;
    private static String pwd;
    private static String dbstr;

    public clsConecta() {
         try{
            try{
                Class.forName("org.postgresql.Driver");
                System.out.println("Driver COrrecto");
            }
            catch(ClassNotFoundException ex){
                System.out.println("Error al cargar el Driver COrrecto");
            }
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbWorkflow","postgres","postgres");
        }
        catch(SQLException ex){
            System.out.println("No se puede conectar");
        }
    }
    public static Connection getConnection(){
    try{
        Class.forName("org.postgresql.Driver");
        con =  DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbWorkflow","postgres","postgres");

    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
    }
        return con;
    }
    
    public boolean validar(String sql){
        java.sql.ResultSet hoja_resultado=null;
        try{
            stm = con.createStatement();
            hoja_resultado = stm.executeQuery(sql);
            if (hoja_resultado.next()){
                return true;
            }
            else{
                return false;
            }       
        }
        catch(SQLException ex){
           System.out.println("Error consultando: " + ex.toString());
           return false;
        }
    }
    
    public boolean ejecutarSql(String sql) {
        try {
            stm.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            System.out.println("Error en la consulta SQL: " +ex.getMessage());
            return false;
        }
    }
    
    public ResultSet getSql(String Sql) {
        try {
            res = stm.executeQuery(Sql);
        } catch (SQLException ex) {
            System.out.println("Error en la consulta SQL: " +ex.getMessage());
        }
        return res;
    }
    
    public void cerrar() {
        try {
            stm.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public void insertar(String sql){
        try{
            stm = con.createStatement();
            stm.executeQuery(sql);
        }
        catch(SQLException ex){
            System.out.println("Error insertando: " + ex.toString());
        }
    }
    
    public java.sql.ResultSet consulta(String sql){
        try{
            stm = con.createStatement();
            return stm.executeQuery(sql);
        }
        catch(SQLException ex){
            System.out.println("Error insertando: " + ex.toString());
            return null;
        }
    }
    public ResultSet consultas(String sql) throws SQLException {
        try {
            res = stm.executeQuery(sql);//para sentencias select nada mas

        } catch (SQLException ex) {
            throw ex;
        }
        return res;
    }
    //funcion para ejecutar sentencias INSERT DELETE UPDATE

    public void ejecutar(String sql) throws SQLException {
        try {
            stm.execute(sql);
        } catch (SQLException ex) {
            throw ex;
        }
    }
     public DefaultTableModel retornarDatosTabla(String SentenciaSQL) {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            ResultSet rsDatos = consulta(SentenciaSQL);
            //optendremos lo metodos se la consulta 
            // del cual optenemos 
            ResultSetMetaData metaDatos = rsDatos.getMetaData();
            //optemos el nro de columnas
            int numeroColumnas = metaDatos.getColumnCount();//columnas
            //optener las etiquetas  de la tabla 
            Object[] etiquetas = new Object[numeroColumnas];//creamos de array de objetos dinamico
            for (int i = 0; i < numeroColumnas; i++) {
                etiquetas[i] = metaDatos.getColumnLabel(i + 1);//las etiquetas comienzan desde 1e
            }
            //enlazar las etiquetas con el modelo 
            modelo.setColumnIdentifiers(etiquetas);//asignamos edentiofocadores de columnas 
            while (rsDatos.next()) {
                //creamos un objeto para almacenar un registro
                Object[] datosFila = new Object[modelo.getColumnCount()];
                //rellenar cada posicion del objeto con una de las columans de la tabla 
                for (int i = 0; i < modelo.getColumnCount(); i++) {
                    datosFila[i] = rsDatos.getObject(i + 1);
                }
                modelo.addRow(datosFila);
            }
        } catch (Exception e) {
        }
        return modelo;
    }
     
    public String eliminar(String sql){
        try{
            stm = con.createStatement();
            int resultado = stm.executeUpdate(sql);
            if (resultado == 1)
                return "elimino";
            else
                return "error";
        }
        catch(SQLException ex){
            System.out.println("Error insertando: " + ex.toString());
            return "error";
        }
    }
    
    public String modificar(String sql){
        try{
            stm = con.createStatement();
            int resultado = stm.executeUpdate(sql);
            if (resultado == 1)
                return "modifico";
            else
                return "error";
        }
        catch(SQLException ex){
            System.out.println("Error modificando: " + ex.toString());
            return "error";
        }
    }
    
    public ResultSet Lista(String cadena) throws SQLException{       
       String sql=cadena; 
       res=stm.executeQuery(sql);
       return res;
   }
    public java.sql.ResultSet listaTipo(String sql){
        try{
            stm = con.createStatement();
            return stm.executeQuery(sql);
        }
        catch(SQLException ex){
            System.out.println("Error insertando: " + ex.toString());
            return null;
        }
    }
    
    public int Cant(String cadena){
    try{
        Statement instruccion = con.createStatement(ResultSet.CONCUR_READ_ONLY,ResultSet.CONCUR_UPDATABLE);        
        res = instruccion.executeQuery(cadena);
        res.absolute(1);       
        return res.getInt(1);    
       }
    catch(Exception X)
    { return 0;  }   
    
    } 
//    public ResultSet ListarProceso() throws SQLException{
//        String sql = "SELECT descripcion, area_responsable, tiempo, posicion FROM actividad_por_proceso;";
//        res = stm.executeQuery(sql);
//        return res;
//    }
    
}
