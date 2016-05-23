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
public class clsUsuario {
    private String cargo;
    private String usuario;
    private String contrasena;
    private String nombApellido;

    public clsUsuario() {
    }

    public clsUsuario(String usuario, String contrasena, String nombApellido,String cargo) {
        this.cargo = cargo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombApellido = nombApellido;
    } 

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombApellido() {
        return nombApellido;
    }

    public void setNombApellido(String nombApellido) {
        this.nombApellido = nombApellido;
    }
   
}
