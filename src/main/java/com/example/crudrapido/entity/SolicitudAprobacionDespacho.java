package com.example.crudrapido.entity;

public class SolicitudAprobacionDespacho {
    private String codigoSeguimiento;
    private String direccion;
    private String producto;
    private int cantidad;

    public SolicitudAprobacionDespacho(String codigoSeguimiento, String direccion, String producto, int cantidad) {
        this.codigoSeguimiento = codigoSeguimiento;
        this.direccion = direccion;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getCodigoSeguimiento() {
        return codigoSeguimiento;
    }

    public void setCodigoSeguimiento(String codigoSeguimiento) {
        this.codigoSeguimiento = codigoSeguimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}