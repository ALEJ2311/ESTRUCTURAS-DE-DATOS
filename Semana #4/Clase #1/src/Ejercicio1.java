
import java.util.Scanner;

/**
 *
 * @author ALEJ2311
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int arreglo1[] = new int[10];
        boolean bandera = true;
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
    
    public static void presentarArreglo(int arreglo1[]){
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Arreglo en el indice [" + i + "]: " + arreglo1[i]);
        }
        System.out.println("");
    }
}
