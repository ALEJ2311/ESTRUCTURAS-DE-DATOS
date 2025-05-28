
import java.util.Scanner;


public class Arreglos_Bidimensionales {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int a = 0;
        System.out.print("Ingrese un numero para la matriz cuadrada: ");
        a = tcl.nextInt();
        int arreglo[][] = new int [a][a];
        int traspuesta[][] = new int [a][a];
        int multiplicacion[][] = new int [a][a];
        leerArreglo(arreglo);
        System.out.println("Matriz Original:");
        presentarArreglo(arreglo);
        System.out.println("");
        traspasar(arreglo, traspuesta);
        traspuesta(traspuesta);
        System.out.println("Matriz Traspuesta: ");
        presentarArreglo(traspuesta);
        System.out.println("Multiplicacion de matrices: ");
        multipliacarMatrices(arreglo, traspuesta, multiplicacion);
        presentarArreglo(multiplicacion);
    }
    public static void leerArreglo(int arreglo[][]){      
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                arreglo[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    
    public static void presentarArreglo(int arreglo[][]){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                System.out.print(arreglo[i][j] + "  ");
            }
            System.out.println("");
        }
    }
    
    public static void traspasar(int arreglo[][], int traspuesta[][]){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                traspuesta[i][j] = arreglo[i][j];
            }
        }
    }
    
    public static void traspuesta(int traspuesta[][]){
        int aux;
        for (int i = 0; i < traspuesta.length - 1; i++) {
            for (int j = i+1; j < traspuesta[0].length; j++) {
                aux = traspuesta[i][j];
                traspuesta[i][j] = traspuesta[j][i];
                traspuesta[j][i] = aux;
            }
        }
    }
    
    public static void multipliacarMatrices(int arreglo[][], int traspuesta[][], int multiplicacion[][]){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                multiplicacion[i][j] = arreglo[i][j] * traspuesta[i][j];
             }
        }
    }
}
