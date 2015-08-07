/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import java.awt.image.BufferedImage;

/**
 *
 * @author Raul
 */
public class NodoE {
    public NodoE anterior;
    public NodoE siguiente;
    public BufferedImage imagen;
    public String nombre;
    public int id;
    
    
    public NodoE(){
        
    }
     public NodoE(NodoE anterior, BufferedImage imagen, String nombre,int id, NodoE siguiente){
         this.anterior = anterior;
         this.siguiente = siguiente;
         this.imagen = imagen;
         this.nombre = nombre;
         this.id= id;
         
         
     }
     
     public NodoE getAnterior(){
         return anterior;
     }
    
     public void setAnterior(NodoE anterior){
         this.anterior = anterior;
     }
     
     public BufferedImage getImagne(){
         return imagen;
     }
     
     public void setDireccion(BufferedImage imagen){
         this.imagen= imagen;
     }
     
     public String getNombre(){
         return nombre;
     }
     
     public void setNombre(String nombre){
         this.nombre=nombre;
     }
     
     public int getId(){
         return id;
     }
     
     public void setId(int id){
         this.id=id;
     }
     
     public NodoE getSiguiente(){
         return siguiente;
     }
     
     public void setSiguiente(NodoE siguiente){
         this.siguiente=siguiente;
         
     }
     
     public boolean tieneSiguiente(){
         return siguiente != null;
     }
     
     public boolean tieneAnterior(){
         return anterior !=null;
     }
}
 