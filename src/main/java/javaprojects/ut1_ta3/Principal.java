/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package javaprojects.ut1_ta3;

import java.io.IOException;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) throws IOException {
        String texto = "Hola_Mundo    Buenas_tardes   111    32";

        System.out.println(ContadorDePalabras.contarPalabra(texto));
        System.out.println();
        System.out.println(ContadorDePalabras.contadorVocalesConsonantes(texto).toCharArray());
        System.out.println();
        System.out.println(ContadorDePalabras.largoPalabras(texto, 6));
        System.out.println();
        System.out.println(Arrays.toString(ContadorDePalabras.obtenerLineas("C:\\Users\\gonza\\OneDrive\\Escritorio\\Algoritmos y Estructuras de datos\\UT1_TA3\\src\\main\\java\\javaprojects\\ut1_ta3\\UT1_TA3_ARCHIVO_EJEMPLO.txt")));
        System.out.println();
        System.out.println(ContadorDePalabras.cantPalabras(ContadorDePalabras.obtenerLineas("C:\\Users\\gonza\\OneDrive\\Escritorio\\Algoritmos y Estructuras de datos\\UT1_TA3\\src\\main\\java\\javaprojects\\ut1_ta3\\UT1_TA3_ARCHIVO_EJEMPLO.txt")));
    }
}
