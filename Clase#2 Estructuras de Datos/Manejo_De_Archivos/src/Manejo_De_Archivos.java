import java.io.File;  //Importa la calse File para manipular archivos
import java.io.FileWriter; //Importa FileWriter para escribir en archivos
import java.io.PrintWriter;  //Importa PrintWriter para escribir lineas de 
import java.util.Scanner; // Importa Scanner para leer datos desde el teclado

public class Manejo_De_Archivos {

    public static void main(String[] args) {
        // Crea un objeto Scanner para leer desde consola
        Scanner entrada = new Scanner(System.in);
        // Declara el archivo de salida
        File archivo = new File("usuarios.txt");

        try {
            //Verifica si el archivo exsiste , si no lo crea
            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            boolean continuar = true;

            while (continuar) {
                System.out.println("Ingrese nombre: ");
                String nombre = entrada.nextLine();

                System.out.println("Ingrese correo: ");
                String correo = entrada.nextLine();

                System.out.println("Ingrese dirección: ");
                String direccion = entrada.nextLine();

                // Escribir en el archivo (dentro del ciclo)
                try (FileWriter escribir = new FileWriter(archivo, true); PrintWriter linea = new PrintWriter(escribir)) {

                    linea.println("Nombre: " + nombre);
                    linea.println("Correo: " + correo);
                    linea.println("Dirección: " + direccion);
                    linea.println("----------------------------------");
                }

                System.out.println("¿Desea continuar con mas datos para más usuarios? (si/no): ");
                String decision = entrada.nextLine();

                if (decision.equalsIgnoreCase("no")) {
                    continuar = false;
                } else if (!decision.equalsIgnoreCase("si")) {
                    System.out.println("Respuesta no reconocida. Terminando programa por precaución.");
                    continuar = false;
                }
            }

            System.out.println("Proceso finalizado. Datos guardados correctamente.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
        } finally {
            entrada.close();
        }
    }
}
