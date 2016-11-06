/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author Ricky
 */
public class Boletin9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Ejercicio 2
        int num1 = (int) (Math.random()*90+10);
        int num2 = (int) (Math.random()*90+10);
        
        int suma = num1 + num2;
        int producto = num1 * num2;
        
        System.out.println("Numero1 es: " + num1 + " y Numero2 es: " + num2);
        System.out.println("Suma = " +suma);
        System.out.println("Producto = " +producto);
    }
    
}
