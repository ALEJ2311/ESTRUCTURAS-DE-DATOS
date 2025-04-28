
import java.util.Scanner;




/**
 *
 * @author Personal
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese 10 numeros para un arreglo: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = tcl.nextInt();
        }
        
        int max = numeros[0];
        int min = numeros[0];
        System.out.println("El valor maximo es: " + valorMaximo(numeros, max));
        System.out.println("El valor minimo es: " + valorMinimo(numeros, min));
        int arregloInvert[] = arregloInvert(numeros);
        System.out.println("ARREGLO INVERTIDO: ");
        for (int i = 0; i < arregloInvert.length; i++) {
            System.out.print(arregloInvert[i] + ", ");
        }
        System.out.println("");
        System.out.println(arregloInvert.length);
    }
    
    public static int valorMaximo(int numeros[], int max){
        for (int i = 0; i < numeros.length; i++) {
            if(max < numeros[i]){
                max = numeros[i];
            }
        }
        return max;
    }
    
    public static int valorMinimo(int numeros[], int min){
        for (int i = 0; i < numeros.length; i++) {
            if(min > numeros[i]){
                min = numeros[i];
            }
        }
        return min;
    }
    
    public static int[] arregloInvert(int numeros[]){
        int arregloInvert[] = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            arregloInvert[i] = numeros[numeros.length - i - 1];
        }
        return arregloInvert;
    }
}
