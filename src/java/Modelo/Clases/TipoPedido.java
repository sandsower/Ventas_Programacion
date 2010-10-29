/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Clases;

/**
 *
 * @author sands
 */
public class TipoPedido {

    public TipoPedido(int idTipo, String descripcion) {
        this.idTipo = idTipo;
        this.descripcion = descripcion;
    }
    private int idTipo;
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    @Override
    public String toString() {
        return "TipoPedido{" + "idTipo=" + idTipo + "descripcion=" + descripcion + '}';
    }
}
