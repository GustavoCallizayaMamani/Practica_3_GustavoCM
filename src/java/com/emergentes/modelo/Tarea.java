
package com.emergentes.modelo;


public class Tarea {
private int id;
private String producto;
private String precio;
private String cantidad;

public Tarea (){
  id=0;
  producto="";
  precio="";
  cantidad="";
}
public Tarea(int id,String  producto,String precio, String cantidad){
  this.id=id;
  this.producto=producto;
  this.precio=precio;
  this.cantidad=cantidad;
  
}
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }


    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

}
