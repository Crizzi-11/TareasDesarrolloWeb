
import java.util.Scanner;

/**
 *
 * @author Cristofer
 */ 
public class Main {

    public static void main(String[] args) {
        Recursividad MRecursividad = new Recursividad();
        MRecursividad.Binario(10);
        Scanner e = new Scanner(System.in);
        int decimal;

        do {
            System.out.println("Ingrese un número positivo");
            decimal = e.nextInt();

        } while (decimal < 0);

        MRecursividad.Binario(decimal);
        
        

    }

    

}
