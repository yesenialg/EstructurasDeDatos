/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_simples_estructurast1;

import java.util.logging.Level;
import java.util.logging.Logger;






/**
 *
 * @author HP
 */
public class Listas_Simples_EstructurasT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        //Insertar nuevos nodos ordenados de mayor a menor e impedir datos duplicados (si el dato ya se encuentra en la lista, no ingresarlo y lanzar excepción).
        OperacionesLista<Integer> miLista = new OperacionesLista<>();
        try {
            miLista.agregarOrdenado(11);
            miLista.agregarOrdenado(55);
            miLista.agregarOrdenado(44);
            miLista.agregarOrdenado(99);
            miLista.agregarOrdenado(88);
        } catch (Exception ex) {
            Logger.getLogger(Listas_Simples_EstructurasT1.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Mostrar todos los datos de la lista.
        System.out.println("DATOS DE LA LISTA ORDENADA: ");
        System.out.println(miLista.mostrarDatos());
        
        System.out.println("");
        
        //Insertar nuevos nodos al final de la lista (si el dato ya se encuentra en la lista, no ingresarlo y lanzar excepción).
        try {
            miLista.agregarFinal(1);
            miLista.agregarFinal(3);
            miLista.agregarFinal(4);
            miLista.agregarFinal(9);
            miLista.agregarFinal(8);
        } catch (Exception ex) {
            Logger.getLogger(Listas_Simples_EstructurasT1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Mostrar todos los datos de la lista.
        System.out.println("LISTA CON DATOS AGREGADOS AL FINAL: ");
        System.out.println(miLista.mostrarDatos());
            
        System.out.println("");
        
        //Insertar nuevos nodos después de un dato especificado por el usuario (si no se encuentra el dato, lanzar excepción).
        System.out.println("INGRESAR DATO ESPECIFICO: ");
        try {
            miLista.agregarDespuesDeEspecifico(22, 11);
            System.out.println(miLista.mostrarDatos());
        } catch (Exception ex) {
            Logger.getLogger(Listas_Simples_EstructurasT1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("");
        
        //Mostrar la cantidad de datos.
        System.out.println("CANTIDAD DE DATOS: ");
        System.out.println(miLista.mostrarCantidadDatos());
        
        System.out.println("");
        
        //Mostrar el dato mayor.
        System.out.println("DATO MAYOR: ");
        try {
            System.out.println(miLista.datoMayor());
        } catch (Exception ex) {
            Logger.getLogger(Listas_Simples_EstructurasT1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("");
        
        //Mostrar el dato menor.
        System.out.println("DATO MENOR: ");
        try {
            System.out.println(miLista.datoMenor());
        } catch (Exception ex) {
            Logger.getLogger(Listas_Simples_EstructurasT1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("");
        
        //Mostrar el promedio de datos.
        System.out.println("PROMEDIO DE DATOS: ");
        try {
            System.out.println(miLista.promedioDatos());
        } catch (Exception ex) {
            Logger.getLogger(Listas_Simples_EstructurasT1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("");
        
        //Determinar si un dato ingresado por el usuario existe en la lista.
        System.out.println("EL NUMERO EXISTE?: ");
        System.out.println(miLista.datoExistente(99));
        
        System.out.println("");
        
        //Eliminar un nodo con un dato específico ingresado por el usuario.
        System.out.println("ELIMINAR DATO: ");
        System.out.println("Lista antes de eliminar: ");
        System.out.println(miLista.mostrarDatos());
        miLista.eliminarEspecifico(99);
        System.out.println("Lista después de eliminar: ");
        System.out.println(miLista.mostrarDatos());
        
        System.out.println("");
        
        //Modificar el dato de un nodo especifico (solicitar el dato anterior).
        System.out.println("MODIFICAR DATO: ");
        try {
            System.out.println("Lista antes de modificar: ");
            System.out.println(miLista.mostrarDatos());
            miLista.modificarDato(10, 11);
            System.out.println("Lista después de modificar: ");
            System.out.println(miLista.mostrarDatos());
        } catch (Exception ex) {
            Logger.getLogger(Listas_Simples_EstructurasT1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("");
        
        //Determinar si otra lista tiene el mismo tamaño.
        System.out.println("COMPARAR TAMAÑO DE LISTAS: ");
        System.out.println("Lista A: ");
        OperacionesLista<Integer> listaA = new OperacionesLista<>();
        try {
            listaA.agregarOrdenado(11);
            listaA.agregarOrdenado(55);
            listaA.agregarOrdenado(44);
        } catch (Exception ex) {
            Logger.getLogger(Listas_Simples_EstructurasT1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(listaA.mostrarDatos());
        
        System.out.println("Lista B: ");
        OperacionesLista<Integer> listaB = new OperacionesLista<>();
        try {
            listaB.agregarOrdenado(11);
            listaB.agregarOrdenado(55);
            listaB.agregarOrdenado(44);
        } catch (Exception ex) {
            Logger.getLogger(Listas_Simples_EstructurasT1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(listaB.mostrarDatos());
        
        System.out.println("Son del mismo tamaño?: ");
        System.out.println(listaA.listaMismoTamano(listaB));
        
        
        System.out.println("");
        
        //Determinar si otra lista es igual.
        System.out.println("COMPARAR IGUALDAD DE LISTAS: ");
        System.out.println("Lista A: ");
        System.out.println(listaA.mostrarDatos());
        System.out.println("Lista B: ");
        System.out.println(listaB.mostrarDatos());
        System.out.println("Son iguales?: ");
        System.out.println(listaA.mismaLista(listaB));
        
    }

}
