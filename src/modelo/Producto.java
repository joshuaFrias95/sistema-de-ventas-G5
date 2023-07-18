package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class Producto {

    public Producto(String nombre, String categoria, int cantidad, String descripcion) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }
    
    private String nombre;
    private String categoria;
    private int cantidad;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + 
                "\tcategoria=" + categoria + 
                "\tcantidad=" + cantidad + 
                "\tdescripcion=" + descripcion;
    }
    
    
    
}
