/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea01recursividad;

import java.util.Scanner;

/**
 *
 * @author Cristofer
 */
public class Main {
    public static void main(String[] args) {
        
        
        Scanner e = new Scanner(System.in);
        int decimal;
        
        do { 
            System.out.println("Ingrese un número positivo");
            decimal= e.nextInt();
            
        } while (decimal<0);
        
        Binario(decimal);
     
    }
    public static void Binario(int  n){
        if (n < 2) {
            System.out.println(n);  
        }
        else{
            Binario(n/2);
            System.out.println(n %2);
        }
    }
    
}
