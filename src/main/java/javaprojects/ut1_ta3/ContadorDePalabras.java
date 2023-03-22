/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojects.ut1_ta3;

/**
 *
 * @author zhynk
 */
public class ContadorDePalabras {
    public static int contarPalabra(String palabra){
        int contadorPalabra = 0;
        palabra = palabra.trim();
        for (int i = 0; i < palabra.length() - 1; i++){
            if ((Character.isDigit(palabra.toCharArray()[i]) || Character.isLetter(palabra.toCharArray()[i])) && 
                    !(Character.isDigit(palabra.toCharArray()[i+1]) || Character.isLetter(palabra.toCharArray()[i+1]))){
                contadorPalabra += 1;
            }
        }
        if (palabra!=""){
            return contadorPalabra += 1;
        } else {
            return 0;
        }
    }
    
    public static int[] contadorVocalesConsonantes(String word){ 
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
        int[] totalCounter = {vocalCount, consonantCount};
        return totalCounter;
    } 
}
