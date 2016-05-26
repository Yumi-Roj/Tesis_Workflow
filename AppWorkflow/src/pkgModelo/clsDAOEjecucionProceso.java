/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModelo;

import pkgControlador.clsConecta;

/**
 *
 * @author YUMI
 */
public class clsDAOEjecucionProceso extends clsEjecucionProceso{
    pkgControlador.clsConecta objConecta;

    public clsDAOEjecucionProceso() {
    }

    public clsDAOEjecucionProceso(clsConecta objConecta, String nomProceso, String numExpediente) {
        super(nomProceso, numExpediente);
        this.objConecta = objConecta;
    }
    
    
}
