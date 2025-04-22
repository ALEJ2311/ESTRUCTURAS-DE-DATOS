
/**
 *
 * @author ALEJ2311
 */
public class Recursividad_Ejercicio2 {

    public static void main(String[] args) {
        PrintNum(4);
        System.out.println("Fin");
    }

    public static void PrintNum(int n) {
        System.out.println(n);
        if (n > 1) {
            metodoB(n - 1);
        }
        System.out.println(n);
    }

    public static void metodoB(int n) {
        PrintNum(n);

    }
}
