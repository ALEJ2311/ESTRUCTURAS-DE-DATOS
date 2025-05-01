
import java.util.Scanner;


/**
 *
 * @author USUARIO
 */
public class Ejercicio_SerieFibonacci {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num = 0;
        System.out.print("Ingrese el limite de la serie Fibonacci: ");
        num = tcl.nextInt();
        fibonacci(num);
        
    }
    
    public static void fibonacci(int num){
        int t1 = 0;
        int t2 = 1;
        for (int i = 0; i < num; i++) {
            int suma = t1+t2;
            t1 = t2;
            t2 = suma;
            System.out.println(suma);
        }
        
    }
}
