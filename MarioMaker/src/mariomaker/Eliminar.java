/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import java.awt.Color;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Raul
 */
public class Eliminar extends JFrame {
    public JButton boton1,boton2,boton3;
    public TextField campo1, campo2;
    public Eliminar(){
        super("Eliminacion");
        
        this.setBounds(600,200,230,100);
        
        this.setVisible(false);
        boton2= new JButton("No.Fila");
        boton2.setBounds(10,10,80,20);
        boton2.setForeground(Color.white);
        boton2.setBackground(Color.black.brighter());
        boton2.setVisible(true);
        this.add(boton2);
        
        boton1= new JButton("No.Colu");
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
        
        campo1= new TextField("");
        campo1.setBounds(100,10,20,20);
        campo1.setVisible(true);
        this.add(campo1);
        
        campo2= new TextField("");
        campo2.setBounds(100,30,20,20);
        campo2.setVisible(true);
        this.add(campo2);
    }
    public void ver(){
        this.setVisible(true);
    }
    
    
}
