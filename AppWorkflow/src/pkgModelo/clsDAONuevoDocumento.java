/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModelo;

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
    
    
}
