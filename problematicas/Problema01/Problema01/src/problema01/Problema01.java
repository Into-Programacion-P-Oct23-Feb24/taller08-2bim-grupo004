/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String nombre;
        String posicion;
        String cadenaEdad = "";
        int edad;
        double estatura;
        int sumaEdades = 0;
        double sumaEstaturas = 0;
        int contador;
        double promedioEdad;
        double promedioEstatura;
        int limite;
        System.out.println("Ingrese la catidad de jugadores");
        limite = entrada.nextInt();
        for (contador = 1; contador <= limite; contador++) {
            System.out.println("Ingrese el nombre del jugador: ");
            entrada.nextLine();
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición del jugador: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador: ");
            estatura = entrada.nextDouble();
            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            cadenaReporte = String.format("%s%d. %s -%s-, edad %d,"
                    + " estatura %.2f\n",
                    cadenaReporte,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);
            cadenaEdad = String.format("%s%d ", cadenaEdad, edad);
        }
        promedioEdad = (double) sumaEdades / limite;
        promedioEstatura = (double) sumaEstaturas / limite;
        cadenaReporte = String.format("Listado de Jugadores\n%sListado de "
                + "Edades %s\nPromedio de edades: %.1f Promedio de estaturas: "
                + "%.2f\n",
                cadenaReporte,
                cadenaEdad,
                promedioEdad,
                promedioEstatura);
        System.out.printf("%s\n", cadenaReporte);
    }

}
