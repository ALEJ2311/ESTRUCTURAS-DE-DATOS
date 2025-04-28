
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Parte1 {
    public static void main(String[] args) {
        int numero;
        String palabra;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el límite de la serie fibonacci: ");
        numero = tcl.nextInt();
        for (int i = 0; i < numero; i++) {
            System.out.println(serieFibonacci(i));
        }
        
        System.out.print("Ingrese una palabra la cual usted crea que es Palindromo: ");
        palabra = tcl.next();
        
        if (!Palindromo(palabra)) {
            System.out.println("La palabra ingresada no es un Palindromo");
        }else{
            System.out.println("La palabra ingresada es un Palindromo");
        }
        
    }
    
    public static int serieFibonacci(int numero){
        if (numero == 0 || numero == 1) {
            return numero;
        }else{
            return serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
        }
    }
    
    public static boolean Palindromo(String palabra) {
        palabra = palabra.toLowerCase();
        if (palabra.length() <= 1) {
            return true;
        }
        
        char primero = palabra.charAt(0);
        char ultimo = palabra.charAt(palabra.length() - 1);
        
        if (primero != ultimo) {
            return false;
        }
        
        return Palindromo(palabra.substring(1, palabra.length() - 1));
    }   
}
