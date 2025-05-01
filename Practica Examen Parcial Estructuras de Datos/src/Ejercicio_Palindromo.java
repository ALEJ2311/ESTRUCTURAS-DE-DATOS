
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Ejercicio_Palindromo {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String palabra;
        System.out.print("Ingrese una palabra que sea Palindroma: ");
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
        int a = 0;
        int b = palabra.length() -1;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(a) == palabra.charAt(b)) {
                a++;
                b--;
            }else{
                return false;
            }
        }
        return true;
    }
}
