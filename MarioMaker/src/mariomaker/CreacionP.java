/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Raulboton3= new JButton("Tipo");
        boton3.setBounds(290,10,70,20);
        boton3.setForeground(Color.white);
        boton3.setBackground(Color.black.brighter());
        boton3.setVisible(true);
        this.add(boton3);
 */
public class CreacionP extends javax.swing.JPanel implements ActionListener{
    public JButton boton1, boton2, boton3, boton4,boton5;
    public TextField campo1,campo2,campo3,campo4,campo5,campo6,campo7;
    public CreacionP(){
        this.setBounds(0,0,645,550);
        setLayout(null);
        boton3= new JButton(" C: ");
        boton3.setBounds(290,10,70,20);
        boton3.setForeground(Color.white);
        boton3.setBackground(Color.black.brighter());
        boton3.setVisible(true);
        this.add(boton3);
        boton2= new JButton("Nombre");
        boton2.setBounds(120,10,80,20);
        boton2.setForeground(Color.white);
        boton2.setBackground(Color.black.brighter());
        boton2.setVisible(true);
        this.add(boton2);
        boton1= new JButton("Imagen");
        boton1.setBounds(10,10,85,20);
        boton1.setBackground(Color.black.brighter());
        boton1.setForeground(Color.white);
        boton1.setVisible(true);
        boton1.addActionListener(this);
        this.add(boton1);
        
        boton4= new JButton(" Editar ");
        boton4.setBounds(500,10,90,20);
        boton4.setForeground(Color.red);
        boton4.setBackground(Color.black.brighter());
        boton4.setVisible(true);
        this.add(boton4);
        
        campo1= new TextField("1");
        campo1.setBounds(120,60,80,20);
        campo1.setVisible(true);
        this.add(campo1);
        campo2= new TextField("2");
        campo2.setBounds(120,130,80,20);
        campo2.setVisible(true);
        this.add(campo2);
        campo3= new TextField("3");
        campo3.setBounds(120,200,80,20);
        campo3.setVisible(true);
        this.add(campo3);
        campo4= new TextField("4");
        campo4.setBounds(120,270,80,20); 
        campo4.setVisible(true);
        this.add(campo4); 
        campo5= new TextField("5");
        campo5.setBounds(120,340,80,20);
        campo5.setVisible(true);
        this.add(campo5);
        campo6= new TextField("6");
        campo6.setBounds(120,410,80,20);
        campo6.setVisible(true);
        this.add(campo6);
        campo7= new TextField("7");
        campo7.setBounds(120,480,80,20);
        campo7.setVisible(true);
        this.add(campo7);
        
        
        
    
    }
    
    public void paintComponent(Graphics g){
        Dimension tamanio = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Imagenes/Fondo4.png"));
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width,tamanio.height,null);
        setOpaque(false);{
        super.paintComponent(g);
    }
        }
        

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
