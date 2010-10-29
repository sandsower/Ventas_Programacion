/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Clases;

/**
 *
 * @author sands
 */
public class Vendedores {

    public Vendedores(int idVendedor, String nombre, String apellido, String email, int telefono) {
        this.idVendedor = idVendedor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    private int idVendedor;
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Vendedores{" + "idVendedor=" + idVendedor + "nombre=" + nombre + "apellido=" + apellido + "email=" + email + "telefono=" + telefono + '}';
    }
}
