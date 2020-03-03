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
public class StackInLinkedList {

    private DoubleNode head;
    private DoubleNode tail;
    private DoubleNode inicioPila1;
    private DoubleNode inicioPila2;

    public StackInLinkedList() {
        head = tail = null;

    }

    public Object pushPila1(Object d) {
        if (tail == null) {
            tail = inicioPila1 = new DoubleNode<>(d);
            if (inicioPila2 != null) {
                inicioPila1.setPreviousNode(inicioPila2);
                inicioPila2.setNextNode(inicioPila1);
            }
        } else {
            tail = new DoubleNode<>(d, tail, null);
            tail.getPreviousNode().setNextNode(tail);
        }
        return d;
    }

    public Object pushPila2(Object d) {
        if (head == null) {
            head = inicioPila2 = new DoubleNode<>(d);
            if (inicioPila1 != null) {
                inicioPila1.setPreviousNode(inicioPila2);
                inicioPila2.setNextNode(inicioPila1);
            }
        } else {
            head = new DoubleNode<>(d, null, head);
            head.getNextNode().setPreviousNode(head);
        }
        return d;
    }

    public Object popPila1() {
        if (tail == null) {
            return null;
        } else if (tail.getPreviousNode() == null) {
            Object temp = tail.getData();
            tail = inicioPila1 = null;
            return temp;
        } else if (tail.getPreviousNode() == head) {
            Object temp = tail.getData();
            tail = inicioPila1 = null;
            head.setNextNode(null);
            return temp;
        } else {
            Object temp = tail.getData();
            tail = tail.getPreviousNode();
            tail.setNextNode(null);
            return temp;
        }
    }

    public Object popPila2() {
        if (head == null) {
            return null;
        } else if (head.getNextNode() == null) {
            Object temp = head.getData();
            head = inicioPila2 = null;
            return temp;
        }else if (head.getNextNode() == tail) {
            Object temp = head.getData();
            head = inicioPila2 = null;
            tail.setNextNode(null);
            return temp;
        }else {
            Object temp = head.getData();
            head = head.getNextNode();
            head.setPreviousNode(null);
            return temp;
        }
    }

    public Object peekPila1() {
        if (tail == null) {
            return null;
        } else {
            return tail.getData();
        }
    }

    public Object peekPila2() {
        if (head == null) {
            return null;
        } else {
            return head.getData();
        }
    }
}
