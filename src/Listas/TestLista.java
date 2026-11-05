package Listas;

import java.util.Scanner;

public class TestLista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Lista lista = new Lista();
        int opcion;

        do {
            System.out.println("\n=== LISTA ENLAZADA SIMPLE ===");
            System.out.println("IMPORTANTE: utiliza una sola modalidad de inserción por ejecución.");
            System.out.println("Opciones 1-2: inserción libre. Opción 3: inserción ordenada.");
            System.out.println("No mezcles las opciones 1-2 con la opción 3.");
            System.out.println("-----------------------------------------------");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Insertar en orden ascendente");
            System.out.println("4. Buscar elemento (actividad en clase)");
            System.out.println("5. Eliminar al inicio (actividad en clase)");
            System.out.println("6. Eliminar al final (ejercicio individual)");
            System.out.println("7. Eliminar elemento (ejercicio individual)");
            System.out.println("8. Mostrar lista");
            System.out.println("0. Salir");
            opcion = leerOpcion(teclado);

            int dato;
            int resultado;

            switch (opcion) {
                case 1:
                    dato = leerEnteroPositivo(teclado, "Dato que se insertará al inicio: ");
                    lista.insertarInicio(dato);
                    System.out.println("Operación realizada.");
                    break;
                case 2:
                    dato = leerEnteroPositivo(teclado, "Dato que se insertará al final: ");
                    lista.insertarFinal(dato);
                    System.out.println("Operación realizada.");
                    break;
                case 3:
                    dato = leerEnteroPositivo(teclado, "Dato que se insertará en orden: ");
                    lista.insertarEnOrden(dato);
                    System.out.println("Operación realizada.");
                    break;
                case 4:
                    dato = leerEnteroPositivo(teclado, "Dato que se buscará: ");
                    if (lista.buscarEnLista(dato)) {
                        System.out.println("Elemento encontrado.");
                    } else {
                        System.out.println("Elemento no encontrado.");
                    }
                    break;
                case 5:
                    resultado = lista.eliminarInicio();
                    if (resultado == -1) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.println("Elemento eliminado: " + resultado);
                    }
                    break;
                case 6:
                    resultado = lista.eliminarFinal();
                    if (resultado == -1) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.println("Elemento eliminado: " + resultado);
                    }
                    break;
                case 7:
                    dato = leerEnteroPositivo(teclado, "Dato que se eliminará: ");
                    resultado = lista.eliminarElemento(dato);
                    if (resultado == -1) {
                        System.out.println("El elemento no se encontró.");
                    } else {
                        System.out.println("Elemento eliminado: " + resultado);
                    }
                    break;
                case 8:
                    lista.mostrarLista();
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        teclado.close();
    }

    // Lee y valida una opción entera del menú.
    private static int leerOpcion(Scanner teclado) {
        System.out.print("Selecciona una opción: ");
        while (!teclado.hasNextInt()) {
            System.out.print("Entrada inválida. Escribe un número: ");
            teclado.next();
        }
        return teclado.nextInt();
    }

    // Lee exclusivamente enteros positivos.
    private static int leerEnteroPositivo(Scanner teclado, String mensaje) {
        int valor;
        System.out.print(mensaje);

        while (true) {
            if (teclado.hasNextInt()) {
                valor = teclado.nextInt();
                if (valor > 0) {
                    return valor;
                }
                System.out.print("El valor debe ser positivo. " + mensaje);
            } else {
                System.out.print("Entrada inválida. " + mensaje);
                teclado.next();
            }
        }
    }
}
