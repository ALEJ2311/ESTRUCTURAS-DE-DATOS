package tallerarchivos_estructuras_de_datos;

import java.io.*;
import java.util.Scanner;

public class TallerArchivos {

    static File archivo = new File("usuarios.txt");
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Registrar nuevo usuario");
            System.out.println("2. Mostrar registros");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    registrarUsuario();
                    break;
                case 2:
                    mostrarRegistros();
                    break;
                case 3:
                    busquedaNombre();
                    break;
                case 4:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }

    public static void registrarUsuario() {
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            System.out.print("Ingrese nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("Ingrese correo: ");
            String correo = entrada.nextLine();
            System.out.print("Ingrese dirección: ");
            String direccion = entrada.nextLine();

            FileWriter escribir = new FileWriter(archivo, true);
            PrintWriter linea = new PrintWriter(escribir);
            linea.println(nombre);
            linea.println(correo);
            linea.println(direccion);
            linea.close();

            System.out.println("Usuario registrado correctamente.\n");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        }
    }

    public static void mostrarRegistros() {
        try {
            if (!archivo.exists()) {
                System.out.println("No existen registros aún.\n");
                return;
            }

            FileReader leer = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(leer);
            String linea;

            System.out.println("\n===== LISTA DE USUARIOS =====");
            while ((linea = buffer.readLine()) != null) {
                String nombre = linea;
                String correo = buffer.readLine();
                String direccion = buffer.readLine();
                System.out.println("Nombre: " + nombre);
                System.out.println("Correo: " + correo);
                System.out.println("Dirección: " + direccion);
                System.out.println("-----------------------------");
            }

            buffer.close();
            leer.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }

    public static void busquedaNombre() {
        try {
            if (!archivo.exists()) {
                System.out.println("No existen registros aún.\n");
                return;
            }
            String nombreSearch;
            System.out.print("Ingrese el nombre del usuario: ");
            nombreSearch = entrada.nextLine();
            FileReader leer = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(leer);
            String linea;
            boolean encontrado = false;

            while ((linea = buffer.readLine()) != null) {
                String nombre = linea;
                String correo = buffer.readLine();
                String direccion = buffer.readLine();
                if (nombre.equalsIgnoreCase(nombreSearch)) {
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Correo: " + correo);
                    System.out.println("Dirección: " + direccion);
                    encontrado = true;
                    break;
                }

            }
            if (!encontrado) {
                System.out.println("Usuario Inexistente!!");
            }

            buffer.close();
            leer.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
