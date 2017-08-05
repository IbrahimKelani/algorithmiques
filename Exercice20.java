package com.afpa.java.exos;

import java.util.Arrays;

/**
 * <@Todo>      - Compter le nombre d'occurrences de chaque lettre dans une chaine.
 * <@className> - Exercice20.java
 * <@author>    - ibrahimkelani
 * <@date>      - 7/30/17
 * <@time>      - 12:12 AM
 */
public class Exercice20 {

    public static void main(String[] args) {
        String string = "abbb!";
        char[] tabCaracteres = new char[string.length()];
        int[] tabCaractereOccurrence = new int[string.length()];

        // display original string
        System.out.printf("Chaine de caracteres de départ: \"%s\"", string);


        int positionLettrePresente = 0;
        int positionNouvelleLettre = 0;

        // Parcours de la chaine
        for (int counter = 0; counter < string.length(); counter++) {

            for (int positionCaractere = 0; positionCaractere <= positionNouvelleLettre; positionCaractere++) {
/*
                if (counter == 0 && positionCaractere == 0) {
                    tabCaracteres[counter] = string.charAt(counter);
                 //   tabCaractereOccurrence[0]++;
                }
*/
                if (string.charAt(counter) == tabCaracteres[positionCaractere]){
                    positionLettrePresente = positionCaractere;
                    tabCaractereOccurrence[positionLettrePresente]++;
                }  else {

                    if (counter == 0) {
                        tabCaracteres[positionNouvelleLettre] = string.charAt(counter);
                        tabCaractereOccurrence[positionNouvelleLettre]++;
                    } else {
                        positionNouvelleLettre = positionLettrePresente + 1;
                        tabCaracteres[positionNouvelleLettre] = string.charAt(counter);
                        tabCaractereOccurrence[positionNouvelleLettre]++;
                        positionCaractere = positionLettrePresente;
                    // positionNouvelleLettre += 1;
                    }
                }
            }
        }
        // display the final string with occurence of a letter counted

        System.out.printf("\n%s\n", Arrays.toString(tabCaracteres));
        System.out.printf("%s\n", Arrays.toString(tabCaractereOccurrence));


    }
/*
    // method presenceLettre checks whether a letter exists in a string. If it does, then returns its occurence
    private static int presenceLettre(String string, char carcateres) {
        int occurence = 0;

        if (string == null) {
            return -1;
        }

        // Boucle pour parcourir la chaine à la recherche d'un caractere précis
        for (int counter = 0; counter < string.length(); counter++) {

            if (string.charAt(counter) == lettreRecherchee) {
                ++occurence;
            }

        }
        return occurence;
    }
*/
}
