/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import java.awt.image.BufferedImage;
import javax.swing.JLabel;

/**
 *
 * @author Raul
 */
public class NodoM extends JLabel {
    public NodoM izquierda;
    public NodoM derecha;
    public NodoM arriba;
    public NodoM abajo;
    public BufferedImage imagen;
    public String nombre;
    public int id,id2,x,y;
   public NodoM(){
       
   } 
   
   public  NodoM(int x,int y){
        
         this.x= x;
         this.y=y;
         
         
         this.setVisible(false);
   }
   
   public NodoM getIzquierda(){
         return izquierda;
     }
    
     public void setIzquierda(NodoM izquierda){
         this.izquierda = izquierda;
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
     
    @Override
     public int getX(){
         return x;
     }
     
     public void setX(int x){
         this.x=x;
     }
     
    @Override
     public int getY(){
         return y;
     }
     
     public void setY(int y){
         this.y=y;
     }
     public int getId2(){
         return id2;
     }
     
     public void setId2(int id2){
         this.id2=id2;
     }
     public NodoM getDerecha(){
         return derecha;
     }
     
     public void setDerecha(NodoM derecha){
         this.derecha=derecha;
         
     }
     
      public NodoM getArriba(){
         return arriba;
     }
     
     public void setArriba(NodoM arriba){
         this.arriba=arriba;
         
     }
     
      public NodoM getAbajo(){
         return abajo;
     }
     
     public void setAbajo(NodoM abajo){
         this.abajo=abajo;
         
     }
     
     public boolean tieneDerecha(){
         return derecha != null;
     }
     
     public boolean tieneIzquierda(){
         return izquierda !=null;
     }
     
     public boolean tieneArriba(){
         return arriba !=null;
     }
     public boolean tieneAbajo(){
         return abajo !=null;
     }
     
     
}  
