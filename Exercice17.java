package com.afpa.java.exos;

/**
 * Todo         - Remplacer toutes les occurrences d'une lettre par une autre dans une chaîne de caractères.
 * <@classname> - Exercice17.java
 * <@author>    - cdi310
 * <@date>      - 28/07/2017
 * <@time>      - 11:57
 */


public class Exercice17 {
    public static void main(String[] args) {

        String string = "Je vous salue Marie!";
        char occurence = 'a';
        char remplacement = 'p';

        // display original string
        System.out.printf("Chaine de caracteres de départ: \"%s\"", string);

        // Using method occurenceReplacement
        string = occurenceReplacement(string, occurence, remplacement);

        // display the final string with occurence of a letter replaced
        System.out.printf("\nChaine de caracteres avec occurence '%c' remplacée par '%c': \"%s\"",
                occurence, remplacement, string);

    }

    private static String occurenceReplacement(String string, char occurence, char remplacement) {

        if (string == null)
            return null;

        char[] chars = new char[string.length()];

        for (int position = 0; position < string.length(); position++) {
             if (string.charAt(position) == occurence) {
                 chars[position] = remplacement;
             } else {
                 chars[position] = string.charAt(position);
             }

        }

        return String.valueOf(chars);
    }
}


