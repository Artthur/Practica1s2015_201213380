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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Raul
 */
public class ListadoP extends JPanel implements ActionListener{
    public JButton boton1,boton2,boton3,boton4,elim1,elim2,elim3,elim4,mod1,mod2,mod3,mod4;
    public TextField campo1,campo2,campo3,campo4;
    ListaE datos3 = new ListaE();
   
    
    public ListadoP(){
        this.setBounds(0,0,645,500);
       

        setLayout(null);
        
        boton1= new JButton("Eliminar-Con Clave");
        boton1.setBounds(480,10,150,20);
        boton1.setBackground(Color.black.brighter());
        boton1.setForeground(Color.white);
        boton1.setVisible(true);
        boton1.addActionListener(this);
        this.add(boton1);
        
        boton2= new JButton("Nombre");
        boton2.setBounds(140,10,80,20);
        boton2.setForeground(Color.white);
        boton2.setBackground(Color.black.brighter());
        boton2.setVisible(true);
        this.add(boton2);
        boton3= new JButton("Imagen");
        boton3.setBounds(10,10,85,20);
        boton3.setBackground(Color.black.brighter());
        boton3.setForeground(Color.white);
        boton3.setVisible(true);
        boton3.addActionListener(this); 
        this.add(boton3);
        
        campo1= new TextField("Catillo");
        campo1.setBounds(140,70,80,20);
        campo1.setVisible(true);
        this.add(campo1);
        campo2= new TextField("Mario");
        campo2.setBounds(140,150,80,20);
        campo2.setVisible(true);
        this.add(campo2);
        campo3= new TextField("pared");
        campo3.setBounds(140,230,80,20);
        campo3.setVisible(true);
        this.add(campo3);
        campo4= new TextField("moneda");
        campo4.setBounds(140,310,80,20); 
        campo4.setVisible(true);
        this.add(campo4); 
        
        elim1= new JButton("Eliminar");
        elim1.setBounds(340,70,85,20);
        elim1.setBackground(Color.black.brighter());
        elim1.setForeground(Color.red);
        elim1.setVisible(true);
        elim1.addActionListener(this);
        this.add(elim1);
        elim2= new JButton("Eliminar");
        elim2.setBounds(340,150,85,20);
        elim2.setBackground(Color.black.brighter());
        elim2.setForeground(Color.red);
        elim2.setVisible(true);
        elim2.addActionListener(this);
        this.add(elim2);
        elim3= new JButton("Eliminar");
        elim3.setBounds(340,230,85,20);
        elim3.setBackground(Color.black.brighter());
        elim3.setForeground(Color.red);
        elim3.setVisible(true);
        elim3.addActionListener(this);
        this.add(elim3);
        elim4= new JButton("Eliminar");
        elim4.setBounds(340,310,85,20);
        elim4.setBackground(Color.black.brighter());
        elim4.setForeground(Color.red);
        elim4.setVisible(true);
        elim4.addActionListener(this);
        this.add(elim4);
        
        mod1= new JButton("Modificar");
        mod1.setBounds(240,70,85,20);
        mod1.setBackground(Color.black.brighter());
        mod1.setForeground(Color.red);
        mod1.setVisible(true);
        mod1.addActionListener(this);
        this.add(mod1);
        mod2= new JButton("Modificar");
        mod2.setBounds(240,150,85,20);
        mod2.setBackground(Color.black.brighter());
        mod2.setForeground(Color.red);
        mod2.setVisible(true);
        mod2.addActionListener(this);
        this.add(mod2);
        mod3= new JButton("Modificar");
        mod3.setBounds(240,230,85,20);
        mod3.setBackground(Color.black.brighter());
        mod3.setForeground(Color.red);
        mod3.setVisible(true);
        mod3.addActionListener(this);
        this.add(mod3);
        mod4= new JButton("Modificar");
        mod4.setBounds(240,310,85,20);
        mod4.setBackground(Color.black.brighter());
        mod4.setForeground(Color.red);
        mod4.setVisible(true);
        mod4.addActionListener(this);
        this.add(mod4);
        
        
        
        
      
        
    }
    
    
    public void paintComponent(Graphics g){
        Dimension tamanio = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg"));
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width,tamanio.height,null);
        setOpaque(false);{
        super.paintComponent(g);
    }
        }
    
    public boolean Recibe(ListaE tres){
        datos3 = tres;
        System.out.println(datos3.tamaño);
        
        return true;
    }
    
    
    public boolean OrdenarC(){
    
   
      NodoE Cola = datos3.inicio;
  
      
 try{   while(Cola.tieneSiguiente()){
     
        
     
        System.out.println(Cola.nombre);
        Cola= Cola.siguiente;
    }
    
    
    System.out.println(Cola.nombre);    
    
    
        
     
    return true;
 }
 
 catch(Exception exception){
    JOptionPane.showMessageDialog(null,"Ya no hay datos");
     return false;
 }
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1) {
      
      int idvar;
      idvar = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del objeto a eliminar")); 
      
     datos3.sustraer(idvar);
     datos3.imprimir();
     // System.out.println(datos3.inicio.nombre+datos3.inicio.id);
        }
        
        if(e.getSource()==boton3) {
        boton4= new JButton("Nuevo");
        boton4.setBounds(200,60,85,20);
        boton4.setBackground(Color.black.brighter());
        boton4.setForeground(Color.white);
        boton4.setVisible(true);
        boton4.addActionListener(this);
        this.add(boton4);        
        repaint();
        }
     
    }
    
}
