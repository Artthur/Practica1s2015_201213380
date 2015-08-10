/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Raul
 */
public class Graficas extends JFrame implements ActionListener{
     public JButton boton1,boton2,boton3;
     public String ruta="";
     
    public Graficas(){
    super("Eliminacion");
        
        this.setBounds(600,200,500,500);
        this.setVisible(false);
        
        boton2= new JButton("Matriz");
        boton2.setBounds(10,10,80,20);
        boton2.setForeground(Color.white);
        boton2.setBackground(Color.black.brighter());
        boton2.setVisible(true);
        this.add(boton2);
        
        boton1= new JButton("Lista-Doble");
        boton1.setBounds(10,30,80,20);
        boton1.setBackground(Color.black.brighter());
        boton1.setForeground(Color.white);
        boton1.setVisible(true);
        this.add(boton1);
        setLayout(null);
        
        boton3= new JButton("Aceptar");
        boton3.setBounds(130,20,80,20);
        boton3.setBackground(Color.black.brighter());
        boton3.setForeground(Color.red);
        boton3.setVisible(true);
        this.add(boton3);
        setLayout(null);
}
   
    
    public void ver(){
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
   

