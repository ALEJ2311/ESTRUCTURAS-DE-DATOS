
import java.util.Scanner;

public class Celular {

    private String nombre;
    private String systemOP;

    // Constructor vacío
    public Celular() {
    }

    // Constructor con parámetros
    public Celular(String nombre, String systemOP) {
        this.nombre = nombre;
        this.systemOP = systemOP;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSystemOP() {
        return systemOP;
    }

    public void setSystemOP(String systemOP) {
        this.systemOP = systemOP;
    }

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        // Crear un arreglo de 4 objetos Celular
        Celular[] celulares = new Celular[4];

        for (int i = 0; i < celulares.length; i++) {
            celulares[i] = new Celular(); // Instanciar cada objeto
            System.out.println("INGRESE EL NOMBRE DEL CELULAR " + (i + 1) + ": ");
            String nombre = tcl.nextLine();
            celulares[i].setNombre(nombre);

            System.out.println("INGRESE EL SISTEMA OPERATIVO DEL CELULAR " + (i + 1) + ": ");
            String sistema = tcl.nextLine();
            celulares[i].setSystemOP(sistema);
        }
        //Buscar que significa quemar datos ingresados
        // Mostrar los datos ingresados
        System.out.println("\nDATOS DE LOS CELULARES INGRESADOS:");
        for (int i = 0; i < celulares.length; i++) {
            System.out.println("Celular " + (i + 1) + ": " +
                celulares[i].getNombre() + " - " + celulares[i].getSystemOP());
        }
    }
}
