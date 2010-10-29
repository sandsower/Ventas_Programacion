/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Clases;

/**
 *
 * @author sands
 */
public class Pedidos {

    public Pedidos(int idPedido, int idArticulo, int cantidad, int idVendedor, int tipoPedido, int idCliente) {
        this.idPedido = idPedido;
        this.idArticulo = idArticulo;
        this.cantidad = cantidad;
        this.idVendedor = idVendedor;
        this.tipoPedido = tipoPedido;
        this.idCliente = idCliente;
    }
    private int idPedido;
    private int idArticulo;
    private int cantidad;
    private int idVendedor;
    private int tipoPedido;
    private int idCliente;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(int tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "idPedido=" + idPedido + "idArticulo=" + idArticulo + "cantidad=" + cantidad + "idVendedor=" + idVendedor + "tipoPedido=" + tipoPedido + "idCliente=" + idCliente + '}';
    }
}
