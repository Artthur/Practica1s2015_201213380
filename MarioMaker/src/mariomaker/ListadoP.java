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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Raul
 */
public class ListadoP extends JPanel implements ActionListener{
    public JButton boton1,boton2,boton3,boton4,elim1,elim2,elim3,elim4,mod1,mod2,mod3,mod4,carga,mostra,sig,ant,cont;
    public TextField campo1,campo2,campo3,campo4;
    public JLabel imagen1,imagen2,imagen3,imagen4;
    public int cod,t,auxid1,auxid2,auxid3,auxid4,q1,q2,q3,q4,q5,q6,q7,q8,i,i2,i3,i4;
    ListaE datos3 = new ListaE();
    ListaE aux = new ListaE();
    Tablero tablero  = new Tablero();
    public NodoE sigui,anti ;
    public JFrame m;
    
   
    
    public ListadoP(){
        this.setBounds(0,0,645,500);
       

        setLayout(null);
        
        boton1= new JButton("Eliminar-Con Clave");
        boton1.setBounds(480,70,150,20);
        boton1.setBackground(Color.black.brighter());
        boton1.setForeground(Color.red);
        boton1.setVisible(true);
        boton1.addActionListener(this);
        this.add(boton1);
        carga= new JButton("Ordenar los Datos");
        carga.setBounds(480,10,150,20);
        carga.setBackground(Color.black.brighter());
        carga.setForeground(Color.red);
        carga.setVisible(true);
        carga.addActionListener(this);
        this.add(carga);
        mostra= new JButton("Actualizar los Datos");
        mostra.setBounds(480,40,150,20);
        mostra.setBackground(Color.black.brighter());
        mostra.setForeground(Color.red);
        mostra.setVisible(true);
        mostra.addActionListener(this);
        this.add(mostra);
        cont= new JButton("Continuar...");
        cont.setBounds(480,100,150,20);
        cont.setBackground(Color.black.brighter());
        cont.setForeground(Color.green);
        cont.setVisible(true);
        cont.addActionListener(this);
        this.add(cont);
        
        sig= new JButton("Siguiente -->");
        sig.setBounds(480,400,150,20);
        sig.setBackground(Color.black.brighter());
        sig.setForeground(Color.white);
        sig.setVisible(true);
        sig.addActionListener(this);
        this.add(sig);
        ant= new JButton("<-- Anterior");
        ant.setBounds(480,430,150,20);
        ant.setBackground(Color.black.brighter());
        ant.setForeground(Color.white);
        ant.setVisible(true);
        ant.addActionListener(this);
        this.add(ant);
        
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
        this.add(boton3);
        
        campo1= new TextField("");
        campo1.setBounds(140,70,80,20);
        campo1.setVisible(true);
        this.add(campo1);
        campo2= new TextField("");
        campo2.setBounds(140,150,80,20);
        campo2.setVisible(true);
        this.add(campo2);
        campo3= new TextField("");
        campo3.setBounds(140,230,80,20);
        campo3.setVisible(true);
        this.add(campo3);
        campo4= new TextField("");
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
        
        imagen1 = new JLabel();
        imagen1.setBounds(10,35,85,75);
        imagen2 = new JLabel();
        imagen2.setBounds(10,115,85,75);
        imagen3 = new JLabel();
        imagen3.setBounds(10,195,85,75);
        imagen4 = new JLabel();
        imagen4.setBounds(10,275,85,75);
        
        
      
        
    }
    
    
    public void paintComponent(Graphics g){
        Dimension tamanio = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg"));
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width,tamanio.height,null);
        setOpaque(false);{
        super.paintComponent(g);
    }
        }
    
    public boolean Recibe(ListaE tres,int d,int r1,int r2,int r3,int r4,int r5,int r6,int r7,int r8){
        datos3 = tres;
        cod = d;
        q1=r1;
        q2=r2;
        q3=r3;
        q4=r4;
        q5=r5;
        q6=r6;
        q7=r7;
        q8=r8;
        System.out.println(datos3.tamaño+" "+" "+cod);
        
        return true;
    }
    
    
  public boolean OrdenarC(){
        
    NodoE Cola = datos3.inicio;  
 try{   while(Cola.tieneSiguiente()){
    System.out.println("Cola");
       aux.adicionar(Cola.imagen,Cola.nombre,Cola.id,Cola.id2);
       Cola = Cola.siguiente;
       
    } 
     aux.adicionar(Cola.imagen,Cola.nombre,Cola.id,Cola.id2);
     System.out.println("");
     System.out.println("____Orden_____");
     System.out.println("");
     aux.imprimir();
     System.out.println(Cola.imagen);
     datos3=null;
    return true;
 }catch(Exception exception){
    JOptionPane.showMessageDialog(null,"Final de Carga");
     return false;
 }
    
}
    
  public boolean OrdenarP(){
        
        NodoE Pila = datos3.inicio;  
 try{   while(Pila.tieneSiguiente()){
       Pila = Pila.siguiente;
       
    } 
      while (Pila.tieneAnterior()){
          
      aux.adicionar(Pila.imagen,Pila.nombre,Pila.id,Pila.id2);  
      Pila=Pila.anterior;
      }
      aux.adicionar(Pila.imagen,Pila.nombre,Pila.id,Pila.id2); 
       System.out.println("");
     System.out.println("____Orden_____");
     System.out.println("");
     aux.imprimir();
     
    return true;
 }catch(Exception exception){
    JOptionPane.showMessageDialog(null,"Final de Carga");
     return false;
 }
        
    }

    @Override
  public void actionPerformed(ActionEvent e) {
       //Boton para eliminar con id
        if(e.getSource()==boton1) {
       try{     
      
      int idvar;
      idvar = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del objeto a eliminar")); 
      
     datos3.sustraer(idvar);
     datos3.imprimir();
     // System.out.println(datos3.inicio.nombre+datos3.inicio.id);
        }catch(Exception exception){
    JOptionPane.showMessageDialog(null,"Error al eliminar");
     
 }}
       //Botones de eliminar
        else if(e.getSource()==elim1) {
        aux.sustraer(auxid1);
         //Cantidad(i); 
         
        }
        else if(e.getSource()==elim2) {
        aux.sustraer(auxid2);
         //Cantidad(i2);
        }
        else if(e.getSource()==elim3) {
        aux.sustraer(auxid3);
         //Cantidad(i3);
        }
        else if(e.getSource()==elim4) {
        aux.sustraer(auxid4);
         //Cantidad(i4);
        }
        
        //Botones de Modificar
        else if(e.getSource()==mod1) {
        aux.Modificar(campo1.getText(), auxid1);
        }
        else if(e.getSource()==mod2) {
        aux.Modificar(campo2.getText(), auxid2);
        }
        else if(e.getSource()==mod3) {
        aux.Modificar(campo3.getText(), auxid3);
        }
        else if(e.getSource()==mod4) {
        aux.Modificar(campo4.getText(), auxid4);
        }
        
        //Boton para ordenar
       else if(e.getSource()==carga) {
        Extraer(cod);
        }
       
       //Boton para continuar
       else if(e.getSource()==cont) {
        
        tablero.poner();
        tablero.Recibe(aux, q1, q2, q3, q4, q5, q6, q7, q8);
        m.setVisible(false);
        }
       
       //Boton para Actualizar muestra
        else if(e.getSource()==mostra) {
        t=0;   
        Mostrar(aux.inicio);
        sigui=aux.inicio;
        }
        
        //Boton para siguiente
        else if(e.getSource()==sig) {
        t=0;   
        if(sigui.siguiente!=null){
        Siguiente();
        }
        else if(sigui.siguiente==null){
        System.out.println("Fin1");
        }      
        }
       
       //Boton para anterior
        else if(e.getSource()==ant) {
        t=0;   
        
        if(sigui.anterior!=null){
        Anterior();
        }
        else if(sigui.anterior==null){
            System.out.println("Fin2");
        }
        }
     
    }
    
  public boolean Extraer(int d){
    if(d==1){
       
   System.out.println("Cola");
    OrdenarC(); 
   
    }
    else if(d==2){
     System.out.println("Pila"); 
     OrdenarP();
    }
    
    return true;
}
  
  public boolean Mostrar(NodoE m){
      
     NodoE auxilio = m;
  //Primera funcion de actualizado    
      while(t<4){
      if(t==0){
   imagen1.setIcon(new ImageIcon(auxilio.imagen));
    this.add(imagen1);
    repaint();
      campo1.setText(auxilio.nombre);
      auxid1=auxilio.id;
      i=auxilio.id2;
      
      if(auxilio.siguiente==null){
         imagen2.setIcon(null);
         campo2.setText("");
         auxid2=0;
         i2=0;
         imagen3.setIcon(null);
         campo3.setText("");
         auxid3=0;
         i3=0;
         imagen4.setIcon(null);
         campo4.setText("");
         auxid4=0;
         i4=0;
         
          return true;
      }
      }
      else if(t==1){
          
      
      imagen2.setIcon(new ImageIcon(auxilio.imagen));
      this.add(imagen2);
      campo2.setText(auxilio.nombre);
      auxid2=auxilio.id;
      i2=auxilio.id2;
       if(auxilio.siguiente==null){
           
         imagen3.setIcon(null);
         campo3.setText("");
         auxid3=0;
         i3=0;
         imagen4.setIcon(null);
         campo4.setText("");
         auxid4=0;
         i4=0;
          return true;
      }
      

      }
      else if(t==2){
  
      imagen3.setIcon(new ImageIcon(auxilio.imagen));
      this.add(imagen3);
      campo3.setText(auxilio.nombre);
      auxid3=auxilio.id;
      i3=auxilio.id2;
       if(auxilio.siguiente==null){
           
         imagen4.setIcon(null);
         campo4.setText("");
         auxid4=0;
         i4=0;
          return true;
      }
      
      }
      else if(t==3){
         
      imagen4.setIcon(new ImageIcon(auxilio.imagen));
      this.add(imagen4);
      campo4.setText(auxilio.nombre);
      auxid4=auxilio.id;
      i4=auxilio.id2;
       if(auxilio.siguiente==null){
          return true;
      }
      
              }
      
 
t++;
auxilio = auxilio.siguiente;

 }

              
   
      
      
  return true;
  
  
    
}
  
  public boolean Siguiente(){
      
    sigui=sigui.siguiente;
    
   try {
       if(sigui.tieneSiguiente()){ 
   Mostrar(sigui);
    
   }
       else if (sigui.siguiente==null){
         Mostrar(sigui);
         JOptionPane.showMessageDialog(null,"Final de los datos"); 
       }
       
   }
   catch(Exception e){
       JOptionPane.showMessageDialog(null,"Final de datos");
   }
   
   
  return true;
  
      
  }
  
  public boolean Anterior(){
      sigui=sigui.anterior;
    
   try {
       if(sigui.tieneAnterior()){ 
   Mostrar(sigui);
    
   }
       else if (sigui.anterior==null){
         Mostrar(sigui);
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
  
  public boolean invisible(JFrame n){
         m = n;
         
            return true;
        }
  public boolean Cantidad(int f){
      if(f==1){
            q1--;
            return true;
        }
      else if(f==2){
            q2--;
            return true;
        }
      else if(f==3){
            q3--;
            return true;
        }
      else  if(f==4){
            q4--;
            return true;
        }
      else if(f==5){
            q5--;
            return true;
        }
     else if(f==6){
            q6--;
            return true;
        }
     else if(f==7){
            q7--;
            return true;
        }
     else if(f==8){
            q8--;
            return true;
        }
return false;      
  }
}
  
  
