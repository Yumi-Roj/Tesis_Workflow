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
public class clsCrearProceso {
    private String tipoTramite;
    private String responsable;
    private String nomProceso;
    private String nomActividad;
    private String area;
    private String posicion;
    private String tiempo;
    
    public clsCrearProceso() {
    }

    public clsCrearProceso(String tipoTramite, String responsable, String nomProceso, String nomActividad, String area, String posicion, String tiempo) {
        this.tipoTramite = tipoTramite;
        this.responsable = responsable;
        this.nomProceso = nomProceso;
        this.nomActividad = nomActividad;
        this.area = area;
        this.posicion = posicion;
        this.tiempo = tiempo;
    }

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getNomProceso() {
        return nomProceso;
    }

    public void setNomProceso(String nomProceso) {
        this.nomProceso = nomProceso;
    }

    public String getNomActividad() {
        return nomActividad;
    }

    public void setNomActividad(String nomActividad) {
        this.nomActividad = nomActividad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }  
}
