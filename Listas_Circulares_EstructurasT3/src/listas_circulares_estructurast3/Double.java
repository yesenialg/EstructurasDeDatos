/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_circulares_estructurast3;

/**
 *
 * @author HP
 */
public class Double<T> implements IList<T>{ 

    DoubleNode<T> head;

    public Double() {
        head = null;
    }
    
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean Exists(T d) {
        return true;
    }

    @Override
    public void addOrdered(T d) {
    }

    @Override
    public void delete(T d) {
    }

    @Override
    public void update(T dE, T dN) {
    }

    @Override
    public String showList() {
        return "";
    }
    
}
