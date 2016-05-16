/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModelo;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author YUMI
 */
public class clsDAONuevoDocumento extends clsNuevoDocumento{
    pkgControlador.clsConecta objConecta;

    public clsDAONuevoDocumento() {
        objConecta = new pkgControlador.clsConecta();
    }
    public void insertarNuevoDocumento(){         
        String SQL = "INSERT INTO documento(numero_expediente, asunto, fecha, destino, remitente) VALUES ('"+super.getNumExpediente()+"','"+super.getAsunto()+"','"+super.getFecha()+"','"+super.getDestino()+"','"+super.getRemitente()+"')";
        objConecta.insertar(SQL);
    }
    public String consultarNuevoDocumento(){         
        String SQL = "SELECT * FROM documento WHERE numero_expediente='"+super.getNumExpediente()+"';";
        java.sql.ResultSet rs = null;
        rs = objConecta.consulta(SQL);
        
        try{
            if(rs.next()){
                return rs.getString(2);
            }else{
                return "No esta";
            }
        }catch (SQLException ex){
            Logger.getLogger(clsDAONuevoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public String eliminarNuevoDocumento(){         
        String SQL = "DELETE FROM documento WHERE numero_expediente='"+super.getNumExpediente()+"';";
        String resultado = "";
        resultado = objConecta.eliminar(SQL);
        return resultado;
    }
    public String modificarNuevoDocumento(){         
        String SQL = "UPDATE documento SET numero_expediente = '"+super.getNumExpediente()+"' WHERE numero_expediente='"+super.getNumExpediente()+"';";
        String resultado = "";
        resultado = objConecta.modificar(SQL);
        return resultado;
    }
}
