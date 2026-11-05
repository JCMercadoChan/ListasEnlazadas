package Listas;

public class Lista {
    // Referencias al primer y al último nodo.
    private Nodo inicio;
    private Nodo fin;

    // Al crear la lista, ambas referencias quedan en null.
    public Lista() {
        inicio = null;
        fin = null;
    }

    public boolean listaVacia() {
        return inicio == null;
    }

    // Inserta un nodo antes del primero.
    public void insertarInicio(int dato) {
        inicio = new Nodo(dato, inicio);

        // Si la lista estaba vacía, el nuevo nodo también es el último.
        if (fin == null) {
            fin = inicio;
        }
    }

    // Inserta un nodo después del último.
    public void insertarFinal(int dato) {
        if (listaVacia()) {
            insertarInicio(dato);
        } else {
            fin.siguiente = new Nodo(dato);
            fin = fin.siguiente;
        }
    }

    // ACTIVIDAD GUIADA EN CLASE:
    // Insertar el dato manteniendo el orden ascendente.
    public void insertarEnOrden(int dato) {
        // TODO: implementar siguiendo la guía del profesor.
    }

    // ACTIVIDAD GUIADA EN CLASE:
    // Devuelve true si encuentra el elemento; false en caso contrario.
    public boolean buscarEnLista(int elemento) {
        // TODO: implementar durante la explicación en clase.
        return false;
    }

    // ACTIVIDAD GUIADA EN CLASE:
    // Elimina el primer nodo y devuelve su dato.
    // Devuelve -1 si la lista está vacía.
    public int eliminarInicio() {
        // TODO: implementar durante la explicación en clase.
        return -1;
    }

    // EJERCICIO INDIVIDUAL:
    // Elimina el último nodo y devuelve su dato.
    // Devuelve -1 si la lista está vacía.
    public int eliminarFinal() {
        // TODO: implementar como ejercicio.
        return -1;
    }

    // EJERCICIO INDIVIDUAL:
    // Elimina la primera aparición del dato indicado.
    // Devuelve el dato eliminado o -1 si no se encuentra.
    public int eliminarElemento(int dato) {
        // TODO: implementar como ejercicio.
        return -1;
    }

    // Recorre la lista y muestra sus elementos.
    public void mostrarLista() {
        System.out.print("inicio -> ");
        Nodo actual = inicio;

        while (actual != null) {
            System.out.print("[" + actual.dato + "] -> ");
            actual = actual.siguiente;
        }

        System.out.println("null");
        System.out.println("Lista vacía: " + listaVacia());
    }
}
