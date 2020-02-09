
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_simples_estructurast1;

/**
 *
 * @author HP
 */
public class Nodo<T> {
        private T dato;
        private Nodo<T> siguienteNodo;
    
    public Nodo(T d){
        this.dato = d;
        siguienteNodo = null;
    }
    
    public T obtenerDato(){
        return dato;
    }
    
    public void asignarDato (T d){
        this.dato = d;
    }
    
    public Nodo obtenerSiguienteNodo(){
        return siguienteNodo;
    }
    
    public void asignarSiguienteNodo(Nodo siguienteNodo){
        this.siguienteNodo = siguienteNodo;
    }
}
