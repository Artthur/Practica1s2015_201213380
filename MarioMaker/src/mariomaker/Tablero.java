/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Raul
 */
public class Tablero extends JFrame implements ActionListener{
    public JButton boton1,boton2,boton3,boton4,siguiente,anterior,muestra,elifila,elicolu;
    public JLabel imagen1;
    
    public Tablero(){
        super("Mario Maker Guatemalteco 1.0 Creacion");
        this.setBounds(60,0,1310,770);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
        setLayout(null);
        
        boton2= new JButton("Eliminar");
        boton2.setBounds(140,10,90,20);
        boton2.setForeground(Color.red);
        boton2.setBackground(Color.black.brighter());
        boton2.addActionListener(this); 
        boton2.setVisible(true);
        this.add(boton2);
        boton3= new JButton("Graficar");
        boton3.setBounds(10,10,90,20);
        boton3.setBackground(Color.black.brighter());
        boton3.setForeground(Color.red);
        boton3.setVisible(true);
        boton3.addActionListener(this); 
        this.add(boton3);
        
        boton1= new JButton("Datos");
        boton1.setBounds(270,10,90,20);
        boton1.setForeground(Color.red);
        boton1.setBackground(Color.black.brighter());
        boton1.setVisible(true);
        boton1.addActionListener(this); 
        this.add(boton1);
        
        boton4= new JButton("Listado:");
        boton4.setBounds(1080,10,100,20);
        boton4.setForeground(Color.white);
        boton4.setBackground(Color.black.brighter());
        boton4.setVisible(true);
        this.add(boton4);
        
        
        siguiente = new JButton(">");
        siguiente.setBounds(1130,30,50,20);
        siguiente.setForeground(Color.red);
        siguiente.setBackground(Color.black.brighter());
        siguiente.setVisible(true);
        siguiente.addActionListener(this); 
        this.add(siguiente);
        
        anterior= new JButton("<");
        anterior.setBounds(1080,30,50,20);
        anterior.setForeground(Color.red);
        anterior.setBackground(Color.black.brighter());
        anterior.setVisible(true);
        anterior.addActionListener(this); 
        this.add(anterior);
        
        imagen1 = new JLabel();
        imagen1.setBounds(1190,10,85,75);
        
        muestra= new JButton("Matriz");
        muestra.setBounds(10,60,1175,660);
        muestra.setForeground(Color.black);
        muestra.setBackground(Color.green.brighter());
        muestra.setVisible(true);
        muestra.addActionListener(this); 
        this.add(muestra);
        
        
        
        repaint();
    }
    
    public void poner(){
        this.setVisible(true);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
