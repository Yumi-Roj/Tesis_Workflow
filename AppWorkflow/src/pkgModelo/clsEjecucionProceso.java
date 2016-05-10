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
public class clsEjecucionProceso {
    private String nomProceso;
    private String numExpediente;

    public clsEjecucionProceso() {
    }

    public clsEjecucionProceso(String nomProceso, String numExpediente) {
        this.nomProceso = nomProceso;
        this.numExpediente = numExpediente;
    }
    
    public String getNomProceso() {
        return nomProceso;
    }

    public void setNomProceso(String nomProceso) {
        this.nomProceso = nomProceso;
    }

    public String getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(String numExpediente) {
        this.numExpediente = numExpediente;
    } 
}
