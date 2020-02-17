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
public class DoublyLinkedList<T extends Estudiante> implements Lista<Estudiante> {

    private Nodo<Estudiante> head;
    private Nodo<Estudiante> tail;
//    public DoublyLinkedList Aprobados = new DoublyLinkedList();
//    public DoublyLinkedList Reprobados = new DoublyLinkedList();
    
    @Override
    public boolean DatoExistente(Estudiante estBuscar){
        boolean encontrado = false;
        Nodo<Estudiante> actual = this.head.obtenerSiguiente();
        while(actual != null && encontrado != true){
            if (estBuscar == actual.obtenerDato()){
                encontrado = true;
            }else{
                actual = actual.obtenerSiguiente();
            }
        }
        return encontrado;
    }

    @Override
    public void InsertarOrdenado(Estudiante est) throws Exception {
        if(estaVacia() || est.getCedula().compareTo(head.obtenerDato().getCedula()) == -1){
            InsertarCabeza(est);
            return;
        }
        if(est.getCedula().compareTo(tail.obtenerDato().getCedula()) == 1){
            InsertarCola(est);
            return;
        }
        Nodo<Estudiante> actual = head.obtenerSiguiente();
        Nodo<Estudiante> nNodo;
        while(actual.obtenerDato().getCedula().compareTo(est.getCedula()) == -1){
            if(actual.obtenerDato().getCedula() == est.getCedula()){
                throw new Exception ("La cedula a ingresar ya existe");
            }
            actual = actual. obtenerSiguiente(); 
        }
        nNodo = new Nodo<>(est, actual.obtenerAnterior(), actual);
        actual.obtenerAnterior().asignarSiguiente(nNodo);
        actual.asignarAnterior(nNodo);
        
//        if (estaVacia() || est.getCedula().compareTo(head.obtenerDato().getCedula()) == 1) {
//            InsertarCabeza(est);
//            return;
//        }
//        if (est.getCedula().compareTo(tail.obtenerDato().getCedula()) == -1) {
//            InsertarCola(est);
//            return;
//        }
//        Nodo<Estudiante> nuevoNodo;
//        if(head.obtenerSiguiente() == null){
//            nuevoNodo = new Nodo<>(est,null, head);
//            head.asignarAnterior(nuevoNodo);
//        }else{
//            Nodo<Estudiante> actual = head.obtenerSiguiente();
//            while (actual.obtenerDato().getCedula().compareTo(est.getCedula())==1) {            
//                actual=actual.obtenerSiguiente();
//            }
//            nuevoNodo = new Nodo<>(est,actual.obtenerAnterior(),actual);
//            actual.obtenerAnterior().asignarSiguiente(nuevoNodo);
//            actual.asignarAnterior(nuevoNodo);
//        }
    }

    @Override
    public void EliminarEspecifico(Estudiante estEliminar) throws Exception {
        Nodo<Estudiante> actual = this.head;
        Nodo<Estudiante> cola = this.tail;
        if(actual.obtenerDato() == estEliminar ){
            actual.obtenerSiguiente().asignarAnterior(null);
            head = actual.obtenerSiguiente();
        }else if(tail.obtenerDato() == estEliminar){
            cola.obtenerAnterior().asignarSiguiente(null);
            tail = cola.obtenerAnterior();
        }else {
            while (actual != null){
                if(actual.obtenerDato().equals(estEliminar)){
                    actual.obtenerAnterior().asignarSiguiente(actual.obtenerSiguiente());
                    actual.obtenerSiguiente().asignarAnterior(actual.obtenerAnterior());
                }
                actual = actual.obtenerSiguiente();
            }
        }
    }

    @Override
    public void InsertarDespuesEspecifico(Estudiante especifico, Estudiante est) throws Exception {
        Nodo<Estudiante> actual = this.head;
        Nodo<Estudiante> cola = this.tail;
        Nodo <Estudiante> nNodo; 
        if(cola.obtenerDato() == especifico){
            nNodo = new Nodo<>(est, cola, null);
            cola.asignarSiguiente(nNodo);
        }else if(actual.obtenerDato() == especifico){
            nNodo = new Nodo<>(est, actual, actual.obtenerSiguiente());
            actual.asignarSiguiente(nNodo);
            head = actual;
        }else{
            while (actual != null){
                if(actual.obtenerDato() == especifico){
                    nNodo = new Nodo<>(est, actual, actual.obtenerSiguiente());
                    actual.asignarSiguiente(nNodo);
                }
                actual = actual.obtenerSiguiente();
            }
        }
    }

    @Override
    public void InsertarCola(Estudiante est) throws Exception {
        if (estaVacia()) {
            head = tail = new Nodo<>(est);
        } else {
            tail = new Nodo<>(est, tail, null);
            tail.obtenerAnterior().asignarSiguiente(tail);
        }
    }

    @Override
    public void InsertarCabeza(Estudiante est) throws Exception {
        if (estaVacia()) {
            head = tail = new Nodo<>(est);
        } else {
            head = new Nodo<>(est, null, head);
            head.obtenerSiguiente().asignarAnterior(head);
        }
    }

    @Override
    public String MostrarLista() {
        String listaMostrar = " ";
        Nodo<Estudiante> actual = this.head;
        while (actual != null){
            listaMostrar = listaMostrar + actual.obtenerDato().informacion() + " -.-.-.- ";
            actual = actual.obtenerSiguiente();
        }
        return listaMostrar;
    }

    @Override
    public String MostrarBarrioIgual(String barrio) {
        String listaMostrar = " ";
        Nodo<Estudiante> actual = this.head;
        while (actual != null){
            if(actual.obtenerDato().getBarrio() == barrio){
                listaMostrar = listaMostrar + actual.obtenerDato().getNombre() + " -.-.-.- ";
            }
            actual = actual.obtenerSiguiente();
        }
        return listaMostrar;
    }

    private boolean estaVacia() {
        return head == null;
    }

    @Override
    public String mostrarEstudiante(String cedula) throws Exception {
        Nodo<Estudiante> actual = this.head;
        String info = "";
        while (actual != null){
            if(actual.obtenerDato().getCedula() == cedula){
                info = actual.obtenerDato().informacion();
            }
            actual = actual.obtenerSiguiente();
        }
        return info;
    }

    @Override
    public void InsertarCondiciones(Estudiante est) throws Exception {
        if(est.getNotaFinal() < 3.0){
            InsertarCola(est);
        }else{
            InsertarCabeza(est);
        }
    }
    
    public String AprobadosReprobados (){
        Nodo<Estudiante> actual = this.head;
        DoublyLinkedList Aprobados = new DoublyLinkedList();
        DoublyLinkedList Reprobados = new DoublyLinkedList();
        while(actual != null){
            if(actual.obtenerDato().getNotaFinal() < 3.0){
                try {
                    Reprobados.InsertarCabeza(actual.obtenerDato());
                } catch (Exception ex) {
                    Logger.getLogger(DoublyLinkedList.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                try {
                    Aprobados.InsertarCabeza(actual.obtenerDato());
                } catch (Exception ex) {
                    Logger.getLogger(DoublyLinkedList.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //String listaAR = "Aprobados:  " + Aprobados.MostrarLista() + "-.-.-.-" + "Reprobados:  " + Reprobados.MostrarLista();
        String listA = Aprobados.MostrarLista();
        return listA;
    }
}
