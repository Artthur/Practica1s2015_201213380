/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class Tablero extends JFrame implements ActionListener,KeyListener{
    public JButton boton1,boton2,boton3,boton4,siguiente,anterior,muestra,elifila,elicolu,cont,boton5;
    public JLabel imagen;
    public String m1,m2,m3,m4,m5,m6,m7,m8;
    ListaE Datos = new ListaE();
    NodoE nuevo;
    Datos n = new Datos();
    public int  j1,j2,j3,j4,j5,j6,j7,j8;
    Juego Play = new Juego();
    Eliminar x = new Eliminar();
    public TableroP p;
    
    public Tablero(){
        super("Mario Maker Guatemalteco 1.0 Tablero");
        this.setBounds(60,0,1310,770);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
        setLayout(null);
        
        boton2= new JButton("Eliminar");
        boton2.setBounds(100,10,90,40);
        boton2.setForeground(Color.red);
        boton2.setBackground(Color.black.brighter());
        boton2.addActionListener(this); 
        boton2.setVisible(true);
        this.add(boton2);
        boton3= new JButton("Graficar");
        boton3.setBounds(10,10,90,40);
        boton3.setBackground(Color.black.brighter());
        boton3.setForeground(Color.red);
        boton3.setVisible(true);
        boton3.addActionListener(this); 
        this.add(boton3);
        
        boton1= new JButton("Datos");
        boton1.setBounds(190,10,80,40);
        boton1.setForeground(Color.red);
        boton1.setBackground(Color.black.brighter());
        boton1.setVisible(true);
        boton1.addActionListener(this); 
        this.add(boton1);
        
        boton4= new JButton("Listado:");
        boton4.setBounds(1080,10,100,20);
        boton4.setForeground(Color.red);
        boton4.setBackground(Color.black.brighter());
        boton4.addActionListener(this);
        boton4.setVisible(true);
        this.add(boton4);
        
        
        // columna 1180,170,115,550
        // fila 275,0,800,60
        
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
        
        imagen = new JLabel();
        imagen.setBounds(1190,10,85,75);
        
        elifila= new JButton("Add-Columna");
        elifila.setBounds(1185,125,110,20);
        elifila.setForeground(Color.red);
        elifila.setBackground(Color.black.brighter());
        elifila.setVisible(true);
        elifila.addActionListener(this); 
        this.add(elifila);
        elicolu= new JButton("Add-Fila");
        elicolu.setBounds(1185,95,110,20);
        elicolu.setForeground(Color.red);
        elicolu.setBackground(Color.black.brighter());
        elicolu.setVisible(true);
        elicolu.addActionListener(this); 
        this.add(elicolu);
        cont= new JButton("Continuar...");
        cont.setBounds(1185,155,110,20);
        cont.setForeground(Color.green);
        cont.setBackground(Color.black.brighter());
        cont.setVisible(true);
        cont.addActionListener(this); 
        this.add(cont);
        //Columna
      ImageIcon imagens = new ImageIcon (getClass().getResource("/Imagenes/Columna.jpg"));   
      JLabel fondo1 = new JLabel(imagens);
      fondo1.setBounds(new Rectangle(1180,180,115,540));
      this.add(fondo1);
      //Fila
      ImageIcon imagen2s = new ImageIcon (getClass().getResource("/Imagenes/Fila.jpg"));   
      JLabel fondo2 = new JLabel(imagen2s);
      fondo2.setBounds(new Rectangle(275,0,800,60));
      this.add(fondo2);
      
      p = new TableroP();
      this.add(p);
      
        
        repaint();
        
        
        
    }
    
    public boolean Datos(String a1,String a2,String a3,String a4,String a5,String a6,String a7,String a8){
        m1=a1;
        m2=a2;
        m3=a3;
        m4=a4;
        m5=a5;
        m6=a6;
        m7=a7;
        m8=a8;
    return true;
}
    
    public void poner(){
        this.setVisible(true);
        setLayout(null);
    }

    public boolean Recibe(ListaE tres,int r1,int r2,int r3,int r4,int r5,int r6,int r7,int r8){
        Datos = tres;
        j1=r1;
        j2=r2;
        j3=r3;
        j4=r4;
        j5=r5;
        j6=r6;
        j7=r7;
        j8=r8;
        System.out.println(Datos.tamaño+" En tablero");
        
       
        return true;
    }
    
    public boolean Ver(NodoE n){
           
     NodoE auxilio = n;
  //Primera funcion de actualizado    
 
   imagen.setIcon(new ImageIcon(auxilio.imagen));
    this.add(imagen);
    
    repaint();

        return true;
    }
    
    public boolean Siguiente(){
      
    nuevo=nuevo.siguiente;
    
   try {
       if(nuevo.tieneSiguiente()){ 
   Ver(nuevo);
    
   }
       else if (nuevo.siguiente==null){
         Ver(nuevo);
         JOptionPane.showMessageDialog(null,"Final de los datos"); 
       }
       
   }
   catch(Exception e){
       JOptionPane.showMessageDialog(null,"Final de datos");
   }
   
   
  return true;
  
      
  }
  
    public boolean Anterior(){
      nuevo=nuevo.anterior;
    
   try {
       if(nuevo.tieneAnterior()){ 
   Ver(nuevo);
    
   }
       else if (nuevo.anterior==null){
         Ver(nuevo);
       }
       else {
         JOptionPane.showMessageDialog(null,"Final de datos");  
       }
   }
   catch(Exception e){
       JOptionPane.showMessageDialog(null,"Final de datos");
   }
      return true;
  }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==boton4) {
           
        Ver(Datos.inicio);
        nuevo=Datos.inicio;
        
        }
       //Boton para siguiente
        else if(e.getSource()==siguiente) {
           
        if(nuevo.siguiente!=null){
        Siguiente();
        }
        else if(nuevo.siguiente==null){
        System.out.println("Fin1");
        }      
        }
       
       //Boton para anterior
        else if(e.getSource()==anterior) {
         
        
        if(nuevo.anterior!=null){
        Anterior();
        }
        else if(nuevo.anterior==null){
            System.out.println("Fin2");
        }
        }
       else if(e.getSource()==boton1) {
         
        n.recibir(m1, m2, m3, m4, m5, m6, m7, m8,j1,j2,j3,j4,j5,j6,j7,j8);
        n.ver();
        
        }
       else if(e.getSource()==cont) {
        this.setVisible(false); 
        Play.poner();
        
        
        }
       
       else if(e.getSource()==boton2) {
        
        x.ver();
 
        }
       
       
       
       
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /* public void paint(Graphics g){
      //  update(g);
    }
    
    public void update(Graphics g){
        
        Graphics2D g2 = (Graphics2D)g;
        Dimension d = this.getSize();
        Image imagen = createImage(10,70);
        Graphics2D fondo = (Graphics2D)imagen.getGraphics();
        //Dibujar(g);
        
        g2.drawImage(imagen, 0, 0, this);
    }
    
    public void Dibujar(Graphics g){
        //10,60,1170,660
        Graphics2D G2 = (Graphics2D)g;
        int posicion_x =10;
        int posicion_y =60;
        for(int i = 0;i<2;i++){
            
            for(int y=0;i<4;i++){
                G2.drawRect(posicion_x, posicion_y, 80, 75);
                posicion_x+=80;
                
            }
            posicion_y+=75;
            posicion_x=10;
        }
       
    }*/
    
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==38){
            System.out.println("Arriba");
        }
       else if(e.getKeyCode()==40){
            System.out.println("Abajo");
        }
        else if(e.getKeyCode()==37){
            System.out.println("izquierda");
        }
        else if(e.getKeyCode()==39){
            System.out.println("derecha");
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
