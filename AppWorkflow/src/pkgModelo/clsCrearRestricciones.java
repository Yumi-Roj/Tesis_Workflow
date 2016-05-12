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
public class clsCrearRestricciones {
    private String codigo_restriccion;
    private String descripcion;

    public clsCrearRestricciones() {
    }

    public clsCrearRestricciones(String codigo_restriccion, String descripcion) {
        this.codigo_restriccion = codigo_restriccion;
        this.descripcion = descripcion;
    }

    public String getCodigo_restriccion() {
        return codigo_restriccion;
    }

    public void setCodigo_restriccion(String codigo_restriccion) {
        this.codigo_restriccion = codigo_restriccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
