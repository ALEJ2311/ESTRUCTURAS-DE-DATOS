/***
 * Dada una cadena previa, lea un carácter por teclado e imprima cuantas veces se repite dicho carácter en la cadena.
 * Ej: cadena=“Universidad Técnica”
 *    caracter = ‘d’
 * Salida :   
 */
import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String strCadena = "Universidad Tecnica";
        System.out.print("Ingrese un caracter: ");
        char caracter = tcl.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < strCadena.length(); i++) {
            if (strCadena.charAt(i) == caracter) {
                contador++;
            }
        }
        System.out.println("El caracter se repite: " + contador);
    }
}
