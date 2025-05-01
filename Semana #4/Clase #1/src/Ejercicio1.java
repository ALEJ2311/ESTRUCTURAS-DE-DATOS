
import java.util.Scanner;

/**
 *
 * @author ALEJ2311
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int arreglo1[] = new int[10];
        int num;
        int contador = 0;
        System.out.println("Ingrese 10 numeros aleatorios, sin que se repitan: ");
        while (contador < 10) {
            System.out.print("Ingrese un numero para la posicion " + (contador + 1) + ": ");
            num = tcl.nextInt();
            if (!verificarNum(arreglo1, contador, num)) {
                arreglo1[contador] = num;
                contador++;
            } else {
                System.out.println("Numero repetido, intente de nuevo");
            }

        }
        System.out.println("Arreglo");
        presentarArreglo(arreglo1);

        System.out.println("Arreglo ordenado por Burbuja");
        ordenarBurbuja(arreglo1);
        presentarArreglo(arreglo1);

        System.out.print("Ingrese el valor que desea eliminar: ");
        int valor = tcl.nextInt();
        eliminarValor(arreglo1, valor);
        presentarArreglo(arreglo1);

        System.out.print("Ingrese el valor que desea reemplazar: ");
        int valorV = tcl.nextInt();
        System.out.print("Ingrese el nuevo valor: ");
        int valorN = tcl.nextInt();
        sustituirValor(arreglo1, valorV, valorN);
        presentarArreglo(arreglo1);
    }

    public static boolean verificarNum(int arreglo1[], int contador, int num) {
        for (int i = 0; i < contador; i++) {
            if (num == arreglo1[i]) {
                return true;
            }
        }
        return false;
    }

    public static void presentarArreglo(int arreglo1[]) {
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Arreglo en el indice [" + i + "]: " + arreglo1[i]);
        }
        System.out.println("");
    }

    public static void ordenarBurbuja(int arreglo[]) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public static void eliminarValor(int arreglo1[], int valor) {
        boolean encontrado = false;
        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] == valor) {
                arreglo1[i] = 0; // o puedes usar Integer.MIN_VALUE para marcarlo como eliminado
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El valor no se encuentra en el arreglo.");
        } else {
            System.out.println("Valor eliminado correctamente.");

        }

    }

    public static void sustituirValor(int arreglo1[], int valorViejo, int valorNuevo) {
        boolean sustituido = false;
        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] == valorViejo) {
                arreglo1[i] = valorNuevo;
                sustituido = true;
                break;
            }
        }
        if (!sustituido) {
            System.out.println("El valor a sustituir no se encontró en el arreglo.");
        } else {
            System.out.println("Valor sustituido correctamente.");
        }
    }

}
