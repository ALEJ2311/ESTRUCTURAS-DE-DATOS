
//VER UNA FORMA DE OPTIMIZAR ESTE CODIGO, ES DECIR MEJORARLO

/**
 *
 * @author ALEJ2311
 */
public class Recursividad_Ejercicio3 {

    public static void main(String[] args) {
        int n = 3;
        multiplo(n);
    }

    public static void multiplo(int n) {
        if (n < 30) {
            System.out.println(n);
            multiplo(n + 3);
        }
    }
}
