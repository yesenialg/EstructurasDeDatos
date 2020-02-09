package listas_simples_estructurast1;




public class OperacionesLista<T extends Comparable> implements InterfazListas<T>{

    private Nodo<T> cabeza;
    
    public OperacionesLista(){
        this.cabeza = null;
    }
    
    public boolean estaVacio(){
        return this.cabeza == null;
    }
    
    
    @Override
    public void agregarInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.asignarSiguienteNodo(this.cabeza);
        this.cabeza = nuevoNodo;
    }
    
    //Mostrar todos los datos de la lista.
    @Override
    public String mostrarDatos() {
        String lista = "";
        Nodo<T> actual = this.cabeza;
        
        while(actual != null){
            lista = lista + actual.obtenerDato() + " ";
            actual = actual.obtenerSiguienteNodo();
        }
        return lista;
    }

    //Mostrar la cantidad de datos.
    @Override
    public void mostrarCantidadDatos() {
    }

    //Mostrar el dato mayor.
    @Override
    public void datoMayor() {
    }

    //Mostrar el dato menor.
    @Override
    public void datoMenor() {
    }

    //Mostrar el promedio de datos.
    @Override
    public void promedioDatos() {
    }

    //Determinar si un dato ingresado por el usuario existe en la lista.
    @Override
    public void datoExistente(T d) {
    }

    //Insertar nuevos nodos al final de la lista (si el dato ya se encuentra en la lista, no ingresarlo y lanzar excepción).
    @Override
    public void agregarFinal(T d) {
        if (estaVacio()){
            agregarInicio(d);
        }else{
            Nodo<T> nuevoNodo = new Nodo<> (d);
            Nodo<T> actual = this.cabeza;
            while (actual.obtenerSiguienteNodo() != null){
                actual = actual.obtenerSiguienteNodo();
            }
            actual.asignarSiguienteNodo(nuevoNodo);
        }
    }

    //Insertar nuevos nodos ordenados de mayor a menor e impedir datos duplicados (si el dato ya se encuentra en la lista, no ingresarlo y lanzar excepción).
    @Override
    public void agregarOrdenado(T dato) {
        Nodo <T> nuevoNodo = new Nodo<>(dato);
        if (estaVacio() || dato.compareTo(this.cabeza.obtenerDato()) == -1){
            nuevoNodo.asignarSiguienteNodo(this.cabeza);
            this.cabeza = nuevoNodo;
        }else {
            Nodo<T> actual = this.cabeza;
            while (actual.obtenerSiguienteNodo() != null && dato.compareTo(actual.obtenerSiguienteNodo().obtenerDato()) == 1){
                actual = actual.obtenerSiguienteNodo();
            }
            nuevoNodo.asignarSiguienteNodo(actual.obtenerSiguienteNodo());
            actual.asignarSiguienteNodo(nuevoNodo);
        }
    }

    //Eliminar un nodo con un dato específico ingresado por el usuario.
    @Override
    public void eliminarEspecifico(T d) {
    }

    //Insertar nuevos nodos después de un dato especificado por el usuario (si no se encuentra el dato, lanzar excepción).
    @Override
    public void agregarDespuesDeEspecifico(T d) {
    }

    //Modificar el dato de un nodo especifico (solicitar el dato anterior).
    @Override
    public void modificarDato(T d) {
    }

    //Determinar si otra lista tiene el mismo tamaño.
    @Override
    public void listaMismoTamaño() {
    }

    //Determinar si otra lista es igual.
    @Override
    public void mismaLista() {
    }

}
