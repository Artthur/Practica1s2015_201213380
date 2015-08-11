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
public class Matriz {
    public NodoM raiz;
    
// NodoM(NodoM anterior,NodoM arriba,String nombre,->
//<- BufferedImage imagen,int id,int id2,int x, int y,NodoM abajo,NodoM siguiente)   
    
public void adicionarFila(){
    if (raiz == null) {
        
raiz = new NodoM(0,0);
        }
    else{
            NodoM aux1 = raiz;
            while (aux1.abajo != null) {
                aux1 = aux1.abajo;
            }
            aux1.abajo = new NodoM(aux1.x, aux1.y + 1);
            aux1.abajo.arriba = aux1;
            insertarenFila(aux1, aux1.abajo);
    }
}
    
public void insertarenFila(NodoM primero, NodoM segundo) {
        if (primero.derecha != null) {
            segundo.derecha = new NodoM(segundo.x+ 1, segundo.y);
            segundo.derecha.izquierda = segundo;
            primero.derecha.abajo = segundo.derecha;
            segundo.derecha.arriba = primero.derecha;
            insertarenFila(primero.derecha, segundo.derecha);
        }
    }  
    
public void adicionarColumna() {
        if (raiz == null) {
            raiz = new NodoM(0, 0);
        } else {
            NodoM aux1 = raiz;
            while (aux1.derecha != null) {
                aux1 = aux1.derecha;
            }
            aux1.derecha = new NodoM(aux1.x + 1, aux1.y);
            aux1.derecha.izquierda = aux1;
            insertarenColumna(aux1, aux1.derecha);
        }
    } 

public void insertarenColumna(NodoM primero, NodoM segundo){
    if (primero.abajo != null) {
            segundo.abajo = new NodoM(segundo.x, segundo.y + 1);
            segundo.abajo.arriba = segundo;
            primero.abajo.derecha = segundo.abajo;
            segundo.abajo.izquierda = primero.abajo;
            insertarenColumna(primero.abajo, segundo.abajo);
        }
    
}

public void adiosFila(int indice){
    NodoM Aux = raiz;
        while (Aux != null && Aux.y != indice) {
            Aux = Aux.abajo;
        }
        if (Aux != null) {
            if (Aux.arriba != null && Aux.abajo != null) {
                while(Aux!=null){
                    Aux.abajo.arriba = Aux.arriba;
                    Aux.arriba.abajo = Aux.abajo;
                    Aux.setVisible(false);
                    Aux=Aux.derecha;
                }
            } else {
                if (Aux.arriba == null) {
                    raiz = Aux.abajo;
                    while (Aux != null) {
                        Aux.abajo.arriba = null;
                        Aux.setVisible(false);
                        Aux = Aux.derecha;
                    }
                }else {
                    while (Aux != null) {
                        Aux.arriba.abajo = null;
                        Aux.setVisible(false);
                        Aux = Aux.derecha;
                    }
                }
            }
        }
}

public void adiosColumna(int indice){
    NodoM Aux = raiz;
        while (Aux != null && Aux.x != indice) {
            Aux = Aux.derecha;
        }
        if (Aux != null) {
            if (Aux.derecha != null && Aux.izquierda != null) {
                while(Aux!=null){
                    Aux.derecha.izquierda=Aux.izquierda;
                    Aux.izquierda.derecha=Aux.derecha;
                    Aux.setVisible(false);
                    Aux=Aux.abajo;
                }
            } else {
                if (Aux.izquierda == null) {
                    raiz = Aux.derecha;
                    while (Aux != null) {
                        Aux.derecha.izquierda = null;
                        Aux.setVisible(false);
                        Aux = Aux.abajo;
                    }
                }else {
                    while (Aux != null) {
                        Aux.izquierda.derecha = null;
                        Aux.setVisible(false);
                        Aux = Aux.abajo;
                    }
                }
            }
        }
    }
}
    
    
    
    
    

