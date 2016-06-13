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
public class clsDAOLogin extends clsLogin{
    pkgControlador.clsConecta objConecta;

    public clsDAOLogin() {
        objConecta = new pkgControlador.clsConecta();
    }
    // and tipo_usuario='"+super.getTipo()+"'
    public boolean valide(){
    String SQL = "select * from usuario where cargo='"+super.getUsuario()+"' and clave_usuario='"+super.getContrasena()+"';";
        if (objConecta.validar(SQL) == false){
            return false;
        }
        else{
            return true;
        }
    }
    
}
