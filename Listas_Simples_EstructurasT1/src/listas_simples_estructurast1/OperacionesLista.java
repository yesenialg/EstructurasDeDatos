package listas_simples_estructurast1;

public class OperacionesLista<T extends Comparable> implements InterfazListas<T> {

    private Nodo<T> cabeza;

    public OperacionesLista() {
        this.cabeza = null;
    }

    public boolean estaVacio() {
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

        while (actual != null) {
            lista = lista + actual.obtenerDato() + " ";
            actual = actual.obtenerSiguienteNodo();
        }
        return lista;
    }

    //Mostrar la cantidad de datos.
    @Override
    public int mostrarCantidadDatos() {
        int cantidad = 0;
        Nodo<T> actual = this.cabeza;
        while (actual != null) {
            cantidad += 1;
            actual = actual.obtenerSiguienteNodo();
        }
        return cantidad;
    }

    //Mostrar el dato mayor.
    @Override
    public int datoMayor() throws Exception {
        int mayor = 0;
        Nodo<T> actual = this.cabeza;
        if (estaVacio()) {
            throw new Exception("La lista está vacía");
        } else {
            mayor = Integer.valueOf(actual.obtenerDato().toString());
            while (actual.obtenerSiguienteNodo() != null) {
                actual = actual.obtenerSiguienteNodo();
                if (Integer.valueOf(actual.obtenerDato().toString()) > mayor) {
                    mayor = Integer.valueOf(actual.obtenerDato().toString());
                }
            }
        }
        return mayor;
    }

    //Mostrar el dato menor.
    @Override
    public int datoMenor() throws Exception {
        int menor;
        Nodo<T> actual = this.cabeza;
        if (estaVacio()) {
            throw new Exception("La lista está vacía");
        } else {
            menor = Integer.valueOf(actual.obtenerDato().toString());
            while (actual.obtenerSiguienteNodo() != null) {
                actual = actual.obtenerSiguienteNodo();
                if (Integer.valueOf(actual.obtenerDato().toString()) < menor) {
                    menor = Integer.valueOf(actual.obtenerDato().toString());
                }
            }
        }
        return menor;
    }

    //Mostrar el promedio de datos.
    @Override
    public double promedioDatos() throws Exception {
        double suma = 0;
        double contador = 0;
        Nodo<T> actual = this.cabeza;
        if (estaVacio()) {
            throw new Exception("La lista está vacía");
        } else {
            suma += Integer.valueOf(actual.obtenerDato().toString());
            contador++;
            while (actual.obtenerSiguienteNodo() != null) {
                actual = actual.obtenerSiguienteNodo();
                suma += Integer.valueOf(actual.obtenerDato().toString());
                contador++;
            }
        }
        double promedio = suma / contador;
        return promedio;
    }

    //Determinar si un dato ingresado por el usuario existe en la lista.
    @Override
    public boolean datoExistente(T dato) {
        boolean encontrado = false;
        Nodo<T> actual = this.cabeza;
        while(actual != null && encontrado != true){
            if(dato == actual.obtenerDato()){
            encontrado = true;
            }else{
                actual = actual.obtenerSiguienteNodo();
            }
        }
        return encontrado;
    }
    //Insertar nuevos nodos al final de la lista (si el dato ya se encuentra en la lista, no ingresarlo y lanzar excepción).
    @Override
    public void agregarFinal(T d) {//throws Exception{
        if (estaVacio()) {
            agregarInicio(d);
        //} else if(datoExistente(d) == true){
           // throw new Exception ("El dato ya existe");
        }else {
            Nodo<T> nuevoNodo = new Nodo<>(d);
            Nodo<T> actual = this.cabeza;
            while (actual.obtenerSiguienteNodo() != null) {
                actual = actual.obtenerSiguienteNodo();
            }
            actual.asignarSiguienteNodo(nuevoNodo);
        }
    }

    //Insertar nuevos nodos ordenados de mayor a menor e impedir datos duplicados (si el dato ya se encuentra en la lista, no ingresarlo y lanzar excepción).
    @Override
    public void agregarOrdenado(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (estaVacio() || dato.compareTo(this.cabeza.obtenerDato()) == -1) {
            nuevoNodo.asignarSiguienteNodo(this.cabeza);
            this.cabeza = nuevoNodo;
        } else {
            Nodo<T> actual = this.cabeza;
            while (actual.obtenerSiguienteNodo() != null && dato.compareTo(actual.obtenerSiguienteNodo().obtenerDato()) == 1) {
                actual = actual.obtenerSiguienteNodo();
            }
            nuevoNodo.asignarSiguienteNodo(actual.obtenerSiguienteNodo());
            actual.asignarSiguienteNodo(nuevoNodo);
        }
    }

    //Eliminar un nodo con un dato específico ingresado por el usuario.
    public void eliminarEspecifico(T dato){
        if (datoExistente(dato)){
            Nodo<T> actual = this.cabeza;
            if(actual.obtenerDato() == dato){
                this.cabeza = actual.obtenerSiguienteNodo();
            }else{
                while(actual.obtenerSiguienteNodo().obtenerDato() != dato){
                    actual = actual.obtenerSiguienteNodo();
                }
                actual.asignarSiguienteNodo(actual.obtenerSiguienteNodo().obtenerSiguienteNodo());
            }
        }
    }

    //Insertar nuevos nodos después de un dato especificado por el usuario (si no se encuentra el dato, lanzar excepción).
    @Override
    public void agregarDespuesDeEspecifico(T datoNuevo, T datoExistente) {
        Nodo<T> actual = this.cabeza;
        Nodo<T> nuevoNodo = new Nodo<>(datoNuevo);
        while (actual.obtenerDato() != datoExistente){
            actual = actual.obtenerSiguienteNodo();
        }
        nuevoNodo.asignarSiguienteNodo(actual.obtenerSiguienteNodo());
        actual.asignarSiguienteNodo(nuevoNodo);
    }

    //Modificar el dato de un nodo especifico (solicitar el dato anterior).
    @Override
    public void modificarDato(T dNuevo, T dExistente) {
        Nodo<T> actual = this.cabeza;
        while (actual.obtenerDato() != dExistente){
            actual = actual.obtenerSiguienteNodo();
        }
        actual.asignarDato(dNuevo);
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
