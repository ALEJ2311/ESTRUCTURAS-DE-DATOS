
import java.util.Scanner;


/**
 *
 * @author USUARIO
 */
public class Parte2 {
    public static void main(String[] args) {
        String movies[] = {"Titanic", "Cars", "Mupets", "Avengers", "Jurassic Park", "Avatar", "Minecraft", "Moana", "Toy Story", "Deadpool" };
        Scanner tcl = new Scanner(System.in);
        String pelicula;
        System.out.print("Ingrese el nombre de la pelicula que desea buscar: ");
        pelicula = tcl.nextLine();
        numeroPeli(movies, pelicula);
        
         for (int i = 0; i < movies.length - 1; i++) {
            for (int j = 0; j < movies.length - 1 - i; j++) {
                
                if (movies[j].compareToIgnoreCase(movies[j + 1]) > 0) {
                    
                    String temp = movies[j];
                    movies[j] = movies[j + 1];
                    movies[j + 1] = temp;
                }
            }
        }

        
        System.out.println("Películas favoritas ordenadas alfabéticamente:");
        for (String movie : movies) {
            System.out.println(movie);
        }
        
    }
    
    public static void numeroPeli(String movies[], String pelicula){
        boolean buscar = false;
        for (int i = 0; i < movies.length; i++) {
            if(pelicula.equalsIgnoreCase(movies[i])){
                System.out.println("La posicion de su pelicula es: " + (i+1));
                buscar = true;
                break;
            }
        }
        if(!buscar){
            System.out.println("Pelicula no encontrada");
        }
    }
}
