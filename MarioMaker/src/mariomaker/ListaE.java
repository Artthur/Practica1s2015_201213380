/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class ListaE {
    NodoE inicio;
    int tamaño;
    
    public boolean adicionar(String direccion,String nombre, int id){
        if(inicio==null){
        inicio = new NodoE(null,direccion,nombre,id,null);
        tamaño++;
        return true;
        }
        else{
        NodoE temp = inicio;
        while(temp.tieneSiguiente()){
        temp= temp.getSiguiente();
        }
        temp.setSiguiente(new NodoE(temp,direccion,nombre,id,null));
        tamaño++;
        return true;
        }  
        
    }
    
   public boolean sustraer(int num){
      NodoE tempo = inicio;
       
       
        while(tempo.siguiente!=null){
         
             
             if(tempo.id==num)
             {
                 if(tempo.anterior==null)
                {
                     inicio=tempo.siguiente;
                     inicio.anterior=null;
                     System.out.println("Estoy en 1");
                }
                 else{
                    
                    NodoE temporal;
                    NodoE temporal2;
                    temporal2=tempo.siguiente;
                    temporal= tempo.anterior;
                    temporal.siguiente = temporal2;
                    temporal2.anterior=temporal;
                    System.out.println("Estoy en 2");
                     }
                return true;
             }
             
             tempo=tempo.siguiente;         
    }
        
    if(tempo.siguiente==null){
           
           if(tempo.id==num){
               
               if(tempo.anterior==null){
                   inicio=null;
                   System.out.println("Estoy en 3");
               }
               else{
                   NodoE temporal3;
                   temporal3=tempo.anterior;
                   temporal3.siguiente=null;
                   System.out.println("Estoy en 4");
               }
          
           return true;
           }
           else if (tempo.id!=num){
               JOptionPane.showMessageDialog(null,"No existe ese id"); 
                return false;
           }
           
       }  
     
        return false;
    }
   
   
public boolean imprimir(){
    NodoE imprime = inicio;
  
      
 try{   while(imprime.tieneSiguiente()){
        System.out.println(imprime.nombre);
        imprime= imprime.siguiente;
    }
    
    
    System.out.println(imprime.nombre);    
    
    
        
     
    return true;
 }
 
 catch(Exception exception){
    JOptionPane.showMessageDialog(null,"Ya no hay datos");
     return false;
 }

}

public boolean OrdenarP(){
    
    return true;
}        
        
     
}




   

