/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import java.applet.AudioClip;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Raul
 */
public class Creacion extends JFrame{
        
public Creacion (){
        super("Mario Maker Guatemalteco 1.0");
        this.setVisible(true);
        this.setBounds(500,150,642,519);
        CreacionP uno = new CreacionP();
        
      
        
        
        this.add(uno,BorderLayout.CENTER);
        
        setLayout(null);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        
        /*AudioClip sonido;
         sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Imagenes/Tema_da_abertura_de_The_Walking_Dead_em_Rock.wav"));
         sonido.play();
         */
    }}
