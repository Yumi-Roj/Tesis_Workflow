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
public class clsDAOCrearRestricciones extends clsCrearRestricciones{
    pkgControlador.clsConecta objConecta;

    public clsDAOCrearRestricciones() {
        objConecta = new pkgControlador.clsConecta();
    }
    
    public void restriccionesActividad(){         
        String SQL = "INSERT INTO restricciones_por_actividad(codigo_restriccion, descripcion) VALUES ('"+super.getCodigo_restriccion()+"','"+super.getDescripcion()+"')";
        objConecta.insertar(SQL);
    }
    
}
