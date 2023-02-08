/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristofer
 */
public class Recursividad {
    
    public  void Binario(int n) {
        if (n < 2) {
            System.out.println(n);
        } else {
            Binario(n / 2);
            System.out.println(n % 2);
        }
    }
    
}
