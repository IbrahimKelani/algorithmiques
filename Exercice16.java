package com.afpa.java.exos;

import java.util.Arrays;

/**
 * <@Todo>       - Remplacer tous les caractères d'une chaîne par une '*'.
 * <@className> - Exercice16.java
 * <@author>    - ibrahimkelani
 * <@date>      - 7/28/17
 * <@time>      - 12:07 AM
 */
public class Exercice16 {
    public static void main(String[] args) {

        String charString = "Le langage JAVA, c'est trop OUUUUFFF!";
        char[] charactere = new char[charString.length()];

        for (int counter = 0; counter < charString.length() ; counter++) {
            charactere[counter] = '*';
        }

        charString = Arrays.toString(charactere);

        for (char c : charactere) {
            System.out.print(c);
        }

    }
}
