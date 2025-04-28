
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el límite de la serie fibonacci: ");
        numero = tcl.nextInt();
        for (int i = 0; i < numero; i++) {
            System.out.println(serieFibonacci(i));
        }
        
    }
    
    public static int serieFibonacci(int numero){
        if (numero == 0 || numero == 1) {
            return numero;
        }else{
            return serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
        }
    }
    
}
