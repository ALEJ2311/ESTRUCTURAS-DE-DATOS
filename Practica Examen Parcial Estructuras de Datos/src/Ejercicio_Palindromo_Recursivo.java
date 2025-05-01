
import java.util.Scanner;


public class Ejercicio_Palindromo_Recursivo {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String palabra;
        System.out.print("Ingrese una palabra que crea que es un Palindromo: ");
        palabra = tcl.nextLine();
        if (esPalindromo(palabra)) {
            System.out.println("Si es");
        }else{
            System.out.println("No es");
        }
    }
    
    public static boolean esPalindromo(String palabra){
        palabra = palabra.toLowerCase();
        palabra = palabra.replace(" ", "");
        char a = palabra.charAt(0);
        char b = palabra.charAt(palabra.length() - 1);
        
        if (palabra.length() <= 1) {
            return true;
        }
        
        if (a != b) {
            return false;
        }
        
        return esPalindromo(palabra.substring(1, palabra.length()- 1));
    }
}
