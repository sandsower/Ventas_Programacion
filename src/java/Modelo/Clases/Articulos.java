/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Clases;

/**
 *
 * @author sands
 */
public class Articulos {

    public Articulos(int idArticulo, String descripcion, int precio, int existencia, int categoria) {
        this.idArticulo = idArticulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencia = existencia;
        this.categoria = categoria;
    }
    private int idArticulo;
    private String descripcion;
    private int precio;
    private int existencia;
    private int categoria;

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulos{" + "idArticulo=" + idArticulo + "descripcion=" + descripcion + "precio=" + precio + "existencia=" + existencia + "categoria=" + categoria + '}';
    }
}
