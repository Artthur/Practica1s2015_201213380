/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Raul
 */
public class Juego extends JFrame implements ActionListener,KeyListener{
    public JButton boton1,boton2,boton3,boton4,boton5,muestra;
    public JLabel nom1,nom2,num1,num2;
 public Juego(){
        super("Mario Maker Guatemalteco 1.0 Juego");
        this.setBounds(60,0,1310,770);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
        setLayout(null);
     
        boton2= new JButton("Iniciar");
        boton2.setBounds(100,10,90,40);
        boton2.setForeground(Color.red);
        boton2.setBackground(Color.black.brighter());
        boton2.addActionListener(this); 
        boton2.setVisible(true);
        this.add(boton2);
        boton3= new JButton("Pausa");
        boton3.setBounds(10,10,90,40);
        boton3.setBackground(Color.black.brighter());
        boton3.setForeground(Color.red);
        boton3.setVisible(true);
        boton3.addActionListener(this); 
        this.add(boton3);
        
        boton1= new JButton("Graficar");
        boton1.setBounds(190,10,80,40);
        boton1.setForeground(Color.red);
        boton1.setBackground(Color.black.brighter());
        boton1.setVisible(true);
        boton1.addActionListener(this); 
        this.add(boton1);
        
        boton4= new JButton("Datos:");
        boton4.setBounds(1085,10,70,40);
        boton4.setForeground(Color.white);
        boton4.setBackground(Color.black.brighter());
        boton4.setVisible(true);
        this.add(boton4);
        
        boton5= new JButton("Reiniciar");
        boton5.setBounds(270,10,100,40);
        boton5.setForeground(Color.red);
        boton5.setBackground(Color.black.brighter());
        boton5.addActionListener(this);
        boton5.setVisible(true);
        this.add(boton5);
        
        muestra= new JButton("Matriz");
        muestra.setBounds(10,60,1170,660);
        muestra.setForeground(Color.black);
        muestra.setBackground(Color.white.brighter());
        muestra.setVisible(true);
        muestra.addActionListener(this); 
        this.add(muestra);
        
        nom1= new JLabel("Puntaje");
        nom1.setBounds(1180,10,80,20);
        nom1.setBackground(Color.black.brighter());
        nom1.setForeground(Color.black);
        nom1.setVisible(true);
        this.add(nom1);
        nom2= new JLabel("Vida");
        nom2.setBounds(1180,30,80,20);
        nom2.setBackground(Color.black.brighter());
        nom2.setForeground(Color.black);
        nom2.setVisible(true);
        this.add(nom2);
        
        num1= new JLabel("0");
        num1.setBounds(1260,10,10,20);
        num1.setBackground(Color.black.brighter());
        num1.setForeground(Color.black);
        num1.setVisible(true);
        this.add(num1);
        num2= new JLabel("1");
        num2.setBounds(1260,30,10,20);
        num2.setBackground(Color.black.brighter());
        num2.setForeground(Color.black);
        num2.setVisible(true);
        this.add(num2);
        
      ImageIcon imagens = new ImageIcon (getClass().getResource("/Imagenes/Columna.jpg"));   
      JLabel fondo1 = new JLabel(imagens);
      fondo1.setBounds(new Rectangle(1180,60,115,700));
      this.add(fondo1);
      //Fila
      ImageIcon imagen2s = new ImageIcon (getClass().getResource("/Imagenes/Fila.jpg"));   
      JLabel fondo2 = new JLabel(imagen2s);
      fondo2.setBounds(new Rectangle(375,0,705,60));
      this.add(fondo2);
        
        
 }
 
 public void poner(){
        this.setVisible(true);
        setLayout(null);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        
     
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
 
}
