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
    public boolean Exists(T d) {
        Node<T> current = this.head;

        while (current != null) {
            if (current.getData() == d) {
                return true;
            }
            current = current.getNextNode();
        }

        return false;
    }

    private Node<T> addNode(T d) {
        Node<T> newNode = new Node<>(d);
        if (isEmpty()) {
            head = tail = newNode;
            newNode.setNextNode(newNode);
        } else {
            newNode.setNextNode(head);
            tail.setNextNode(newNode);
        }
        return newNode;
    }

    public void add(T d) {
        head = addNode(d);
    }

    public void addLast(T d) {
        tail = addNode(d);
    }

    @Override
    public void addOrdered(T d) throws Exception {
        Node<T> newNode = new Node<>(d);
        if (isEmpty() || newNode.getData().compareTo(this.head.getData()) == 1) {
            add(d);
        } else {

            Node<T> current = this.head;
            while (current.getNextNode() != head && newNode.getData().compareTo(current.getNextNode().getData()) == 1) {
                current = current.getNextNode();
            }
            if (newNode.getData().compareTo(current.getData()) == 0) {
                throw new Exception("El dato ya existe ");
            }
            if (tail == current) {
                addLast(d);
            } else {
                newNode.setNextNode(current.getNextNode());
                current.setNextNode(newNode);
            }
        }
    }

    @Override
    public void delete(T d) throws Exception {
        if (isEmpty()) {
            throw new Exception("La lista está vacía ");
        } else {
            Node<T> current = this.head;
            Node<T> ttail = this.tail;
            if (current.getData().equals(d)) {
                head = current.getNextNode();
                ttail.setNextNode(current.getNextNode());
            }
            while (current.getNextNode() != head) {
                if (current.getNextNode().getData().equals(d)) {
                    current.setNextNode(current.getNextNode().getNextNode());
                    current = current.getNextNode();
                } else {
                    current = current.getNextNode();
                }
            }

        }
    }

    @Override
    public void update(T dE, T dN) throws Exception {
        if (isEmpty()) {
            throw new Exception("La lista está vacía ");
        } else {
//            if(Exists(dE)){
            Node<T> current = this.head;
            while (current.getNextNode() != head && !current.getData().equals(dE)) {
                current = current.getNextNode();
            }
            current.setData(dN);
//            }else{
//                throw new Exception("El dato no existe ");
//            }
        }
    }

    @Override
    public String showList() throws Exception {
        String data = "";
        Node<T> current = this.head;
        do {
            data = data + current.getData() + " ";
            current = current.getNextNode();
        } while (current != head);
        return data;
    }
    
    public void unirListas(T list){
        
    }

}
