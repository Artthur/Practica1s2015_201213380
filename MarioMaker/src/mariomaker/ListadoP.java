/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Raul
 */
public class ListadoP extends JPanel implements ActionListener{
    public JButton boton1;
    ListaE datos3 = new ListaE();
    public ListadoP(){
        this.setBounds(0,0,645,700);
        setLayout(null);
        
        boton1= new JButton("Emimiar");
        boton1.setBounds(10,10,85,20);
        boton1.setBackground(Color.black.brighter());
        boton1.setForeground(Color.white);
        boton1.setVisible(true);
        boton1.addActionListener(this);
        this.add(boton1);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1) {
      
      int idvar;
      idvar = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del objeto a eliminar")); 
      
     datos3.sustraer(idvar);
     datos3.imprimir();
     // System.out.println(datos3.inicio.nombre+datos3.inicio.id);
        }
    }
    
}
