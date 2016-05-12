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
    public void insertarNuevoProcesoActividad(){         
        String SQL = "INSERT INTO procesos(nombre_procesos, tipo) VALUES ('"+super.getNomProceso()+"','"+super.getTipoTramite()+"')";
        objConecta.insertar(SQL);
        SQL = "INSERT INTO Actividad_por_Proceso(descripcion, area_responsable, tiempo, pocision) VALUES ('"+super.getNomActividad()+"','"+super.getArea()+"','"+super.getTiempo()+"','"+super.getPosicion()+"')";
        objConecta.insertar(SQL);
//        SELECT weather.city, weather.temp_lo, weather.temp_hi, weather.prcp,
//              weather.date, cities.location
//       FROM weather, cities WHERE cities.name = weather.city;
    }
    
}
