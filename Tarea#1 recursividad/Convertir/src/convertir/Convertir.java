
package convertir;

/**
 *
 * @author Cristofer
 */
public class Convertir {

    public static void main(String[] args) {
       Recursividad mRecursividad = new Recursividad();
        System.out.println("======Metodo Normal========");
      double respuesta = mRecursividad.Factorial(8);
      double respuesta2 = mRecursividad.Exponencial(3, -5);
      System.out.println("EL exponencial es "+ respuesta2);
      System.out.println("EL Factorial es " + respuesta);
      
      System.out.println("======Metodo recursivo========");
      double facorial = mRecursividad.fac(8);
      System.out.println("El factorial de 8 es: "+facorial);
      double Exponencialr = mRecursividad.Expo(3, -5);
      System.out.println("El exponencial es:"+ Exponencialr);
      
    }
    
}
