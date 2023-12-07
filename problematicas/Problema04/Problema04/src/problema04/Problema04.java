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
       int contador;
        String cadena = "";
        String cadenaFinal = "";
        String cadenaFi = "";
        for (contador = 1; contador <= 5; contador++){
            cadena = String.format("%s*",cadena);
            cadenaFinal = String.format("%s%s\n",cadenaFinal,cadena);
        }
        cadena = "";
        for (contador = 1; contador <= 5; contador++){
            cadena = String.format("%s*",cadena);
            cadenaFi = String.format("%s\n%s",cadena,
                   cadenaFi);
        }
        System.out.printf("%s%s",cadenaFinal,cadenaFi);
    }
        
  }
    

