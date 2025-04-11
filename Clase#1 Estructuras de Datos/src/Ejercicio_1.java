
/**
 * Leer una cadena por teclado e imprimirla carácter por carácter, separada por un espacio.
 * Ej: cadena=“Universidad Técnica”
 * Salida ; U n i v e r s i d a d T é c n i c a
 *
 * @author ALEJ2311
 */
import java.util.Scanner;
public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String strPalabra;
        System.out.print("Ingrese nombre de la Universidad: ");
        strPalabra = tcl.nextLine();
        for (int i = 0; i < strPalabra.length(); i++) {
            System.out.print(strPalabra.charAt(i) + " ");
        }
    }
}
