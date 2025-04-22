
/**
 *
 * @author utpl
 */
public class Recursividad_Ejercicio4 {
    public static void main(String[] args) {
        int num = 1;
        int n = 5;
        int f = factorialProf(n);
        factorial(n, num);
        System.out.println(f);
        System.out.println("Fin");        
    }

    public static int factorialProf(int n) {       
        if (n == 0) {
            
          return 1;
          
        }else{
            
            return (n * factorialProf(n-1));
        }
    }
    
    public static void factorial(int n, int num){
        num = num * n;
        if (n > 1) {
            factorial(n - 1, num);
        }
        
        if(n == 1){
            System.out.println(num);
        }
    }
}
