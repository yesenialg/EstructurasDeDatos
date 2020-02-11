package listas_simples_estructurast1;

public interface InterfazListas<T> {
    
    public void agregarInicio(T d);
    
    public String mostrarDatos();
    
    public int mostrarCantidadDatos();
    
    public int datoMayor() throws Exception;
    
    public int datoMenor() throws Exception;
    
    public double promedioDatos() throws Exception;
    
    public boolean datoExistente(T d); 
    
    public void agregarFinal(T d) throws Exception;
    
    public void agregarOrdenado(T d) throws Exception;
    
    public void eliminarEspecifico(T d);
    
    public void agregarDespuesDeEspecifico(T dN, T dE) throws Exception;
    
    public void modificarDato(T dN, T dE) throws Exception;
    
    public boolean listaMismoTamano(OperacionesLista lisB);
    
    public boolean mismaLista(OperacionesLista lisB);
    
}
