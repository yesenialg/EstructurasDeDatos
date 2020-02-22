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
public class Simple<T extends Number & Comparable> implements IList<T> {

    Node<T> head;
    Node<T> tail;

    public Simple() {
        head = tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean Exists(T d) throws Exception {
        boolean exis = false;
        if (isEmpty()) {
            throw new Exception("La lista esta vacia");
        } else {
            Node<T> current = this.head;

            while (current.getNextNode() != tail) {
                if (current.getData().equals(d)) {
                    exis = true;
                }
                current = current.getNextNode();
            }
            if (current.getData().equals(d)) {
                exis = true;
            }
            return exis;
        }
    }

    @Override
    public void addOrdered(T d) {
        Node<T> newNode = new Node<>(d);
        if (isEmpty()) {
            head = tail = newNode;
            newNode.setNextNode(newNode);
        } else {
            Node<T> current = this.head;
            while (current.getNextNode() != tail && d.compareTo(current.getNextNode().getData()) == -1) {
                current = current.getNextNode();
            }
            newNode.setNextNode(current.getNextNode());
            current.setNextNode(newNode);
            if (current == tail) {
                tail = newNode;
            }
        }
    }

    @Override
    public void delete(T d) {

    }

    @Override
    public void update(T dE, T dN) {
    }

    @Override
    public String showList() {
        String data = "";
        Node<T> current = this.head;
        do {
            data = data + current.getData() + " ";
            current = current.getNextNode();
        } while (current != head);
        return data;
    }

}
