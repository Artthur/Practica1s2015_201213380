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
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

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
    public JButton boton1, boton2, boton3, boton4,boton5,ad1,ad2,ad3,ad4,ad5,ad6,ad7,b1,b2,b3,b4,b5,b6,b7;
    public TextField campo1,campo2,campo3,campo4,campo5,campo6,campo7,c1,c2,c3,c4,c5,c6,c7;
    public JLabel imagen1,imagen2,imagen3,imagen4,imagen5,imagen6,imagen7;
    private BufferedImage imageActual;
    public String auxdir,au1,au2,au3,au4,au5,au6,au7;
    public CreacionP(){
        this.setBounds(0,0,645,700);
        setLayout(null);
        
        ad1= new JButton(" añadir ");
        ad1.setBounds(240,70,80,20);
        ad1.setForeground(Color.red);
        ad1.setBackground(Color.black.brighter());
        ad1.setVisible(true);
        ad1.addActionListener(this);
        this.add(ad1);
        ad2= new JButton(" añadir ");
        ad2.setBounds(240,150,80,20);
        ad2.setForeground(Color.red);
        ad2.setBackground(Color.black.brighter());
        ad2.addActionListener(this);
        ad2.setVisible(true);
        this.add(ad2);
        ad3= new JButton(" añadir ");
        ad3.setBounds(240,230,80,20);
        ad3.setForeground(Color.red);
        ad3.setBackground(Color.black.brighter());
        ad3.addActionListener(this);
        ad3.setVisible(true);
        this.add(ad3);
        ad4= new JButton(" añadir ");
        ad4.setBounds(240,310,80,20);
        ad4.setForeground(Color.red);
        ad4.setBackground(Color.black.brighter());
        ad4.addActionListener(this);
        ad4.setVisible(true);
        this.add(ad4);
        ad5= new JButton(" añadir ");
        ad5.setBounds(240,390,80,20);
        ad5.setForeground(Color.red);
        ad5.setBackground(Color.black.brighter());
        ad5.addActionListener(this);
        ad5.setVisible(true);
        this.add(ad5);
        ad6= new JButton(" añadir ");
        ad6.setBounds(240,470,80,20);
        ad6.setForeground(Color.red);
        ad6.setBackground(Color.black.brighter());
        ad6.addActionListener(this);
        ad6.setVisible(true);
        this.add(ad6);
        ad7= new JButton(" añadir ");
        ad7.setBounds(240,550,80,20);
        ad7.setForeground(Color.red);
        ad7.setBackground(Color.black.brighter());
        ad7.addActionListener(this);
        ad7.setVisible(true);
        this.add(ad7);
        
        
        
        
        boton3= new JButton(" Editar ");
        boton3.setBounds(500,10,90,20);
        boton3.setForeground(Color.red);
        boton3.setBackground(Color.black.brighter());
        boton3.setVisible(true);
        this.add(boton3);
       
        boton2= new JButton("Nombre");
        boton2.setBounds(140,10,80,20);
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
        
        b1= new JButton(" ... ");
        b1.setBounds(105,70,20,20);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black.brighter());
        b1.setVisible(true);
        b1.addActionListener(this);
        this.add(b1);
        b2= new JButton(" ... ");
        b2.setBounds(105,150,20,20);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black.brighter());
        b2.addActionListener(this);
        b2.setVisible(true);
        this.add(b2);
        b3= new JButton(" ... ");
        b3.setBounds(105,230,20,20);
        b3.setForeground(Color.white);
        b3.setBackground(Color.black.brighter());
        b3.addActionListener(this);
        b3.setVisible(true);
        this.add(b3);
        b4= new JButton(" ... ");
        b4.setBounds(105,310,20,20);
        b4.setForeground(Color.white);
        b4.setBackground(Color.black.brighter());
        b4.addActionListener(this);
        b4.setVisible(true);
        this.add(b4);
        b5= new JButton(" ... ");
        b5.setBounds(105,390,20,20);
        b5.setForeground(Color.white);
        b5.setBackground(Color.black.brighter());
        b5.addActionListener(this);
        b5.setVisible(true);
        this.add(b5);
        b6= new JButton(" ... ");
        b6.setBounds(105,470,20,20);
        b6.setForeground(Color.white);
        b6.setBackground(Color.black.brighter());
        b6.addActionListener(this);
        b6.setVisible(true);
        this.add(b6);
        b7= new JButton(" ... ");
        b7.setBounds(105,550,20,20);
        b7.setForeground(Color.white);
        b7.setBackground(Color.black.brighter());
        b7.addActionListener(this);
        b7.setVisible(true);
        this.add(b7);
        
        campo1= new TextField("Castillo");
        campo1.setBounds(140,70,80,20);
        campo1.setVisible(true);
        this.add(campo1);
        campo2= new TextField("Mario");
        campo2.setBounds(140,150,80,20);
        campo2.setVisible(true);
        this.add(campo2);
        campo3= new TextField("Goomba");
        campo3.setBounds(140,230,80,20);
        campo3.setVisible(true);
        this.add(campo3);
        campo4= new TextField("Hongo");
        campo4.setBounds(140,310,80,20); 
        campo4.setVisible(true);
        this.add(campo4); 
        campo5= new TextField("Koopa");
        campo5.setBounds(140,390,80,20);
        campo5.setVisible(true);
        this.add(campo5);
        campo6= new TextField("Pared");
        campo6.setBounds(140,470,80,20);
        campo6.setVisible(true);
        this.add(campo6);
        campo7= new TextField("Moneda");
        campo7.setBounds(140,550,80,20);
        campo7.setVisible(true);
        this.add(campo7);
        
        c1= new TextField("1");
        c1.setBounds(340,70,20,20);
        c1.setVisible(true);
        this.add(c1);
        c2= new TextField("2");
        c2.setBounds(340,150,20,20);
        c2.setVisible(true);
        this.add(c2);
        c3= new TextField("3");
        c3.setBounds(340,230,20,20);
        c3.setVisible(true);
        this.add(c3);
        c4= new TextField("4");
        c4.setBounds(340,310,20,20); 
        c4.setVisible(true);
        this.add(c4); 
        c5= new TextField("5");
        c5.setBounds(340,390,20,20);
        c5.setVisible(true);
        this.add(c5);
        c6= new TextField("6");
        c6.setBounds(340,470,20,20);
        c6.setVisible(true);
        this.add(c6);
        c7= new TextField("7");
        c7.setBounds(340,550,20,20);
        c7.setVisible(true);
        this.add(c7);
        
      
        
        
        
    
    }
    
    public void paintComponent(Graphics g){
        Dimension tamanio = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Imagenes/Fondo4.png"));
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width,tamanio.height,null);
        setOpaque(false);{
        super.paintComponent(g);
    }
        }
    
     public BufferedImage abrirImagen(){
        //Creamos la variable que será devuelta (la creamos como null)
        BufferedImage bmp=null;
        //Creamos un nuevo cuadro de diálogo para seleccionar imagen
        JFileChooser dialogo=new JFileChooser();
        //Le damos un título
        dialogo.setDialogTitle("Seleccione una imagen");
        //Filtramos los tipos de archivos
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG & GIF & BMP", "jpg", "gif", "bmp");
        dialogo.setFileFilter(filtroImagen);
        //Abrimos el cuadro de diálog
        int flag=dialogo.showOpenDialog(null);
        //Comprobamos que pulse en aceptar
        if(flag==JFileChooser.APPROVE_OPTION){
            try {
                auxdir=dialogo.getSelectedFile().getPath();
                System.out.println(auxdir);
                //Devuelve el fichero seleccionado
                File imagenSeleccionada=dialogo.getSelectedFile();
                //Asignamos a la variable bmp la imagen leida
                bmp = ImageIO.read(imagenSeleccionada);
            } catch (Exception e) {
                
            }
                 
        }
        //Asignamos la imagen cargada a la propiedad imageActual
        imageActual=bmp;
        //Retornamos el valor
        return bmp;
    }
        

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
      imagen1 = new JLabel();
      imagen1.setIcon(new ImageIcon(abrirImagen()));
            au1= auxdir;
      System.out.print(au1);
      imagen1.setBounds(10,35,85,75);
      this.add(imagen1);
      repaint();        
      
        }
        
        else if(e.getSource()==b2) {
      imagen2 = new JLabel();
      imagen2.setIcon(new ImageIcon(abrirImagen()));
            au2= auxdir;
      System.out.println(au2);
      imagen2.setBounds(10,115,85,75);
      this.add(imagen2);
      repaint();        
      
        }
        
        
        
    }
    
    

}
