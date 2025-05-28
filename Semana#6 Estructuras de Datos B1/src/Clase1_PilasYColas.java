/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Personal
 */
import java.util.Stack;

public class Clase1_PilasYColas {

    public static void main(String[] args) {
        //PILA
        // Crear una pila de tipo String
        Stack<String> pila = new Stack<>();

        // Agregar elementos con push()
        pila.push("A");
        pila.push("B");
        pila.push("C");
        System.out.println("Pila después de push: " + pila); // [A, B, C]

        // peek() - Ver el elemento en la cima sin eliminarlo
        String cima = pila.peek();
        System.out.println("Elemento en la cima (peek): " + cima); // C

        // size() - Obtener el tamaño actual de la pila
        System.out.println("Tamaño de la pila: " + pila.size()); // 3

        // search() - Buscar un elemento (1 es la cima)
        int posicion = pila.search("A");
        if (posicion != -1) {
            System.out.println("La letra A está en la posición: " + posicion + " desde la cima.");
        } else {
            System.out.println("La letra A no está en la pila.");
        }

        // pop() - Eliminar el elemento en la cima
        String eliminado = pila.pop();
        System.out.println("Elemento eliminado (pop): " + eliminado); // C
        System.out.println("Pila después del pop: " + pila); // [A, B]

        // isEmpty() - Verificar si la pila está vacía
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía");
        } else {
            System.out.println("La pila NO está vacía"); // No está vacía
        }
    }
}


