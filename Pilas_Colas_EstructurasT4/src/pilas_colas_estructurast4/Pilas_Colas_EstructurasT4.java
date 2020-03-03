/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas_colas_estructurast4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Pilas_Colas_EstructurasT4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /////////////////COLA CON NODOS///////////////////////////////
        
        System.out.println("COLA CON NODOS");
        LinkedQueue cola = new LinkedQueue();

        cola.offer(111);
        cola.offer(222);
        cola.offer(333);
        System.out.println("El proximo nodo es " + cola.peek());
        cola.add(444);
        cola.add(555);
        cola.add(666);
        try {
            cola.remove();
            cola.remove();
            cola.remove();
        } catch (Exception ex) {
            Logger.getLogger(Pilas_Colas_EstructurasT4.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El eliminado fue " + cola.poll());
        System.out.println("El eliminado fue " + cola.poll());
        System.out.println("El eliminado fue " + cola.poll());
        System.out.println("El eliminado fue " + cola.poll());
        System.out.println("El proximo nodo es " + cola.peek());
        
        ///////////////CONVERTIDOR DE BASE///////////////////////////////
        
        System.out.println("");
        System.out.println("CONVERTIDOR DE BASE");
        ConvertDecimals num = new ConvertDecimals();
        
        System.out.println("El numero 300 en binario es: " + num.toBinary(300));
        System.out.println("El numero 240 en octal es: " + num.toOctal(240));
        System.out.println("El numero 45 en hexadecinal es: " + num.toHexadecimal(45));

        /////////////////EVALUAR EXPRESION MATEMATICA///////////////////////////////
        
        System.out.println("");
        System.out.println("EVALUAR EXPRESION MATEMATICA");
        Check exp = new Check();
        
        System.out.println("La expresion {[(5+5)/5]+2} esta balanceada?: " + exp.checkBalanced("{[(5+5)/5]+2}"));
        
        ///////////////DOS PILAS EN UN ARRAY///////////////////////////////
        
        System.out.println("");
        System.out.println("DOS PILAS EN UN ARRAY");
        StackInArray array = new StackInArray(6);

        array.pushPila2(111);
        array.pushPila2(222);
        array.pushPila2(333);
        System.out.println("El numero sacado de la pila 2 es: " + array.popPila2());
        System.out.println("El siguiente numero de la pila 2 es: " + array.peekPila2());
        System.out.println("El numero ingresado en la pila 2 es: " + array.pushPila2(444));
        System.out.println("El numero ingresado en la pila 1 es: " + array.pushPila1(555));
        System.out.println("El siguiente numero de la pila 1 es: " + array.peekPila1());
        System.out.println("El numero ingresado en la pila 1 es: " + array.pushPila1(666));
        System.out.println("El numero sacado de la pila 1 es: " + array.popPila1());
        System.out.println("El siguiente numero de la pila 1 es: " + array.peekPila1());
        System.out.println("El numero ingresado en la pila 1 es: " + array.pushPila1(777));
        System.out.println("El numero ingresado en la pila 1 es: " + array.pushPila1(888));
        System.out.println("El numero ingresado en la pila 1 es: " + array.pushPila1(999));
        
        /////////////////DOS PILAS EN UNA LISTA ENLAZADA///////////////////////////////
        
        System.out.println("");
        System.out.println("DOS PILAS EN UNA LISTA ENLAZADA");
        StackInLinkedList list = new StackInLinkedList();

        System.out.println("El numero a ingresar a la pila 1 es: " + list.pushPila1(111));
        System.out.println("El numero a ingresar a la pila 1 es: " + list.pushPila1(222));
        System.out.println("El numero a ingresar a la pila 1 es: " + list.pushPila1(333));
        System.out.println("El numero a ingresar a la pila 1 es: " + list.pushPila1(444));   
        System.out.println("El numero a ingresar a la pila 2 es: " + list.pushPila2(555));
        System.out.println("El siguiente numero de la pila 1 es: " + list.peekPila1());
        System.out.println("El siguiente numero de la pila 2 es: " + list.peekPila2());
        System.out.println("El numero a ingresar a la pila 2 es: " + list.pushPila2(666));
        System.out.println("El numero a ingresar a la pila 2 es: " + list.pushPila2(777));
        System.out.println("El numero a ingresar a la pila 2 es: " + list.pushPila2(888));   
        System.out.println("El numero eliminado de la pila 1 es: " + list.popPila1());
        System.out.println("El numero eliminado de la pila 2 es: " + list.popPila2());    
        System.out.println("El numero eliminado de la pila 1 es: " + list.popPila1());
        System.out.println("El numero eliminado de la pila 2 es: " + list.popPila2());    
        System.out.println("El numero eliminado de la pila 1 es: " + list.popPila1());
        System.out.println("El numero eliminado de la pila 2 es: " + list.popPila2()); 
        System.out.println("El numero eliminado de la pila 1 es: " + list.popPila1());
        System.out.println("El numero eliminado de la pila 2 es: " + list.popPila2());    
        System.out.println("El numero eliminado de la pila 1 es: " + list.popPila1());
        System.out.println("El numero eliminado de la pila 2 es: " + list.popPila2()); 
        System.out.println("");

    }

}
