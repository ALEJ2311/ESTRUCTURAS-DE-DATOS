
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ALEJ2311
 */
public class Taller_Pilas_Colas {
public static Stack<String> pila = new Stack<>();
public static Queue<String> cola = new LinkedList<>();
    public static void main(String[] args) {
        
        
        Scanner tcl = new Scanner(System.in);
        boolean bandera = true;
        int opcion = 0;

        do {
            System.out.println("---MENÚ PRINCIPAL---");
            System.out.println("1. Trabajar con Pila");
            System.out.println("2. Trabajar con cola");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = tcl.nextInt();
            switch (opcion) {
                case 1:
                    trPila();
                    break;
                case 2:
                    trCola();
                    break;
                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        } while (bandera);
    }

    public static void trPila() {
        
        Scanner tcl = new Scanner(System.in);
        int opcionpP = 0;
        boolean flecha = true;
        while (flecha) {
            System.out.println("---Menu de Pilas---");
            System.out.println("1. Insertar Elemento(push)");
            System.out.println("2. Eliminar Elemento(poop) / deshacer accion");
            System.out.println("3. Ver elemento superior(peek)");
            System.out.println("4. Verificar si esta vacía");
            System.out.println("5. Mostar contenido de Pila");
            System.out.println("6. Retornar a Menu Principal");
            System.out.print("Ingrese una opcion: ");
            opcionpP = tcl.nextInt();
            tcl.nextLine();
            switch (opcionpP) {
                case 1:
                    System.out.print("Ingrese un elemento: ");
                    String elemento = tcl.nextLine();
                    pila.push(elemento);
                    System.out.println("Elemento agregado correctamente!!");
                    break;
                case 2:
                    if (!pila.isEmpty()) {
                        String borrar = pila.pop();
                        System.out.println("Elemento eliminado: " + borrar);
                    } else {
                        System.out.println("Pila vacía");
                    }
                    break;
                case 3:
                    if (!pila.isEmpty()) {
                        String cima = pila.peek();
                        System.out.println("El elemento en la cima es: " + cima);
                    } else {
                        System.out.println("Pila vacía");
                    }
                    break;
                case 4:
                    if (!pila.isEmpty()) {
                        System.out.println("La pila no está vacía");
                    } else {
                        System.out.println("La pila está ");
                    }
                    break;
                case 5:
                    if (!pila.isEmpty()) {
                        for (int i = pila.size() - 1; i >= 0; i--) {
                            System.out.println(pila.get(i));
                        }
                    } else {
                        System.out.println("Pila vacía");
                    }
                    break;
                case 6:
                    flecha = false;
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
        }
    }

    public static void trCola() {
        boolean arco = true;
        Scanner tcl = new Scanner(System.in);        
        int opcionC = 0;
        while (arco) {
            System.out.println("---Menu de Colas---");
            System.out.println("1. Insertar Elemento (enqueue)");
            System.out.println("2. Eliminar Elemento (dequeue)");
            System.out.println("3. Ver primer elemento (peek)");
            System.out.println("4. Verificar si está vacía");
            System.out.println("5. Mostrar contenido de la Cola");
            System.out.println("6. Retornar a Menú Principal");
            System.out.print("Ingrese una opción: ");
            opcionC = tcl.nextInt();
            tcl.nextLine();
            switch (opcionC) {
                case 1:
                    System.out.print("Ingrese un elemento: ");
                    String elementoC = tcl.nextLine();
                    cola.offer(elementoC);
                    System.out.println("Elemento ingresado!!");
                    break;
                case 2:
                    if (!cola.isEmpty()) {
                        String eliminado = cola.poll();
                        System.out.println("Elemento eliminado: " + eliminado);
                    } else {
                        System.out.println("Cola vacia");
                    }
                    break;
                case 3:
                    if (!cola.isEmpty()) {
                        String cimaC = cola.peek();
                        System.out.println("El primer elemento es: " + cimaC);
                    } else {
                        System.out.println("La cola esta vacía");
                    }
                    break;
                case 4:
                    System.out.println("La cola esta vacia??: " + cola.isEmpty());
                    break;
                case 5:
                    if (!cola.isEmpty()) {
                        System.out.println(cola);
                    } else {
                        System.out.println("La cola está vacía");
                    }
                case 6:
                    arco = false;
                    break;
                default:
                    System.out.println("Opcion Invalida");
            
            }
        }
    }

}
