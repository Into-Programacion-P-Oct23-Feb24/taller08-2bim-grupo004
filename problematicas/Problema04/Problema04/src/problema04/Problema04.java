/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author LAB.ELECT
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int lineas = 5;
           
           for (int i = 1; i <= lineas; i++){
               for (int g = 1; g <= i; g++){
               System.out.print("*");
               }
               System.out.println("");
           }
            for (int i = lineas - 1; i >= 1; i--){
               for (int g = 1; g <= i; g++){
               System.out.print("*");
               }
               System.out.println("");
           }
        
    }
    
}
