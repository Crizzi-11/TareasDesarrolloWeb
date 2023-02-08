
package sumadenumeros;

/**
 *
 * @author Cristofer
 */
public class Recursividad {
    
    public  int SumaRecursiva(int n){
        int res;
        if (n == 1) {
            return 1;            
        }else{
            res = n + SumaRecursiva(n - 1);
        }
        return res;
    }
    
    
}
