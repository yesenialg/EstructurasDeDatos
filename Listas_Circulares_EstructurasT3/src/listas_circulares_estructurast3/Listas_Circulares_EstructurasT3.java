/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_circulares_estructurast3;

import java.util.Scanner;
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

//        System.out.println(" LISTAS CIRCULARES SIMPLES ---------- ");
//
//        System.out.println("");
//
//        Simple<Integer> lista1 = new Simple<>();
//
//        System.out.println("LISTA ORDENADA DE MAYOR A MENOR: ");
//
//        try {
//            lista1.addOrdered(555);
//            lista1.addOrdered(222);
//            lista1.addOrdered(888);
//            lista1.addOrdered(111);
//            lista1.addOrdered(333);
//        } catch (Exception ex) {
//            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        try {
//            System.out.println(lista1.showList());
//        } catch (Exception ex) {
//            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        System.out.println("");
//
//        System.out.println("ACTUALIZAR 333 POR 444: ");
//        try {
//            lista1.update(333, 444);
//        } catch (Exception ex) {
//            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        try {
//            System.out.println(lista1.showList());
//        } catch (Exception ex) {
//            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        System.out.println("");
//
//        System.out.println("ELIMINAR EL ELEMENTO 444: ");
//        try {
//            lista1.delete(444);
//        } catch (Exception ex) {
//            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        try {
//            System.out.println(lista1.showList());
//        } catch (Exception ex) {
//            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        System.out.println("");
//
//        System.out.println("LA UNION DE DOS LISTAS: ");
//
//        Simple<Integer> lista2 = new Simple<>();
//
//        try {
//            lista2.addOrdered(333);
//            lista2.addOrdered(444);
//            lista2.addOrdered(555);
//        } catch (Exception ex) {
//            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        System.out.println("Lista 1: ");
//
//        try {
//            System.out.println(lista1.showList());
//        } catch (Exception ex) {
//            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        System.out.println("Lista 2: ");
//
//        try {
//            System.out.println(lista2.showList());
//        } catch (Exception ex) {
//            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        lista1.unirListas(lista2);
//
//        System.out.println("Listas unidas: ");
//
//        try {
//            System.out.println(lista1.showList());
//        } catch (Exception ex) {
//            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        System.out.println("");
//
//        System.out.println(" LISTAS CIRCULARES DOBLES ---------- ");
//
//        System.out.println("");
//
//        System.out.println("LISTA DE MENOR A MAYOR: ");
//
//        Double<Integer> listDouble1 = new Double<>();
//        try {
//            listDouble1.addOrdered(222);
//            listDouble1.addOrdered(444);
//            listDouble1.addOrdered(888);
//            listDouble1.addOrdered(111);
//            listDouble1.addOrdered(333);
//            listDouble1.addOrdered(666);
//            System.out.println(listDouble1.showList());
//        } catch (Exception ex) {
//            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        System.out.println("");
//
//        System.out.println("ELIMINAR EL ELEMENTO 444: ");
//
//        try {
//            listDouble1.delete(444);
//            System.out.println(listDouble1.showList());
//        } catch (Exception ex) {
//            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        System.out.println("");
//
//        System.out.println("ACTUALIZAR EL DATO 888 POR 555: ");
//
//        try {
//            listDouble1.update(888, 555);
//            System.out.println(listDouble1.showList());
//        } catch (Exception ex) {
//            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println("");
//        
//        System.out.println("DIVIDIR LA LISTA EN DOS DESDE 222: ");
//        
//        System.out.println("La lista a dividir es: ");
//        Double<Integer> listDouble2 = new Double<>();
//        try {
//            System.out.println(listDouble1.showList());
//            listDouble1.dividirLista(222, listDouble2);
//            System.out.println("La lista 1 es: ");
//            System.out.println(listDouble1.showList());
//            System.out.println("La lista 2 es: ");
//            System.out.println(listDouble2.showList());
//        } catch (Exception ex) {
//            Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
//        }
////////////////////////////// CASO PRÁCTICO /////////////////////////////////////////// 
        System.out.println("");
        System.out.println("------------------");
        System.out.println("");
        System.out.println("CASO PRACTICO");
        System.out.println("");

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        Double<String> listaReproduccion = new Double<>();

        System.out.println("LISTA DE REPRODUCCION DE VIDEOS");

        while (!salir) {
            System.out.println("1. Agregar video");
            System.out.println("2. Eliminar");
            System.out.println("3. Actualizar");
            System.out.println("4. Ver lista");
            System.out.println("5. Reproduccion automática");
            System.out.println("6. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    String cancionAg;
                    System.out.println("Ingrese el nombre dela nueva cancion: ");
                    cancionAg = sn.nextLine();
                    try {
                        listaReproduccion.addOrdered(cancionAg);
                    } catch (Exception ex) {
                        Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 2:
                    String cancionEl;
                    System.out.println("Ingrese el nombre de la canción a eliminar: ");
                    cancionEl = sn.nextLine();
                    try {
                        listaReproduccion.delete(cancionEl);
                    } catch (Exception ex) {
                        Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 3:
                    String cancionAc,
                     cancionAn;
                    System.out.println("Ingrese el nombre de cancion que quiere actualizar: ");
                    cancionAc = sn.nextLine();
                    System.out.println("Ingrese el nuevo nombre de cancion: ");
                    cancionAn = sn.nextLine();
                    try {
                        listaReproduccion.update(cancionAc, cancionAn);
                    } catch (Exception ex) {
                        Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 4:
                    System.out.println("Lista actual: ");
                    try {
                        listaReproduccion.showList();
                    } catch (Exception ex) {
                        Logger.getLogger(Listas_Circulares_EstructurasT3.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    break;
                case 5:
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 6");
            }
        }

    }

}
