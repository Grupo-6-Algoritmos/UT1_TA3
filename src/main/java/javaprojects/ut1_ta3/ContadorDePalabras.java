package javaprojects.ut1_ta3;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContadorDePalabras {
    /* El metodo contador de palabras lo que hace es que al recibir un string como paratro, lo recorremos con un bucle
for y observamos mediante una condicion dos lugares de la palabra a la vez, cuando el primer lugar chequea si es
una letra o un numero y el segundo si es un espacio, si sucede esto, sabemos que es una palabra, sin importar
cuantos espacios hay en el medio de la palabra. Respecto a la ultima palabra, por la posibilidad de que no tenga
espacios lo que hace es sumarle 1 palabra, solo si tiene contenido el string (no tiene solo espacios).
En el medio del metodo convertimos y usamos metodos como trim para que funcione adecuadamente el algoritmo.*/
    public static int contarPalabra(String palabra){
        int contadorPalabra = 0;
        palabra = palabra.trim();
        for (int i = 0; i < palabra.length() - 1; i++){
            if ((Character.isDigit(palabra.toCharArray()[i]) || Character.isLetter(palabra.toCharArray()[i])) && 
                    !(Character.isDigit(palabra.toCharArray()[i+1]) || Character.isLetter(palabra.toCharArray()[i+1]))){
                contadorPalabra += 1;
            }
        }
        if (!palabra.equals("")){
            return contadorPalabra += 1;
        } else {
            return 0;
        }
    }
    public static String contadorVocalesConsonantes(String word){
        Vocals vocals;
        word = word.trim();
        int vocalCount = 0;
        int consonantCount = 0;
        int spaceCount = 0;
        for(char letter: word.toUpperCase().toCharArray()){
            if (!(Character.isLetterOrDigit(letter))){
                spaceCount += 1;
            }
            for(Vocals vocal : Vocals.values()){
                if(vocal.name().charAt(0) == letter){
                    vocalCount += 1;
                }   
            } 
        }
        consonantCount = word.length() - vocalCount - spaceCount;
        return "Cnatidad de Vocales: " + vocalCount + "\n" + "Cantidad de Consonantes: " + consonantCount;
    }
    public static int largoPalabras(String palabra, int largo){
        palabra = palabra.trim();
        palabra += " ";
        int cantidadLetras = 0;
        int cantidadPalabras = 0;
        for(char letras : palabra.toCharArray()){
            if (Character.isLetterOrDigit(letras)){
                cantidadLetras += 1;
            } else {
                if (cantidadLetras == largo){
                    cantidadPalabras += 1;
                }
                cantidadLetras = 0;
            }
        }
        return cantidadPalabras;
    }
    public static String[] obtenerLineas(String archivo) throws IOException {
        List<String> lineas = new ArrayList<>();
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        String lineaActual;
        while ((lineaActual = lector.readLine()) != null) {
            lineas.add(lineaActual);
        }
        lector.close();
        return lineas.toArray(new String[0]);
    }
    public static int cantPalabras(String[] lineasArchivo) {
        return contarPalabra(Arrays.toString(lineasArchivo));
    }

}
