/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_doble_estructurast2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Lista_Doble_EstructurasT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear estudiantes
        Estudiante estudiante1 = new Estudiante("11111", "Juan", "Villa Paula", 4.0);
        Estudiante estudiante2 = new Estudiante("22222", "Andres", "Laureles", 3.0);
        Estudiante estudiante3 = new Estudiante("33333", "Angela", "Belen", 4.5);
        Estudiante estudiante4 = new Estudiante("44444", "Sebastian", "Loma los Bernal", 2.5);
        Estudiante estudiante5 = new Estudiante("55555", "Perla", "Belen", 1.0);
        Estudiante estudiante6 = new Estudiante("66666", "Pedro", "Belen", 1.0);

        //////////////////////////////////Crear lista rdenada sin repetir estudiantes///////////////////////////////////////////////////////////
        DoublyLinkedList EstructuraDatos = new DoublyLinkedList();
        try {
            EstructuraDatos.InsertarCola(estudiante4);
            EstructuraDatos.InsertarCola(estudiante2);
            EstructuraDatos.InsertarCola(estudiante3);
            EstructuraDatos.InsertarCola(estudiante1);
            EstructuraDatos.InsertarCola(estudiante5);
        } catch (Exception ex) {
            Logger.getLogger(Lista_Doble_EstructurasT2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Mostrar lista
        System.out.println(EstructuraDatos.MostrarLista());
        
        //Eliminar especifico, si no está lanzar excepcion
        try {
            EstructuraDatos.EliminarEspecifico(estudiante1);
        } catch (Exception ex) {
            Logger.getLogger(Lista_Doble_EstructurasT2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Mostrar lista
        System.out.println(EstructuraDatos.MostrarLista());
        
        //Insertar despues de especifico, si el especifico no existe, lanzar excepcion 
        try {
            EstructuraDatos.InsertarDespuesEspecifico(estudiante3, estudiante1);
        } catch (Exception ex) {
            Logger.getLogger(Lista_Doble_EstructurasT2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Mostrar lista
        System.out.println(EstructuraDatos.MostrarLista());
                
        //Avisar si un dato existe
            System.out.println(EstructuraDatos.DatoExistente(estudiante6));
        
        //Mostrar studiantes que viven en el mismo barrio
        System.out.println("Los estudiantes que viven en el barrio idicado (Belen) son: ");
        System.out.println(EstructuraDatos.MostrarBarrioIgual("Belen"));
        
        //Buscar estudiante por cedula
        try {
            System.out.println(EstructuraDatos.mostrarEstudiante("44444"));
        } catch (Exception ex) {
            Logger.getLogger(Lista_Doble_EstructurasT2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
