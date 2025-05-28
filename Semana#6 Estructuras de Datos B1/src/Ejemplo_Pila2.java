/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
import java.util.Scanner;
import java.util.Stack;

public class Ejemplo_Pila2 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Crear una pila de tipo String para guardar nombres
        Stack<String> pila = new Stack<>();

        int opcion; // Variable para guardar la opción del menú

        // Bucle que se repite hasta que el usuario elija salir (opción 0)
        do {
            // Mostrar el menú de opciones
            System.out.println("\n--- Menú de opciones ---");
            System.out.println("1. Agregar nombre (push)");
            System.out.println("2. Ver nombre en la cima (peek)");
            System.out.println("3. Eliminar nombre de la cima (pop)");
            System.out.println("4. Buscar nombre (search)");
            System.out.println("5. ¿Está vacía la pila? (isEmpty)");
            System.out.println("6. Mostrar pila completa");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            // Leer la opción elegida por el usuario
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer del scanner

            // Usar switch para ejecutar la acción correspondiente
            switch (opcion) {
                case 1:
                    // push(): agregar un nombre a la pila
                    System.out.print("Ingresa un nombre: ");
                    String nombre = sc.nextLine();
                    pila.push(nombre); // Se agrega al tope de la pila
                    System.out.println("Nombre agregado a la pila.");
                    break;

                case 2:
                    // peek(): ver el elemento en la cima sin eliminarlo
                    if (!pila.isEmpty()) {
                        System.out.println("Nombre en la cima: " + pila.peek());
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;

                case 3:
                    // pop(): eliminar el último elemento agregado
                    if (!pila.isEmpty()) {
                        String eliminado = pila.pop();
                        System.out.println("Nombre eliminado: " + eliminado);
                    } else {
                        System.out.println("No se puede eliminar, la pila está vacía.");
                    }
                    break;

                case 4:
                    // search(): buscar un nombre en la pila (posición desde la cima)
                    System.out.print("Ingresa el nombre a buscar: ");
                    String buscar = sc.nextLine();
                    int posicion = pila.search(buscar); // 1 = cima, -1 = no encontrado
                    if (posicion != -1) {
                        System.out.println("El nombre está a " + posicion + " posición(es) desde la cima.");
                    } else {
                        System.out.println("Nombre no encontrado en la pila.");
                    }
                    break;

                case 5:
                    // isEmpty(): verificar si la pila está vacía
                    if (pila.isEmpty()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        System.out.println("La pila NO está vacía.");
                    }
                    break;

                case 6:
                    // Mostrar el contenido completo de la pila
                    System.out.println("Contenido de la pila: " + pila);
                    break;

                case 0:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    // Opción inválida
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;
            }

        } while (opcion != 0); // Repetir mientras la opción no sea 0

        sc.close(); // Cerrar el scanner al final
    }
}


