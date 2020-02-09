/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_simples_estructurast1;

import java.util.logging.Level;
import java.util.logging.Logger;


/* Mostrar la cantidad de datos.
Mostrar el dato mayor.
Mostrar el dato menor.
Mostrar el promedio de datos.
Determinar si un dato ingresado por el usuario existe en la lista.
Insertar nuevos nodos al final de la lista (si el dato ya se encuentra en la lista, no ingresarlo y lanzar excepción).
Insertar nuevos nodos ordenados de mayor a menor e impedir datos duplicados (si el dato ya se encuentra en la lista, no ingresarlo y lanzar excepción).
Eliminar un nodo con un dato específico ingresado por el usuario.
Insertar nuevos nodos después de un dato especificado por el usuario (si no se encuentra el dato, lanzar excepción).
Modificar el dato de un nodo especifico (solicitar el dato anterior).
Determinar si otra lista tiene el mismo tamaño.
Determinar si otra lista es igual.*/

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

        //Mostrar todos los datos de la lista.
        OperacionesLista<Integer> ListaOrdenada = new OperacionesLista<>();
            ListaOrdenada.agregarFinal(11);
            ListaOrdenada.agregarFinal(33);
            ListaOrdenada.agregarFinal(4);
            ListaOrdenada.agregarFinal(99);
            ListaOrdenada.agregarFinal(88);
            ListaOrdenada.agregarFinal(11);
        
        

        System.out.println(ListaOrdenada.mostrarDatos());
        
        
        try {
            //Integer a = 444, b = 33;
            boolean a = ListaOrdenada.datoExistente(33);
        } catch (Exception ex) {
            Logger.getLogger(Listas_Simples_EstructurasT1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        System.out.println(ListaOrdenada.mostrarDatos());
    }

}
