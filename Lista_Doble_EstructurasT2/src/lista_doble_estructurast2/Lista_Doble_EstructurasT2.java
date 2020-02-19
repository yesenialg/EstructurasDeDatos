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
        
        //Listas para aprobados y reprobados
        DoublyLinkedList Aprobados = new DoublyLinkedList();
        DoublyLinkedList Reprobados = new DoublyLinkedList();

        //Insertar estudiantes aprobados a la cabeza de la lista, los demas en la cola
        DoublyLinkedList EstructuraDatos = new DoublyLinkedList();
        try {
            EstructuraDatos.InsertarCondiciones(estudiante4);
            EstructuraDatos.InsertarCondiciones(estudiante2);
            EstructuraDatos.InsertarCondiciones(estudiante3);
            EstructuraDatos.InsertarCondiciones(estudiante1);
            EstructuraDatos.InsertarCondiciones(estudiante5);
        } catch (Exception ex) {
            Logger.getLogger(Lista_Doble_EstructurasT2.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Lista ordenada por condiciones: ");
        //Mostrar lista
        System.out.println(EstructuraDatos.MostrarLista());

        System.out.println("");

        //Eliminar especifico, si no está lanzar excepcion
        try {
            EstructuraDatos.EliminarEspecifico(estudiante1);
        } catch (Exception ex) {
            Logger.getLogger(Lista_Doble_EstructurasT2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Eliminar estudiante 11111: ");
        //Mostrar lista
        System.out.println(EstructuraDatos.MostrarLista());

        System.out.println("");

        //Insertar despues de especifico, si el especifico no existe, lanzar excepcion 
        try {
            EstructuraDatos.InsertarDespuesEspecifico(estudiante3, estudiante1);
        } catch (Exception ex) {
            Logger.getLogger(Lista_Doble_EstructurasT2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Insertar 11111 despues de 33333: ");
        //Mostrar lista
        System.out.println(EstructuraDatos.MostrarLista());
        
        System.out.println("");

        //Avisar si un dato existe
        System.out.println("Revisar si el dato 66666 existe: ");
        System.out.println(EstructuraDatos.DatoExistente(estudiante6));
        
        System.out.println("");
        
        //Mostrar studiantes que viven en el mismo barrio
        System.out.println("Los estudiantes que viven en el barrio idicado (Belen) son: ");
        System.out.println(EstructuraDatos.MostrarBarrioIgual("Belen"));

        System.out.println("");
        
        //Buscar estudiante por cedula
        System.out.println("Buscar estudiante 44444: ");
        try {
            System.out.println(EstructuraDatos.mostrarEstudiante("44444"));
        } catch (Exception ex) {
            Logger.getLogger(Lista_Doble_EstructurasT2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("");

        //Crear dos listas, una con los estudiantes aprobados y otra con los reprobados
        EstructuraDatos.DividirAprobReprob(Aprobados, Reprobados);
        System.out.println("Estudiantes abrobados: ");
        System.out.println(Aprobados.MostrarLista());
        System.out.println("");
        System.out.println("Estudiantes reprobados: ");
        System.out.println(Reprobados.MostrarLista());
    }

}
