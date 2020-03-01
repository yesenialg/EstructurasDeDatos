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
public class Node<E> {

    private E data;
    private Node<E> nextNode;

    public Node(E d) {
        this.data = d;
        nextNode = null;
    }

    public Node(E d, Node<E> nextNode) {
        this.data = d;
        this.nextNode = nextNode;
    }

    /**
     * @return the data
     */
    public E getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(E data) {
        this.data = data;
    }

    /**
     * @return the nextNode
     */
    public Node getNextNode() {
        return nextNode;
    }

    /**
     * @param nextNode the nextNode to set
     */
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
