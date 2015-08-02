/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

/**
 *
 * @author Raul
 */
public class ListaE {
    NodoE inicio;
    int tamaño;
    
    public boolean adicionar(String direccion,String nombre){
        if(inicio==null){
        inicio = new NodoE(null,direccion,nombre,null);
        tamaño++;
        return true;
        }
        else{
        NodoE temp = inicio;
        while(temp.tieneSiguiente()){
        temp= temp.getSiguiente();
        }
        temp.setSiguiente(new NodoE(temp,direccion,nombre,null));
        tamaño++;
        return true;
        }  
        
    }
    
    
    
    
}
