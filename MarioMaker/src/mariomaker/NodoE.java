/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

/**
 *
 * @author Raul
 */
public class NodoE {
    public NodoE anterior;
    public NodoE siguiente;
    public String direccion;
    public String nombre;
    
    
    public NodoE(){
        
    }
     public NodoE(NodoE anterior, String direccion, String nombre, NodoE siguiente){
         this.anterior = anterior;
         this.siguiente = siguiente;
         this.direccion = direccion;
         this.nombre = nombre;
         
     }
     
     public NodoE getAnterior(){
         return anterior;
     }
    
     public void setAnterior(NodoE anterior){
         this.anterior = anterior;
     }
     
     public String getDireccion(){
         return direccion;
     }
     
     public void setDireccion(String direccion){
         this.direccion= direccion;
     }
     
     public String getNombre(){
         return nombre;
     }
     
     public void setNombre(String nombre){
         this.nombre=nombre;
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
 