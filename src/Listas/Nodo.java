package Listas;

/**
 * Representa un nodo de una lista enlazada simple.
 * Cada nodo almacena un entero y una referencia al siguiente nodo.
 */
public class Nodo {
    public int dato;
    public Nodo siguiente;

    // Crea un nodo sin sucesor.
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    // Crea un nodo que apunta al nodo recibido.
    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
}
