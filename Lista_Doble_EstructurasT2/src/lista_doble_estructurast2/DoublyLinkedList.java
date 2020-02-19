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
 * @param <T>
 */
public class DoublyLinkedList<T extends Estudiante> implements Lista<Estudiante> {

    private Nodo<Estudiante> head;
    private Nodo<Estudiante> tail;

    //Buscar si el dato existe en la lista
    @Override
    public boolean DatoExistente(Estudiante estBuscar) {
        boolean encontrado = false;
        Nodo<Estudiante> actual = this.head.obtenerSiguiente();
        while (actual != null && encontrado != true) {
            if (estBuscar == actual.obtenerDato()) {
                encontrado = true;
            } else {
                actual = actual.obtenerSiguiente();
            }
        }
        return encontrado;
    }

    //Elimina un dato existente en la lista, si no existe retorna excepcion
    @Override
    public void EliminarEspecifico(Estudiante estEliminar) throws Exception {
        //if(DatoExistente(estEliminar)){
        Nodo<Estudiante> actual = this.head;
        Nodo<Estudiante> cola = this.tail;
        if (actual.obtenerDato() == estEliminar) {
            actual.obtenerSiguiente().asignarAnterior(null);
            head = actual.obtenerSiguiente();
        } else if (tail.obtenerDato() == estEliminar) {
            cola.obtenerAnterior().asignarSiguiente(null);
            tail = cola.obtenerAnterior();
        } else {
            while (actual != null) {
                if (actual.obtenerDato().equals(estEliminar)) {
                    actual.obtenerAnterior().asignarSiguiente(actual.obtenerSiguiente());
                    actual.obtenerSiguiente().asignarAnterior(actual.obtenerAnterior());
                }
                actual = actual.obtenerSiguiente();
            }
        }
        //}else{
        //    throw new Exception ("El estudiante a eliminar no existe ");
        //}
    }

    //Insertar un nuevo nodo, luego de uno especificado pr el usuario, si el dato especificado no existe lanzar excepcion
    @Override
    public void InsertarDespuesEspecifico(Estudiante especifico, Estudiante est) throws Exception {
        if (!DatoExistente(est)) {
            Nodo<Estudiante> actual = this.head;
            Nodo<Estudiante> cola = this.tail;
            Nodo<Estudiante> nNodo;
            if (cola.obtenerDato() == especifico) {
                nNodo = new Nodo<>(est, cola, null);
                cola.asignarSiguiente(nNodo);
            } else if (actual.obtenerDato() == especifico) {
                nNodo = new Nodo<>(est, actual, actual.obtenerSiguiente());
                actual.asignarSiguiente(nNodo);
                head = actual;
            } else {
                while (actual != null) {
                    if (actual.obtenerDato() == especifico) {
                        nNodo = new Nodo<>(est, actual, actual.obtenerSiguiente());
                        actual.asignarSiguiente(nNodo);
                    }
                    actual = actual.obtenerSiguiente();
                }
            }
        } else {
            throw new Exception("El dato especificado de referencia no existe");
        }
    }

    //Insertar un nuevo nodo en la cola
    @Override
    public void InsertarCola(Estudiante est) {
        if (estaVacia()) {
            head = tail = new Nodo<>(est);
        } else {
            tail = new Nodo<>(est, tail, null);
            tail.obtenerAnterior().asignarSiguiente(tail);
        }
    }

    //Insertar un nuevo nodo en la cabeza, si ya existe lanzar excepcion
    @Override
    public void InsertarCabeza(Estudiante est) throws Exception {
        if (!DatoExistente(est)) {
            if (estaVacia()) {
                head = tail = new Nodo<>(est);
            } else {
                head = new Nodo<>(est, null, head);
                head.obtenerSiguiente().asignarAnterior(head);
            }
        } else {
            throw new Exception("La cedula a ingresar ya existe");
        }
    }

    //Mostrar la lista
    @Override
    public String MostrarLista() {
        String listaMostrar = " ";
        Nodo<Estudiante> actual = this.head;
        while (actual != null) {
            listaMostrar = listaMostrar + actual.obtenerDato().informacion() + " -.-.-.- ";
            actual = actual.obtenerSiguiente();
        }
        return listaMostrar;
    }

    //Mostrar todos los estudiantes que viven en el barrio indicado por el usuario
    @Override
    public String MostrarBarrioIgual(String barrio) {
        String listaMostrar = " ";
        Nodo<Estudiante> actual = this.head;
        while (actual != null) {
            if (actual.obtenerDato().getBarrio() == barrio) {
                listaMostrar = listaMostrar + actual.obtenerDato().getNombre() + " -.-.-.- ";
            }
            actual = actual.obtenerSiguiente();
        }
        return listaMostrar;
    }

    //Revisar si la lista esta vacia
    private boolean estaVacia() {
        return head == null;
    }

    //Mostrar un estudiante especifico indicado por el usuario
    @Override
    public String mostrarEstudiante(String cedula) {
        Nodo<Estudiante> actual = this.head;
        String info = "";
        while (actual != null) {
            if (actual.obtenerDato().getCedula() == cedula) {
                info = actual.obtenerDato().informacion();
            }
            actual = actual.obtenerSiguiente();
        }
        return info;
    }

    //insertar los estudiantes que aprobaron a la cabeza de la lista, los que reprobaron en la cola de la lista
    @Override
    public void InsertarCondiciones(Estudiante est) throws Exception {
        if (est.getNotaFinal() < 3.0) {
            InsertarCola(est);
        } else {
            InsertarCabeza(est);
        }
    }

    //Crear las dos pequeñas listas con los estuduantes que aprobaron y reprobaron
    public void DividirAprobReprob(DoublyLinkedList Aprob, DoublyLinkedList Reprob) {
        Nodo<Estudiante> actual = this.head;
        while (actual != null) {
            if (actual.obtenerDato().getNotaFinal() < 3.0) {
                try {
                    Reprob.InsertarCola(actual.obtenerDato());
                } catch (Exception ex) {
                    Logger.getLogger(DoublyLinkedList.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    Aprob.InsertarCola(actual.obtenerDato());
                } catch (Exception ex) {
                    Logger.getLogger(DoublyLinkedList.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            actual = actual.obtenerSiguiente();
        }
    }
}
