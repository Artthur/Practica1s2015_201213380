/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Raul
 */
public class Listado extends JFrame{
    ListaE datos2 = new ListaE();
     ListadoP cuatro = new ListadoP();
     public int cod,q1,q2,q3,q4,q5,q6,q7,q8;
    
    
    
    
    public Listado(){
        super("Mario Maker Guatemalteco 1.1 Listado");
        this.setBounds(500,20,660,500);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
        setLayout(null);
    /*JScrollPane scrollPane = new JScrollPane(ListaP);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(0, 0, 645, 700);
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(645, 700));
        contentPane.add(scrollPane);
        this.setContentPane(contentPane);
        this.pack();
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        */
       
      //  JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

   //     this.setContentPane(pane);

        
        
        
        
        
        
    }
    
    
    
    public void poner(){
        this.setVisible(true);
        this.add(cuatro,BorderLayout.CENTER);
        cuatro.Recibe(datos2,cod,q1,q2,q3,q4,q5,q6,q7,q8);
        cuatro.invisible(this);
        setLayout(null);
        datos2=null;
        
      
        
        
    }
    public boolean Recibe(ListaE dos,int d,int r1,int r2,int r3,int r4,int r5,int r6,int r7,int r8){
        datos2 = dos;
        cod = d;
        q1=r1;
        q2=r2;
        q3=r3;
        q4=r4;
        q5=r5;
        q6=r6;
        q7=r7;
        q8=r8;
        System.out.println(datos2.tamaño+" "+" "+cod);
        return true;
    }

    
    

 
}
