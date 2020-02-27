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
    public void addOrdered(T d) throws Exception{
    }

    @Override
    public void delete(T d) throws Exception{
    }

    @Override
    public void update(T dE, T dN)throws Exception {
    }
    
    @Override
    public String showList() throws Exception{
        String data = "";
        DoubleNode<T> current = this.head;
        do {
            data = data + current.getData() + " ";
            current = current.getNextNode();
        } while (current != head);
        return data;
    }
    
    public void dividirLista(T d){
        
    }
}
