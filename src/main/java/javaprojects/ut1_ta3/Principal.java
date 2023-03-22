/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package javaprojects.ut1_ta3;

import java.util.Arrays;

/**
 *
 * @author zhynk
 */
public class Principal {

    public static void main(String[] args) {
        String texto = "Hay una dama que está segura que todo lo que brilla es oro \n"
                + "Y ella compra una escalera al cielo. \n"
                + "Cuándo ella llega a allí ella sabe, que las tiendas se cierran \n"
                + "Con una palabra ella puede obtener lo que ella vino a hacer. \n"
                + "Ooh, ooh, y ella compra una escalera al cielo. \n"
                + "Si hay una bulla en su seto vivo, no es alarmado ahora, \n"
                + "Es apenas una primavera limpia para la reina de mayo. \n"
                + "Sí, hay dos senderos que usted puede ir por, pero \n"
                + "hay a largo plazo todavía tiempo de cambiar el camino \n"
                + "que usted está en. Y me hace me pregunto. \n"
                + "Hay un signo en la pared pero ella quieren estar segura \n"
                + "que a veces que palabras tienen dos significados. \n"
                + "En un árbol por el arroyo, hay un \n"
                + "pájaro cantor que dice, \n"
                + "A Veces todos nuestros pensamientos nos hacen dudar. \n"
                + "Ooh, hace que me pregunte, \n"
                + "Ooh, hace que me pregunte. \n"
                + "Hay un sentimiento que obtengo cuando miro al oeste, \n"
                + "Y mi espíritu llora para salir. \n"
                + "En mis pensamientos yo he visto los anillos del humo por los \n"
                + "árboles, \n"
                + "Y por las voces de los que se paran mirar. \n"
                + "Ooh, que me hace preguntar, \n"
                + "Ooh, realmente me hace preguntar. \n"
                + "Y se comenta que pronto todos escucharemos el aire \n"
                + "Entonces el flautista nos dirigirá a pensar. \n"
                + "Y un día nuevo amanecerá para \n"
                + "los que se detienen mucho tiempo \n"
                + "Y los bosques resonarán con la risa. \n"
                + "Si hay un ruido en su seto vivo, no te alarmes ahora, \n"
                + "Es apenas una primavera limpia para la reina de mayo. \n"
                + "Sí, hay dos senderos por los que puedes ir, \n"
                + "pero hay a largo plazo \n"
                + "y todavia puedes cambiar el camino en el que vas. \n"
                + "Y hace que me pregunte. \n"
                + "La cabeza tararea y no irá, en caso de que no sepas, \n"
                + "El flautista es el llamamiento que te unira, \n"
                + "Estimada dama, puede oir el golpe de viento, \n"
                + "y le hizo saber \n"
                + "Sus mentiras en la escalera del vciento. \n"
                + "Y cuando enrollamos bajo el camino \n"
                + "Nuestras sombras más altas que nuestra alma. \n"
                + "Allí anda una dama que \n"
                + "todos saben \n"
                + "Que hace brillar la luz y las necesidades blancas para mostrar \n"
                + "Cómo si todavía estuviera con oro. \n"
                + "Y si usted escucha muy duramente \n"
                + "El aire vendrá a usted por fin. Cuándo todo es uno \n"
                + "y todo es una piedra y no arrollar. ";
        
        String texto2 = "Hola buenas";

        System.out.println(ContadorDePalabras.contarPalabra(texto2));
        System.out.println(Arrays.toString(ContadorDePalabras.contadorVocalesConsonantes(texto2)));
    }
}
