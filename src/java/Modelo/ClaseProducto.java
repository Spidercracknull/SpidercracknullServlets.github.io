/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class ClaseProducto {
    
    private String nombre;
    public double precio;
    public int existencia;
    public String nombreCliente;
    public String e;
    
    ArrayList<ClaseProducto> arrayproductos=new ArrayList();
    Iterator<ClaseProducto> objiterador=arrayproductos.iterator();
    
    ArrayList<ClaseProducto> obj = new ArrayList();

    public ClaseProducto() {}
   
    public ClaseProducto(String nombre, int existencia, String nombreCliente, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.existencia=existencia;
        this.nombreCliente=nombreCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }
    
    

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    
    public void RegistrarProducto(String nombre, double precio, int existencia, String nombreCliente){
        ClaseProducto ObjetoProducto = new ClaseProducto(nombre,existencia,nombreCliente, precio);
    arrayproductos.add(ObjetoProducto);
    }


    public String comprar(String nombre, int existenciaNegativa, String nombreCliente,double precio ){
        ClaseProducto ObjetoProducto = new ClaseProducto(nombre,existenciaNegativa,nombreCliente, precio);
        
        while(objiterador.hasNext())
        {
            ObjetoProducto=objiterador.next();
            if(nombre.equals(ObjetoProducto.getNombre()))
            {
                if (nombreCliente.equals(ObjetoProducto.getNombreCliente()))
                {
                    ObjetoProducto.setExistencia(ObjetoProducto.getExistencia()-existenciaNegativa);
                    if (ObjetoProducto.getExistencia()<0)
                    {
                        e="Existencia agotada";                    
                    }
                    if (ObjetoProducto.getExistencia()==0)
                    {
                        arrayproductos.remove(ObjetoProducto);
                        e="Compra realizada";
                    }
                    else
                    {
                        e="Compra realizada";
                    }
                }
                else
                {
                    e="Error";
                }
            }
            else 
            {
                e="Error";
            }
        }
        
        return e;
    }
    

    
}
