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
public interface Lista<T> {
    
    public boolean DatoExistente(Estudiante estBuscar);
    
    public void InsertarOrdenado(Estudiante est) throws Exception;
    
    public void EliminarEspecifico(Estudiante estEliminar) throws Exception;
    
    public void InsertarDespuesEspecifico (Estudiante especifico, Estudiante est) throws Exception;
    
    public void InsertarCola(Estudiante est) throws Exception;
    
    public void InsertarCabeza(Estudiante est) throws Exception;
    
    public String MostrarLista();
    
    public String MostrarBarrioIgual(String barrio);
    
    public String mostrarEstudiante(String cedula) throws Exception;
}
