/***
 * Dada una cadena inicial, imprimirla en pantalla de forma que por cada nueva línea se elimine el primer y último carácter de la nueva cadena.
Ej: cadena=“Universidad”
Salida ;   Universidad
                              niversida

                               iversid

                               versi

                               ers

                               r
 * @author USUARIO
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        String cadena = "Universidad";

        while (cadena.length() > 0) {
            System.out.println(cadena);

            if (cadena.length() <= 2) {
                break;
            }

            cadena = cadena.substring(1, cadena.length() - 1);
        }
    }
}
