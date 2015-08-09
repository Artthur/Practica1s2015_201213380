/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author Raul
 */
public class TableroP extends JPanel{
    
    public int posicion_x=10;
    public int posicion_y=60;
public TableroP()  {
    this.setVisible(true);
    this.setBounds(10,60,1170,660);
   this.repaint();
}  
     public void paint(Graphics g){
       update(g);
    }
    
    public void update(Graphics g){
        
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
       
    }
}
