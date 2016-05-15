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
public class clsNuevoDocumento {
    private String numExpediente;
    private String fecha;
    private String asunto;
    private String remitente;
    private String cargo;
    private String destino;

    public clsNuevoDocumento() {
    }

    public clsNuevoDocumento(String numExpediente, String asunto, String fecha, String destino, String remitente) {
        this.numExpediente = numExpediente;
        System.out.println(fecha);
        this.fecha = fecha;
        this.asunto = asunto;
        this.remitente = remitente;
        //this.cargo = cargo;
        this.destino = destino;
    }
    
    public String getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(String numExpediente) {
        this.numExpediente = numExpediente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
}
