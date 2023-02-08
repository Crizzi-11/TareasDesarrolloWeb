
package tareavocal;

/**
 *
 * @author Cristofer
 */
public class TareaVocal {

    public static void main(String[] args) {
        Recursividad MRecursividad =new Recursividad();
        String oracion ="hoy como";
        char[] array = oracion.toCharArray();
        array = MRecursividad.Vocal(0, array);
        String sacar = String.valueOf(array);
        System.out.println(sacar);
        
    }
    
}
