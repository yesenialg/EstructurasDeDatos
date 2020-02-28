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
public class Double<T extends Comparable> implements IList<T> {

    DoubleNode<T> head;

    public Double() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    public void add(T d) {
        DoubleNode<T> newNode = new DoubleNode<>(d);
        if (isEmpty()) {
            head = newNode;
            newNode.setNextNode(newNode);
            newNode.setPreviousNode(newNode);
        } else {
            newNode.setPreviousNode(head.getPreviousNode());
            newNode.setNextNode(head);
            head.setPreviousNode(newNode);
            head = newNode;
            head.getPreviousNode().setNextNode(head);

        }
    }

    public void addLast(T d) {
        DoubleNode<T> newNode = new DoubleNode<>(d);
        if (isEmpty()) {
            head = newNode;
            newNode.setNextNode(newNode);
            newNode.setPreviousNode(newNode);
        } else {
            newNode.setPreviousNode(head.getPreviousNode());
            newNode.setNextNode(head);
            head.getPreviousNode().setNextNode(newNode);
            head.setPreviousNode(newNode);
        }
    }

    @Override
    public boolean Exists(T d) {
        DoubleNode<T> current = this.head;
        while (current.getNextNode() != head) {
            if (current.getData() == d) {
                return true;
            }
            current = current.getNextNode();
        }
        return false;
    }

    @Override
    public void addOrdered(T d) throws Exception {
        if (isEmpty() || d.compareTo(head.getData()) == -1) {
            add(d);
        } else if (Exists(d)) {
            throw new Exception("Ya existe ese dato");
        } else {
            DoubleNode<T> current = this.head;
            while (d.compareTo(current.getNextNode().getData()) == 1 && current.getNextNode() != head) {
                current = current.getNextNode();
            }
            if (current == head.getPreviousNode()) {
                addLast(d);
            } else {
                DoubleNode<T> newNode = new DoubleNode<>(d, current, current.getNextNode());
                current.getNextNode().setPreviousNode(newNode);
                current.setNextNode(newNode);
            }
        }
    }

    @Override
    public void delete(T d) throws Exception {
        if (isEmpty() || Exists(d)) {
            throw new Exception("El dato no existe");
        } else {
            DoubleNode<T> current = this.head;
            if (current.getData().equals(d)) {
                head = current.getNextNode();
            }
            while (!current.getData().equals(d)) {
                current = current.getNextNode();
            }
            current.getPreviousNode().setNextNode(current.getNextNode());
            current.getNextNode().setPreviousNode(current.getPreviousNode());
        }
    }

    @Override
    public void update(T dE, T dN) throws Exception {
        if (isEmpty() && Exists(dE)) {
            throw new Exception("El dato no existe ");
        } else {
            DoubleNode<T> current = this.head;
            while (!current.getData().equals(dE)) {
                current = current.getNextNode();
            }
            current.setData(dN);
        }
    }

    @Override
    public String showList() throws Exception {
        String data = "";
        DoubleNode<T> current = this.head;
        do {
            data = data + current.getData() + " ";
            current = current.getNextNode();
        } while (current != head);
        return data;
    }

    public void dividirLista(T d, Double Nlist) throws Exception {
        if (isEmpty() && Exists(d)) {
            throw new Exception("El dato no existe ");
        } else {
            DoubleNode<T> current = this.head;
            while (!current.getData().equals(d)) {
                if (!current.getData().equals(d)) {
                    current = current.getNextNode();
                } else {
                    Nlist.addOrdered(current.getData());
                }
            }
        }
    }
}
