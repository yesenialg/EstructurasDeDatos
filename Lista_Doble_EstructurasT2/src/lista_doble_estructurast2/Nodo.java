/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_doble_estructurast2;

/**
 *
 * @author HP
 */
public class Nodo<T> {

    private Estudiante dato;
    private Nodo<Estudiante> NodoSiguiente;
    private Nodo<Estudiante> NodoAnterior;

    public Nodo(Estudiante est, Nodo nA, Nodo nS) {
        asignarDato(est);
        asignarSiguiente(nS);
        asignarAnterior(nA);
    }

    public Nodo(Estudiante est) {
        this(est, null, null);
    }

    public void asignarDato(Estudiante est) {
        this.dato = est;
    }

    public Estudiante obtenerDato() {
        return dato;
    }

    public void asignarSiguiente(Nodo nS) {
        this.NodoSiguiente = nS;
    }

    public Nodo obtenerSiguiente() {
        return NodoSiguiente;
    }

    public void asignarAnterior(Nodo nA) {
        this.NodoAnterior = nA;
    }

    public Nodo obtenerAnterior() {
        return NodoAnterior;
    }
}
