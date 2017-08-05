package com.afpa.java.exos;

/**
 * <@Todo>       - Supprimer toutes les occurrences d'une lettre dans une chaîne de caractères.
 * <@className> - Exercice18.java
 * <@author>    - ibrahimkelani
 * <@date>      - 7/29/17
 * <@time>      - 11:00 PM
 */

public class Exercice18 {
    public static void main(String[] args) {
        String string = "Je vous salue Marie!";
        char occurence = 'a';

        // display original string
        System.out.printf("Chaine de caracteres de départ: \"%s\"", string);

        // Using method occurenceReplacement
        string = occurenceReplacementWithNull(string, occurence);

        // display the final string with occurence of a letter replaced
        System.out.printf("\nChaine de caracteres avec occurence '%c' supprimée est: \"%s\"",
                occurence, string);


    }

    private static String occurenceReplacementWithNull(String string, char occurence) {

        if (string == null)
            return null;

        char[] chars = new char[string.length()];

        for (int position = 0; position < string.length(); position++) {
            if (string.charAt(position) == occurence) {
                chars[position] = '\0';
            } else {
                chars[position] = string.charAt(position);
            }
        }

        return String.valueOf(chars);
    }
}
