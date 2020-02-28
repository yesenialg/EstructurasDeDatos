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

        System.out.println("LISTA ORDENADA DE MAYOR A MENOR: ");

        try {
            lista1.addOrdered(555);
            lista1.addOrdered(222);
            lista1.addOrdered(888);
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

        System.out.println("LA UNION DE DOS LISTAS: ");

        Simple<Integer> lista2 = new Simple<>();

        try {
            lista2.addOrdered(333);
            lista2.addOrdered(444);
            lista2.addOrdered(555);
        } catch (Exception ex) {
            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Lista 1: ");

        try {
            System.out.println(lista1.showList());
        } catch (Exception ex) {
            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Lista 2: ");

        try {
            System.out.println(lista2.showList());
        } catch (Exception ex) {
            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
        }

        lista1.unirListas(lista2);

        System.out.println("Listas unidas: ");

        try {
            System.out.println(lista1.showList());
        } catch (Exception ex) {
            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("");

        System.out.println(" LISTAS CIRCULARES DOBLES ---------- ");
        
        System.out.println("");
        
        System.out.println("LISTA DE MENOR A MAYOR: ");
        
            Double<Integer> listDouble1 = new Double<>();
        try {
            listDouble1.addOrdered(222);
            listDouble1.addOrdered(444);
            listDouble1.addOrdered(888);
            listDouble1.addOrdered(111);
            listDouble1.addOrdered(333);
            System.out.println(listDouble1.showList());
        } catch (Exception ex) {
            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        System.out.println("");

        System.out.println("ELIMINAR EL ELEMENTO 444: ");
        
        try {
            listDouble1.delete(444);
            System.out.println(listDouble1.showList());
        } catch (Exception ex) {
            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("");

        System.out.println("ACTUALIZAR EL DATO 888 POR 555: ");
        
        try {
            listDouble1.update(888, 555);
            System.out.println(listDouble1.showList());
        } catch (Exception ex) {
            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("DIVIDIR LA LISTA EN DOS: ");
        
        Double<Integer> listDouble2 = new Double<>();
        try {
            listDouble1.dividirLista(333, listDouble2);
            System.out.println(listDouble1.showList());
        } catch (Exception ex) {
            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
