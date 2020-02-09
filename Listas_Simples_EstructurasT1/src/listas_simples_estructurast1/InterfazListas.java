package listas_simples_estructurast1;

public interface InterfazListas<T> {
    
    public void agregarInicio(T d);
    
    public String mostrarDatos();
    
    public void mostrarCantidadDatos();
    
    public void datoMayor();
    
    public void datoMenor();
    
    public void promedioDatos();
    
    public void datoExistente(T d);
    
    public void agregarFinal(T d);
    
    public void agregarOrdenado(T d);
    
    public void eliminarEspecifico(T d);
    
    public void agregarDespuesDeEspecifico(T d);
    
    public void modificarDato(T d);
    
    public void listaMismoTamaño();
    
    public void mismaLista();
    
}
