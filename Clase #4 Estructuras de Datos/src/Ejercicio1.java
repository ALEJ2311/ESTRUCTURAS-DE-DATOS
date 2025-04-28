
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        int n = 0;
        int multi = 0;
        int pares = 0;
        int numero = 0, repe = 0;

        System.out.print("Cuantos pares desea sumar?: ");
        n = tcl.nextInt();        
        int numeros[] = new int[10];
        
        pares = sumPares(n, multi);
        System.out.println("La suma de los pares hasta " + n + " es: " + pares);
        System.out.print("Ingrese 10 numeros para un arreglo: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = tcl.nextInt();
        }
        System.out.print("Ingrese el numero que desa saber cuantas veces se repite: ");
        numero = tcl.nextInt();
        int cantidad = repetidos(numeros, numero, repe, 0);
        System.out.println("Su numero se repite " + cantidad + " veces");
        
    }

    public static int sumPares(int n, int multi) {
        if (n == 1) {
            return 2;
        }
        return 2 * n + sumPares(n - 1, multi);
    }

    public static int repetidos(int numeros[], int numero, int repe, int i) {
        if (i >= numeros.length) {
            return 0;
        }
        if (numeros[i] == numero) {
            return 1 + repetidos(numeros, numero, repe, i + 1);
        } else {
            return repetidos(numeros, numero, repe, i + 1);
        }

    }
}

