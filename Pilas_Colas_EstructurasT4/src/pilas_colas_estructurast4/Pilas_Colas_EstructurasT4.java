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
        
        LinkedQueue cola = new LinkedQueue();
        
        System.out.println(cola.empty());
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
        
        /////////////////CONVERTIDOR DE BASE///////////////////////////////
        
        ConvertDecimals num = new ConvertDecimals();
        System.out.println(num.toBinary(300));
        System.out.println(num.toOctal(300));
        System.out.println(num.toHexadecimal(300));
        
        
    }
    
}
