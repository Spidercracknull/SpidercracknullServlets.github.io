/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.ClaseCliente;
import Modelo.ClaseProducto;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author cajaf
 */
public class ClaseCompra {
    
    private String nombre;
    public double precio;
    public int existencia;
    public String nombreCliente;
    public String e;
    
    
    ArrayList<ClaseProducto> obj = new ArrayList();

    public ClaseCompra() {}
   
    public ClaseCompra(String nombre, int existencia, String nombreCliente, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.existencia=existencia;
        this.nombreCliente=nombreCliente;
    }
    
    private ArrayList<ClaseProducto> arrayproductos=new ArrayList();
    private Iterator<ClaseProducto> i=arrayproductos.iterator();
    ClaseProducto ObjetoProducto = new ClaseProducto();
    
        
    public void RegistrarProducto(String nombre, double precio, int existencia, String nombreCliente){
        ClaseProducto ObjetoProducto = new ClaseProducto(nombre,existencia,nombreCliente, precio);
        arrayproductos.add(ObjetoProducto);
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
    



    public String comprar(String nombre, int unidades,String cliente,double precio){
        
        
        int swit=0;
        while(i.hasNext())
        {
            ObjetoProducto=i.next();
            if(nombre.equals(ObjetoProducto.getNombre()))
            {
                if (cliente.equals(ObjetoProducto.getNombreCliente()))
                {
                    ObjetoProducto.setExistencia(ObjetoProducto.getExistencia()-unidades);
                    if (ObjetoProducto.getExistencia()<0)
                    {
                        swit=1;                    
                    }
                    if (ObjetoProducto.getExistencia()==0)
                    {
                        arrayproductos.remove(ObjetoProducto);
                        swit=2;
                    }
                }
            }
            else 
            {
                e="Error";
            }
            switch(swit)
            {
                case 1:
                    e="Existencia agotada";
                break;
                case 2:
                    e="Compra realizada";
                break;
            
            }
            
        }
        
        return e;
    }
    

    


    
}
