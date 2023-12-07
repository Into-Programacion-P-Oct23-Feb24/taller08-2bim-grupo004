/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double celcius;
        double fahrenheit;
        String cadenaFinal = "";
        
        for (fahrenheit = 20; fahrenheit <= 80; fahrenheit += 4) {
            celcius = (5/9.0) * (fahrenheit -32);
            cadenaFinal = String.format("%s %.2f",
                    cadenaFinal
                    ,celcius);
        }
        System.out.printf("%s\n", cadenaFinal);
        
    }
    
}
