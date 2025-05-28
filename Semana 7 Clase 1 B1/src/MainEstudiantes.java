
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class MainEstudiantes {

    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0;
        System.out.println("BIENVENIDO!!");
        System.out.println("Ingrese el numero de estudiantes: ");
        num = tcl.nextInt();
        Estudiantes[] estudiantes = new Estudiantes[num];
        boolean bandera = true;
        int contador = 0;
        while (bandera) {
            System.out.println("---MENU DE REGISTRO DE ESTUDIANTES---");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Mostrar todos los estudiantes");
            System.out.println("3. Buscar estudiantes por nombre");
            System.out.println("4. Modificar estudiante");
            System.out.println("5. Eliminar estudiante");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opcion:");
            int opcion = tcl.nextInt();
            switch (opcion) {
                case 1:
                    if (contador < estudiantes.length) {
                        estudiantes[contador] = ingrEstudiantes();
                        contador++;
                    } else {
                        System.out.println("No se pueden agregar mas estudiantes");
                        System.out.println("--------------------------------");
                    }
                    break;
                case 2:
                    System.out.println("---Lista de Estudiantes---");
                    for (int i = 0; i < estudiantes.length; i++) {
                        if (estudiantes[i] != null) {
                            estudiantes[i].mostrarDatos();
                        }
                    }
                    break;
                case 3:
                    buscarEstu(estudiantes);
                    break;
                case 4:
                    modifiEstu(estudiantes);
                    break;
                case 5:
                    eliminaEstu(estudiantes);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion no valida!!");
            }
        }

    }

    public static Estudiantes ingrEstudiantes() {
        tcl.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombre = tcl.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = tcl.nextInt();
        tcl.nextLine();
        System.out.println("Ingrese la carrera: ");
        String carrera = tcl.nextLine();
        System.out.println("Ingrese el promedio: ");
        double promedio = tcl.nextDouble();
        System.out.println("--------------------------------");
        return new Estudiantes(nombre, edad, carrera, promedio);
    }

    public static void buscarEstu(Estudiantes[] estudiantes) {
        boolean buscar = false;
        System.out.println("Ingrese el nombre del estudiante a buscar:");
        tcl.nextLine();
        String estuBus = tcl.nextLine();
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null && estudiantes[i].getNombre().equalsIgnoreCase(estuBus)) {
                System.out.println("Encontrado:");
                System.out.println("--------------------------------");
                estudiantes[i].mostrarDatos();
                buscar = true;
                break;
            }
        }
        if (!buscar) {
            System.out.println("No encontrado");
        }
    }

    public static void modifiEstu(Estudiantes[] estudiantes) {
        boolean encontrado = false;
        System.out.println("Ingrese el nombre del estudiante que desea modificar:");
        tcl.nextLine();
        String nomModi = tcl.nextLine();
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null && estudiantes[i].getNombre().equalsIgnoreCase(nomModi)) {
                System.out.println("Que desea modificar del estudiante?");
                System.out.println("1. Nombre");
                System.out.println("2. Edad");
                System.out.println("3. Carrera");
                System.out.println("4. Promedio:");
                System.out.println("Ingrese una opcion:");
                int modi = tcl.nextInt();
                tcl.nextLine();
                switch (modi) {
                    case 1:
                        System.out.println("Ingrese nuevo nombre:");
                        String nNombre = tcl.nextLine();
                        estudiantes[i].setNombre(nNombre);
                        break;
                    case 2:
                        System.out.println("Ingrese nueva edad:");
                        int nEdad = tcl.nextInt();
                        estudiantes[i].setEdad(nEdad);
                        break;
                    case 3:
                        System.out.println("Ingrese nueva carrera:");
                        String nCarre = tcl.nextLine();
                        estudiantes[i].setCarrera(nCarre);
                        break;
                    case 4:
                        tcl.nextLine();
                        System.out.println("Ingrese nuevo promedio:");
                        double npromedio = tcl.nextDouble();
                        estudiantes[i].setPromedio(npromedio);
                        break;
                    default:
                        System.out.println("Opcion incorrecta!!");
                }
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado");
        }
    }

    public static void eliminaEstu(Estudiantes[] estudiantes) {
        tcl.nextLine();
        boolean eliminado = false;
        System.out.println("Ingrese el nombre del estudiante que desea elminar: ");
        String estuElimi = tcl.nextLine();
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null && estudiantes[i].getNombre().equalsIgnoreCase(estuElimi)) {
                estudiantes[i] = null;
                System.out.println("Eliminado correctamente!!");
                eliminado = true;
                break;
            }
        }
        if (!eliminado) {
            System.out.println("Estudiante no encontrado");
        }
    }

}
