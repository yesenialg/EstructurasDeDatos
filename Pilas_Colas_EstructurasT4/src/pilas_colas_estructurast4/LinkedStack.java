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
public class LinkedStack<E> {

    private Node<E> top;
    private int sizeStack;

    public LinkedStack() {
        top = null;
        sizeStack = 0;
    }

    public boolean empty() {
        return top == null;
    }

    public E peek() {
        return (empty()) ? null : top.getData();
    }

    public E pop() {
        if (empty()) {
            return null;
        } else {
            E dataTemp = top.getData();
            top = (top.getNextNode() == null) ? null : top.getNextNode();
            sizeStack--;
            return dataTemp;
        }
    }

    public E push(E item) {
        sizeStack++;
        top = new Node<E>(item, top);
        return item;
    }
}
