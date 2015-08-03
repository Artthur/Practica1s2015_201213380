/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Raul
 */
public class Listado extends JFrame {
    ListaE datos2 = new ListaE();
    ListadoP cuatro = new ListadoP();
    
    public Listado(){
        super("Mario Maker Guatemalteco 1.1");
        this.setVisible(false);
        this.setBounds(500,20,660,700);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void poner(){
        this.add(cuatro,BorderLayout.CENTER);
        this.setVisible(true);
        //this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        setLayout(null);
    }
    public boolean Recibe(ListaE dos){
        datos2 = dos;
        System.out.println(datos2.tamaño);
        return true;
    }
}
