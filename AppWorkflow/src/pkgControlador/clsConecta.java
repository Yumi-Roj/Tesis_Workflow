/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgControlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author YUMI
 */
public class clsConecta {

    public Connection con;
    public ResultSet res;
    public Statement stm;

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
    
}
