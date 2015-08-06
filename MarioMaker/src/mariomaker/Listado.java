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
        cuatro.Recibe(datos2);
        setLayout(null);
        
      
        
        
    }
    public boolean Recibe(ListaE dos){
        datos2 = dos;
        System.out.println(datos2.tamaño);
        return true;
    }

    
    

 
}
