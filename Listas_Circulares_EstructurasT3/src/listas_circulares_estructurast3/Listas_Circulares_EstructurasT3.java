/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_circulares_estructurast3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Listas_Circulares_EstructurasT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Simple<Integer> lista1 = new Simple<>();
        lista1.addOrdered(222);
        lista1.addOrdered(111);
        lista1.addOrdered(333);
        
        System.out.println(lista1.showList());
        
        try {
            System.out.println(lista1.Exists(111));
        } catch (Exception ex) {
            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
