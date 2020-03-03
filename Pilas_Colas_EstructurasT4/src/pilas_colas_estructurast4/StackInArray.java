/*
 * To change this license toper, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas_colas_estructurast4;

/**
 *
 * @author HP
 */
public class StackInArray {
    
    private Object[] data;
    private int max;
    private int top;
    private int a;

    public StackInArray(int n) {
        a = n;
        max = n;
        top = 0;
        data = new Object[n];
    }
    
    public boolean empty() {
        return top == 0 && max == a;
    }

    public Object peekPila1() {
        return data[top - 1];
    }
    
    public Object peekPila2() {
        return data[max];
    }

    public Object popPila1() {
        if (empty()) {
            return null;
        } else {
            Object dataTemp = data[--top];
            data[top] = null;
            return dataTemp;
        }
    }
    
    public Object popPila2() {
        if (empty()) {
            return null;
        } else {
            Object dataTemp = data[max];
            data[max] = null;
            max++;
            return dataTemp;
        }
    }

    public Object pushPila1(Object item) {

        if (top == max) {
            return null;
        } else {
            data[top++] = item;
            return item;
        }
    }
    
    public Object pushPila2(Object item) {

        if (top == max) {
            return null;
        } else {
            data[--max] = item;
            return item;
        }
    }
}
