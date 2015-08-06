/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Raul
 */
public class Editar extends JFrame implements ActionListener{
    
    public JButton boton1, boton2;
    public int n=1;
    
    public Editar(){
        
        super("Modelo de Salida");
        
        this.setBounds(600,200,120,120);
        
        this.setVisible(false);
        
        
        
        boton2= new JButton("PILA");
        boton2.setBounds(10,10,100,30);
        boton2.setForeground(Color.red);
        boton2.setBackground(Color.black.brighter());
        boton2.setVisible(true);
        boton2.addActionListener(this);
        this.add(boton2);
        
        boton1= new JButton("COLA");
        boton1.setBounds(10,40,100,30);
        boton1.setBackground(Color.black.brighter());
        boton1.setForeground(Color.red);
        boton1.setVisible(true);
        boton1.addActionListener(this);
        this.add(boton1);
        setLayout(null);

            
    }
    
    public void ver(){
        this.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        // Boton para elegir Cola
        if(e.getSource()==boton1) {   
         n=1;
         System.out.println(n+"Cola");
         this.setVisible(false);}
        
        // Boton para elegir Pila
        else if(e.getSource()==boton2) {
           n=2;
           System.out.println(n+"Pila");
           this.setVisible(false);
        }
    }
    
    // Metodo para enviar el codigo de salida "1" Cola, "2" Pila
    public int Traer(int n3){
       n3=n;
          return n3;             
    }
    
}
