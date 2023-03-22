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
                System.out.println(palabra.toCharArray()[i]);
                System.out.println(palabra.toCharArray()[i+1]);
                contadorPalabra += 1;
            }
        }
        if (palabra!=""){
            return contadorPalabra += 1;
        } else {
            return 0;
        }
           
        
    }
}
