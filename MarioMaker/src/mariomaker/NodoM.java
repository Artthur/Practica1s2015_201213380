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
    public NodoM anterior;
    public NodoM siguiente;
    public NodoM arriba;
    public NodoM abajo;
    public BufferedImage imagen;
    public String nombre;
    public int id,id2;
   public NodoM(){
       
   } 
   
   public  NodoM(NodoM anterior,NodoM arriba,String nombre,BufferedImage imagen,int id,int id2,NodoM abajo,NodoM siguiente){
       
   }
}
