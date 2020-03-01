/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas_colas_estructurast4;

/**
 *
 * @author HP
 */
public class LinkedQueue<E> {
    
    private Node<E> head;
    private Node<E> tail;
    
    public LinkedQueue(){
        head = tail = null;
    }
    
    public boolean empty(){
        return head == null && tail == null;
    }
    
    public boolean offer(E e){
        if(empty()){
            Node<E> newNode = new Node<>(e);
            newNode.setNextNode(head);
            head = newNode;
        }else{
            Node<E> newNode = new Node<>(e);
            Node<E> current = head;
            while(current.getNextNode() != null){
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
        return false;
    }
    
    public void add(E e){
        if(empty()){
            Node<E> newNode = new Node<>(e);
            newNode.setNextNode(head);
            head = newNode;
        }else{
            Node<E> newNode = new Node<>(e);
            Node<E> current = head;
            while(current.getNextNode() != null){
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
    }
    
    public void remove()throws Exception{
        if(empty()){
            throw new Exception ("La cola está vacia");
        }else{
            head = head.getNextNode();
        }
    }
    
    public E poll(){
        E a;
        if(empty()){
            return null;
        }else{
            a  = head.getData();
            head = head.getNextNode();
        }
        return a;
    }
    
    public Object element() throws Exception {
        return null;
    }

    public Object peek() {
        return null;
    }
    
    
}
