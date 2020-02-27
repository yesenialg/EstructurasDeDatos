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

        
        System.out.println(" LISTAS CIRCULARES SIMPLES ---------- ");
        
        System.out.println("");
        
        Simple<Integer> lista1 = new Simple<>();
        
        System.out.println("LISTA ORDENADA: ");
        
        try {
            lista1.addOrdered(222);
            lista1.addOrdered(111);
            lista1.addOrdered(333);
        } catch (Exception ex) {
            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            System.out.println(lista1.showList());
        } catch (Exception ex) {
            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("");
        
        System.out.println("ACTUALIZAR 333 POR 444: ");
        try {
            lista1.update(333, 444);
        } catch (Exception ex) {
            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            System.out.println(lista1.showList());
        } catch (Exception ex) {
            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("");
        
        System.out.println("ELIMINAR EL ELEMENTO 444: ");
        try {
            lista1.delete(444);
        } catch (Exception ex) {
            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            System.out.println(lista1.showList());
        } catch (Exception ex) {
            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("");
        
        System.out.println(" LISTAS CIRCULARES DOBLES ---------- ");
    }

}
