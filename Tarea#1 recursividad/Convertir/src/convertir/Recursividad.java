package convertir;

/**
 *
 * @author Cristofer
 */



public class Recursividad {
    
    
    //Metodo con ciclos
    public double Exponencial(int n,int x){
        double resultado = 0;
        for (int i = 0; i < n; i++){
            resultado = resultado+(Math.pow(x, i) / Factorial(i));
        }
        return resultado; 
    }
    
    public  double Factorial(int num){
    double resultado = 1;
        for (int i = 0; i <= num; i++) {
            resultado = resultado * i;
        }
        return resultado;
    } 
    
    //Metodo recursivo
    
    public double fac(int n){
        if (n == 0) {
            return 1;
        }
        else{
        return n*fac(n-1);}
    }
    
    public  double Expo(int base, int exponente){
        if(exponente==0){
            return 1;
        } else if (exponente<0) {
            return Expo(base, exponente +1) / base;
        } else {
            return base * Expo(base, exponente-1);
        }
    }
}


    
    

