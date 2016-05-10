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
public class clsDAOCrearProceso extends clsCrearProceso{
    pkgControlador.clsConecta objConecta;

    public clsDAOCrearProceso() {
        objConecta = new pkgControlador.clsConecta();
    }
    public void insertarNuevoProceso(){         
        String SQL = "INSERT INTO procesos(nombre_procesos, responsable) VALUE ('"+super.getNomProceso()+"','"+super.getResponsable()+"')";
        objConecta.insertar(SQL);
    }
    public void insertarNuevaActividad(){         
        String SQL = "INSERT INTO actividad(descripcion, area_responsable, tiempo, posicion) VALUE ('"+super.getNomActividad()+"','"+super.getArea()+"','"+super.getTiempo()+"','"+super.getPosicion()+"')";
        objConecta.insertar(SQL);
    }
    
}
