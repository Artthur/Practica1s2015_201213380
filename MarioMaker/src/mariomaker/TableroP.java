/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Raul
 */
public class TableroP extends JPanel{
    
    public int posicion_x=10;
    public int posicion_y=60;
    int X = 0, Y = 0;//24,12
    int corrimiento = 0;
     Matriz Tablero;
    NodoM Puntero;
public TableroP()  {
    this.setVisible(true);
    this.setBounds(10,60,1170,660);
    Tablero = new Matriz();
    this.repaint();
}  


private void MoverDer() {
        NodoM Aux1 = Tablero.raiz;
        while (Aux1 != null) {
            NodoM Aux2 = Aux1;
            while (Aux2 != null) {
                Rectangle info = Aux2.getBounds();
                Aux2.setBounds(info.x - 30, info.y, 30, 30);
                Aux2 = Aux2.derecha;
            }
            Aux1 = Aux1.abajo;
        }
    }

    private void MoverIzq() {
        NodoM Aux1 = Tablero.raiz;
        while (Aux1 != null) {
            NodoM Aux2 = Aux1;
            while (Aux2 != null) {
                Rectangle info = Aux2.getBounds();
                Aux2.setBounds(info.x + 30, info.y, 30, 30);
                Aux2 = Aux2.derecha;
            }
            Aux1 = Aux1.abajo;
        }
    }
    private void ActualizarPos(){
        NodoM Aux1 = Tablero.raiz;
        int y = 0;
        while(Aux1!=null){
            NodoM Aux2=Aux1;
            int x =0;
            while(Aux2!=null){
                Aux2.x = x;
                Aux2.x = y;
                Aux2.setBounds(x*30, y*30, 30, 30);
                //System.out.println("x:" + (x*30) + " y:" + (y*30));
                x++;
                Aux2 = Aux2.derecha;
            }
            y++;
            Aux1 = Aux1.abajo;
        }
    }



     public void paint(Graphics g){
       
    }
    
    /*public void update(Graphics g){
        
        Graphics2D g2 = (Graphics2D)g;
        Dimension d = this.getSize();
        Image imagen = createImage(d.height,d.width);
        Graphics2D fondo = (Graphics2D)imagen.getGraphics();
        Dibujar(g);
        
        g2.drawImage(imagen, 0, 0, this);
    }
    
    public void Dibujar(Graphics g){
        //10,60,1170,660
        Graphics2D G2 = (Graphics2D)g;
        int posicion_x =0;
        int posicion_y =0;
        for(int i = 0;i<2;i++){
            
            for(int y=0;i<4;i++){
                G2.drawRect(posicion_x, posicion_y, 80, 75);
                posicion_x+=80;
                
            }
            posicion_y+=75;
            posicion_x=0;
        }
       
    }*/
}
