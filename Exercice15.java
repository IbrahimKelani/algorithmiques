package com.afpa.java.exos;


import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * <@Todo>       - Inverser une chaîne de caractères (sans supprimer l'originale).
 * <@className> - Exercice15.java
 * <@author>    - ibrahimkelani
 * <@date>      - 7/28/17
 * <@time>      - 12:07 AM
 */
public class Exercice15 {
    public static void main(String[] args) {

        String charString = "Je suis fan de Java";

        String string = "Le langage Java est très utilisé dans plusieurs secteurs de développement";

        // Using method reverseString
        System.out.printf("Chaine de carcateres de départ: \"%s\"", charString);
        charString = reverseString(charString);

        // display the reversed string
        System.out.printf("\nChaine de carcateres inversée:  \"%s\"\n", charString);


        // Using Apache reverse method of StringUtils class
        System.out.printf("\nChaine de carcateres de départ: \"%s\"", string);
        string = StringUtils.reverse(string);

        // display the reversed string
        System.out.printf("\nChaine de carcateres inversée:  \"%s\"\n", string);
    }

    // method reverseString reverses a string
    private static String reverseString(String string) {
        if (string == null ) {
            return null;
        }

        char[] charcaterTab = new char[string.length()];

        for (int counter = 0; counter < string.length() ; counter++) {
            charcaterTab[counter] = string.charAt(string.length() - counter - 1);
        }

        return String.valueOf(charcaterTab);
    } // end method reverseString
}


