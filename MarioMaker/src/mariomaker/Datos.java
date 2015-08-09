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
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class Datos extends JFrame implements ActionListener {
    public JButton boton1, boton2;
    public int n,c1,c2,c3,c4,c5,c6,c7,c8;
    public String n1,n2,n3,n4,n5,n6,n7,n8;
    public JLabel nom1,nom2,nom3,nom4,nom5,nom6,nom7,nom8,num1,num2,num3,num4,num5,num6,num7,num8;
    public Datos(){
        super("Datos");
        
        this.setBounds(600,200,200,250);
        
        boton2= new JButton("Aceptar");
        boton2.setBounds(10,180,80,20);
        boton2.setForeground(Color.red);
        boton2.setBackground(Color.black.brighter());
        boton2.setVisible(true);
        boton2.addActionListener(this);
        this.add(boton2);
        
        
        nom1= new JLabel("Meta");
        nom1.setBounds(10,10,80,20);
        nom1.setBackground(Color.black.brighter());
        nom1.setForeground(Color.black);
        nom1.setVisible(true);
        this.add(nom1);
        nom2= new JLabel("Principal");
        nom2.setBounds(10,30,80,20);
        nom2.setBackground(Color.black.brighter());
        nom2.setForeground(Color.black);
        nom2.setVisible(true);
        this.add(nom2);
        nom3= new JLabel("-");
        nom3.setBounds(10,50,80,20);
        nom3.setBackground(Color.black.brighter());
        nom3.setForeground(Color.black);
        nom3.setVisible(true);
        this.add(nom3);
        nom4= new JLabel("-");
        nom4.setBounds(10,70,80,20);
        nom4.setBackground(Color.black.brighter());
        nom4.setForeground(Color.black);
        nom4.setVisible(true);
        this.add(nom4);
        nom5= new JLabel("-");
        nom5.setBounds(10,90,80,20);
        nom5.setBackground(Color.black.brighter());
        nom5.setForeground(Color.black);
        nom5.setVisible(true);
        this.add(nom5);
        nom6= new JLabel("-");
        nom6.setBounds(10,110,80,20);
        nom6.setBackground(Color.black.brighter());
        nom6.setForeground(Color.red);
        nom6.setVisible(true);
        this.add(nom6);
        nom7= new JLabel("-");
        nom7.setBounds(10,130,80,20);
        nom7.setBackground(Color.black.brighter());
        nom7.setForeground(Color.red);
        nom7.setVisible(true);
        this.add(nom7);
        
        nom8= new JLabel("-");
        nom8.setBounds(10,150,80,20);
        nom8.setBackground(Color.black.brighter());
        nom8.setForeground(Color.red);
        nom8.setVisible(true);
        this.add(nom8);
        
        num1= new JLabel("1");
        num1.setBounds(100,10,80,20);
        num1.setBackground(Color.black.brighter());
        num1.setForeground(Color.red);
        num1.setVisible(true);
        this.add(num1);
        num2= new JLabel("2");
        num2.setBounds(100,30,80,20);
        num2.setBackground(Color.black.brighter());
        num2.setForeground(Color.red);
        num2.setVisible(true);
        this.add(num2);
        num3= new JLabel("3");
        num3.setBounds(100,50,80,20);
        num3.setBackground(Color.black.brighter());
        num3.setForeground(Color.red);
        num3.setVisible(true);
        this.add(num3);
        num4= new JLabel("4");
        num4.setBounds(100,70,80,20);
        num4.setBackground(Color.black.brighter());
        num4.setForeground(Color.red);
        num4.setVisible(true);
        this.add(num4);
        num5= new JLabel("5");
        num5.setBounds(100,90,80,20);
        num5.setBackground(Color.black.brighter());
        num5.setForeground(Color.red);
        num5.setVisible(true);
        this.add(num5);
        num6= new JLabel("6");
        num6.setBounds(100,110,80,20);
        num6.setBackground(Color.black.brighter());
        num6.setForeground(Color.red);
        num6.setVisible(true);
        this.add(num6);
        num7= new JLabel("7");
        num7.setBounds(100,130,80,20);
        num7.setBackground(Color.black.brighter());
        num7.setForeground(Color.red);
        num7.setVisible(true);
        this.add(num7);
        num8= new JLabel("8");
        num8.setBounds(100,150,80,20);
        num8.setBackground(Color.black.brighter());
        num8.setForeground(Color.red);
        num8.setVisible(true);
        this.add(num8);
        
        
        
        this.setVisible(false);
        
        setLayout(null);
        
    }
    public void ver(){
       decir();
        this.setVisible(true);
    }
    
    public boolean recibir(String a1,String a2,String a3,String a4,String a5,String a6,String a7,String a8,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8){

        n1=a1;
        n2=a2;
        n3=a3;
        n4=a4;
        n5=a5;
        n6=a6;
        n7=a7;
        n8=a8;
        
        c1=i1;
        c2=i2;
        c3=i3;
        c4=i4;
        c5=i5;
        c6=i6;
        c7=i7;
        c8=i8;
   
        
    return true;    
    }
    
    public boolean decir(){
    try{   
        
        nom1.setText(n1);
        nom2.setText(n2);
        nom3.setText(n3);
        nom4.setText(n4);
        nom5.setText(n5);
        nom6.setText(n6);
        nom7.setText(n7);
        nom8.setText(n8);
        
        num1.setText(Integer.toString(c1));
        num2.setText(Integer.toString(c2));
        num3.setText(Integer.toString(c3));
        num4.setText(Integer.toString(c4));
        num5.setText(Integer.toString(c5));
        num6.setText(Integer.toString(c6));
        num7.setText(Integer.toString(c7));
        num8.setText(Integer.toString(c8));
        repaint();
    }
     catch(Exception e){
         JOptionPane.showMessageDialog(null,"Final de los datos"); 
     }   
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==boton2) {   
        
        decir(); 
         this.setVisible(false);}
    }
    
    
}
