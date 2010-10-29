/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Clases;

/**
 *
 * @author sands
 */
public class Clientes {

    private int idClientes;
    private String nombre;
    private String direccion;
    private int fax;
    private int saldo;

    public Clientes(int idClientes, String nombre, String direccion, int fax, int saldo) {
        this.idClientes = idClientes;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fax = fax;
        this.saldo = saldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Clientes{" + "idClientes=" + idClientes + "nombre=" + nombre + "direccion=" + direccion + "fax=" + fax + "saldo=" + saldo + '}';
    }
}
