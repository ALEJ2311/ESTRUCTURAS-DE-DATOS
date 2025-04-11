/***
 * Dada una cadena previa, determinar si está cadena es un Palíndromo.
 * Ej: cadena=“Anita lava la tina”
 * Salida ;  Si es (o No es si no se cumple)
 * @author USUARIO
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        String strCadena = "Anita lava la tina";
        if (esPalindromo(strCadena)) {
            System.out.println("Si es");
        } else {
            System.out.println("No es");
        }
    }

    public static boolean esPalindromo(String strCadena) {
        strCadena = strCadena.toLowerCase();
        strCadena = strCadena.replace(" ", "");
        int a = 0;
        int b = strCadena.length() - 1;
        for (int i = 0; i < strCadena.length(); i++) {
            if (strCadena.charAt(a) == strCadena.charAt(b)) {
                a++;
                b--;
            } else {
                return false;
            }
        }
        return true;
    }
}
